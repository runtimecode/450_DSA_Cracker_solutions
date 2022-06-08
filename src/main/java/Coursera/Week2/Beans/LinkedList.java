package Coursera.Week2.Beans;

public class LinkedList {

//    add
//    delete
//    find
//
    private Node first = null;

    public boolean isEmpty(){
        return first ==null;
    }

    public void push(String item){
        Node oldfist = first;
        first = new Node();
        first.item = item;
        first.next = oldfist;
    }

    public String pop(){
        String item = first.item;
        first = first.next;
        return item;
    }
}
