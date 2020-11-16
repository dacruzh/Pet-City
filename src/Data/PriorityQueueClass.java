package Data;

public class PriorityQueueClass<T extends Comparable<T>> {
    private T[] array;
    public int size;

    public PriorityQueueClass(int n){   
        array = (T[])new Comparable[n];
      
        size=0;
    }
    public void insertItem(T x){
        array[size]=x;
        moveUp();
        size++;
    }
    private void moveUp(){
        int child=size;
        int parent=(child-1)/2;
        T temp=array[child];
        while(child>0&& temp.compareTo(array[parent])<0){
                array[child]=array[parent];
                child=parent;
                parent=(child-1)/2;
        } 
        array[child]=temp;
    }
    public T removeMin(){
        T min=array[0];
        array[0]=array[--size];
        moveDown(0);
        return min;   
     }
    public T remove(int i)
    {   if(array[i]!=null){
        T salida=array[i];
        array[i]=array[--size];
        moveDown(i);
        return salida;
    }
    else
    {
        return null;
    }
    }
    public T peek()
    {
        return array[0];
    }

    private void moveDown(int i ){
        
        boolean flag = false;
        T highest= null;
        int parent = i;
        int child = 2*parent+1;
        T temp = array[parent];
        while(child < size && !flag){
            highest = array[child];
            if(child+1 < size && array[child+1].compareTo(array[child])<0)
                highest = array[++child];
            if(highest.compareTo(temp)<0){
                array[parent] = highest;
                parent = child;
            }
            else
                flag = true;
            child = 2*parent+1;
        }
        array[parent] = temp;
    }
    
    public int find(T buscar)
    {  int encontrado =-1; 
         for (int i =0;i<size;i++)
        {if(array[i]!=null&&array[i].compareTo(buscar)==0)
            {
                encontrado =i;
                break;
            }
        }
        return encontrado;
    }

    public void imprimirTodos(){
    long t0 = System.currentTimeMillis();
        T[] arrayCopy = (T[])new Comparable[array.length];
        for(int i=0; i<size;i++)
            arrayCopy[i]=array[i];
    int sizec=size;
        while(size!=0)
        {
            System.out.println(this.removeMin());
           
        }
        size=sizec;
        for(int i=0; i<size;i++)
           array[i]=arrayCopy[i];
        
        long exTime = System.currentTimeMillis()-t0; //Comando al final del método
        System.out.println("Imprimir 10000 datos: " + exTime);
        
    }

        

}
