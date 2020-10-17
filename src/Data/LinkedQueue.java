/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
/**
 *
 * @author ASUS PC
 * @param <T>
 */
public class LinkedQueue<T> {
    private Node<T> head, tail;
    
    public LinkedQueue(){
        this.tail = null;
        this.head = null;
    }
    
    public void enqueue(T data){
        //long t0 = System.currentTimeMillis();
        Node newp = new Node(data);
        if(head==null){
            head = newp;
            tail = newp;
        }
        else{
            tail.setNext(newp);
            tail = newp;
        }
        //long exTime = System.currentTimeMillis()-t0;
        //System.out.println("Tiempo de ejecución enqueue: " + exTime);
    }
    
    public T dequeue(){
        long t0 = System.currentTimeMillis();
        if(head == null){
            long exTime = System.currentTimeMillis()-t0;
            System.out.println("Tiempo de ejecución dequeue: " + exTime);
            return null;
        }else{
            T data = head.getData();
            head = head.getNext();
            long exTime = System.currentTimeMillis()-t0;
            System.out.println("Tiempo de ejecución dequeue: " + exTime);
            return data;
        }
    }
    
    public T peek(){
        if(head == null)
            return null;
        else{
            T data = head.getData();
            return data;
        }
    }
    public boolean empty(){
        return head == null;
    }

    public void imprimirTodos(){
        long t0 = System.currentTimeMillis();
        System.out.println("==================================================");
        System.out.println("           MASCOTAS EN EL REFUGIO");
        System.out.println("==================================================");
        Node nod = head;
        while((!this.empty()) && nod != null){
            System.out.println(nod.getData().toString());
            nod = nod.getNext();
        }
        long exTime = System.currentTimeMillis()-t0;
        System.out.println("Tiempo de ejecución imprimirTodos: " + exTime);
    }
}
