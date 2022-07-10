package Coursera.Week2.StackAndQueues;

import Coursera.Week2.Beans.Stack;

public class QueueFromStack {

    private Stack s1;
    private Stack s2 = new Stack();

    public QueueFromStack(Stack s){
        this.s1 = s;
    }

    public void enqueue(String str){
        s1.push(str);
    }

    public String dequeue(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public String peek(){
        if(s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean hasElement(){
        return !(s1.isEmpty() && s2.isEmpty());
    }

}
