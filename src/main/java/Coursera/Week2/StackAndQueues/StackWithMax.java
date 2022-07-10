package Coursera.Week2.StackAndQueues;

import java.util.Stack;

public class StackWithMax {

    private Stack<Integer> s= new Stack<>();
    private Stack<Integer> maxStack= new Stack<>();

    public StackWithMax(Stack<Integer> s){
        maxStack.push(-1);
        this.s = s;
        this.s.stream().forEach(integer -> {
            if(maxStack.peek()==integer){
                maxStack.push(integer);
            }else if(maxStack.peek()<integer){
                maxStack.push(integer);
            }
        });
        System.out.println("Swesome");
    }

    public void push(int a){
        if(a>=maxStack.peek()){
            maxStack.push(a);
        }
        s.push(a);
    }

    public Integer pop(){
        if(s.peek()==maxStack.peek()){
            maxStack.pop();
        }
        return s.pop();
    }

    public Integer peek(){
        return s.peek();
    }

    public Integer maxElement(){
        return maxStack.peek();
    }

    public boolean hasElement(){
        return !s.isEmpty();
    }

}
