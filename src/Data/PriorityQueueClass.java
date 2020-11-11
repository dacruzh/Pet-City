package Data;

public class PriorityQueueClass<T> {
    private T[] array;
    private int size;

    public PriorityQueueClass(int n)
    {   array = (T[])new Object[n];
        size=0;
    }
    public void insertItem(T x)
    {array[size]=x;
        moveUp();
        size++;
    }
    private void moveUp()
    {
        int child=size;
        int parent=(child-1)/2;
        T temp=array[child];
        while(child>0&& temp.equals(array[parent])){
                array[child]=array[parent];
                child=parent;
                parent=(child-1)/2;
        } 
        array[child]=temp;
    }
    public T removeMax()
    {T max=array[0];
        array[0]=array[--size];
        moveDown();
        return max;
    }
    private void moveDown() {
        boolean flag = false;
        T highest= null;
        int parent = 0;
        int child = 2*parent+1;
        T temp = array[parent];
        while(child < size && !flag) {
            highest = array[child];
            if(child+1 < size && array[child].equals(array[child]))
                highest = array[++child];
            if(highest.equals(temp)) {
                array[parent] = highest;
                parent = child;
            }
            else
                flag = true;
            child = 2*parent+1;
        }
        array[parent] = temp;
    }
        

}
