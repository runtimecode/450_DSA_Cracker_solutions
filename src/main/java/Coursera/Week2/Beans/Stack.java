package Coursera.Week2.Beans;

public class Stack {

    Node first = null;

    public boolean isEmpty(){
        return first==null;
    }

    public void push(String str){
        Node oldfist = first;
        first = new Node();
        first.item = str;
        first.next = oldfist;
    }

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }

    public String peek(){
        return first.item;
    }

}
