package Coursera.Week2.Beans;

public class Queue {
    Node front=null;
    Node rear=null;
    int capacity =0;

    public boolean isEmpty(){
        return capacity==0;
    }

    public void enqueue(String str){
        capacity++;

        Node n = new Node();
        n.item = str;

        if(rear==null){
            front= rear = n;
        }else{
            this.rear.next=n;
            this.rear = n;
        }
    }

    public String dequeue(){
        if(front==null){
            return null;
        }

        Node temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as NULL
        if (this.front == null){
            this.rear = null;
        }
        return temp.item;
    }

    public String peek(){
        return front.item;
    }

}
