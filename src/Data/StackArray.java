/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author ASUS PC
 */
public class StackArray<T>{
    private static final int N = 100;
    private int top;
    private T[] sArray;
        
    public StackArray(){
        this(N);
    }
        
    public StackArray(int n){
        top = 0;
        sArray = (T[])new Object[n];
    }
        
    public boolean isEmpty(){
        return top <= 0;

    }
        
    public boolean isFull(){
        return top >=sArray.length;
    }
        
    public T pop(){
        long t0 = System.currentTimeMillis();
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        top--;
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Tiempo de ejecución pop: " + exTime);
        return sArray[top];
    }
        
    public void push(T item){
        //long t0 = System.currentTimeMillis();
        if (isFull())
            throw new RuntimeException("Stack is full");
        sArray[top] = item;
        top++;
        //TODO quitar comentarios
        //System.out.println("Usted ha sido correctamente registrado");
        //long exTime = System.currentTimeMillis()-t0;
        //System.out.println("Tiempo de ejecución push: " + exTime);
    }
    
    public T peek(){
        if(isEmpty())
            return null;
        return sArray[top-1];
    }
    public int find(T c1){
        long t0 = System.currentTimeMillis();
        int found = -1;
        for (int x = 0; x<top; x++){
            if (c1.equals(sArray[x])){
                found = x;
            }
        }
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Tiempo de ejecución find: " + exTime);
        return found;


    }
    public boolean eliminate(int posicion){
        long t0 = System.currentTimeMillis();
        for(int i=posicion;i<top-1;i++){
            sArray[i] = sArray[i+1];
        }
        top--;
        sArray[top] = null;
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Tiempo de ejecución eliminate: " + exTime);
        return true;
    }
    
        public void imprimirTodos(){
        long t0 = System.currentTimeMillis();
        System.out.println("==================================================");
        System.out.println("           USUARIOS DEL REFUGIO");
        System.out.println("==================================================");
        for (int i = 0; i<top; i++){
            System.out.println(sArray[i].toString());
        }
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Tiempo de ejecución imprimirTodos: " + exTime);
    }
}
