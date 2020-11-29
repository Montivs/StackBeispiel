package Aufgabe35;

public class Stack<T> implements Stackable<T> {

    private Node head=null;
    private int counter = 0;


    private class Node{
        T data = null;
        Node next = null;
    }

    @Override
    public String push(T data) {
        Node memorizedHead = head;
        head = new Node();
        head.data = data;
        head.next = memorizedHead;
        counter++;
        return null;
    }

    @Override
    public T peek()  {


        return ((head == null) ? null : head.data);
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T retObj = head.data;
        head = head.next;
        counter--;
        return retObj;
    }

    @Override
    public boolean isEmplty()  {
        if(head == null){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack is not empty");
        }

        return head == null;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    @Override
    public void clear() {
        counter = 0;
        head = null; }
}
