package Coursera.Week2.StackAndQueues;

import Coursera.Week2.Beans.Queue;
import Coursera.Week2.Beans.QueueArray;

import java.util.Stack;

public class TestClass {

    public static void main(String[] args) {

//        Queue qa = new Queue();
//
//        for(int i=0;i<100;i++){
//            qa.enqueue("Test "+i);
//        }
//
//        for(int i=0;i<100;i++){
//            System.out.println(qa.dequeue());
//        }

//        Stack s = new Stack();
//        int i =0 ;
//        while(i<100){
//            i++;
//            s.push("test"+i);
//        }
//
//        QueueFromStack qs = new QueueFromStack(s);
//
//        while(qs.hasElement()){
//            System.out.println(qs.dequeue());
//        }

        Stack<Integer> s = new Stack<>();

        s.push(99);
        s.push(99);
        s.push(10);
        s.push(11);

        StackWithMax sm = new StackWithMax(s);

        System.out.println(sm.maxElement());

        sm.push(30);
        System.out.println(sm.maxElement());
        sm.push(31);
        System.out.println(sm.maxElement());
        sm.push(100);
        System.out.println(sm.maxElement());
        sm.push(100);
        System.out.println(sm.maxElement());
        while (sm.hasElement()){
            System.out.println("Poping "+sm.pop()+" then max element "+sm.maxElement());
        }
    }
}
