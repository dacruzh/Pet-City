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
        if(isEmpty())
            throw new RuntimeException("Stack is empty");
        top--;
        return sArray[top];
    }
        
    public void push(T item){
        if (isFull())
            throw new RuntimeException("Stack is full");
        sArray[top] = item;
        top++;
        System.out.println("Usted ha sido correctamente registrado");
    }
    
    public T peek(){
        if(isEmpty())
            return null;
        return sArray[top-1];
    }
    public int find(T c1){
        int found = -1;
        for (int x = 0; x<top; x++){
            if (c1.equals(sArray[x])){
                found = x;
            }
        }
        return found;


    }
    public boolean eliminate(int posicion){
        for(int i=posicion;i<top;i++){
            sArray[i] = sArray[i+1];
        }
        top--;
        sArray[top] = null;
        return true;
    }
}
