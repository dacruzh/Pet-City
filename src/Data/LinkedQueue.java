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
        Node newp = new Node(data);
        if(head==null){
            head = newp;
            tail = newp;
        }
        else{
            tail.setNext(newp);
            tail = newp;
        }
    }
    
    public T dequeue(){
        if(head == null)
            return null;
        else{
            T data = head.getData();
            head = head.getNext();
            return data;
        }
    }
    
    public boolean empty(){
        return head == null;
    }
}
