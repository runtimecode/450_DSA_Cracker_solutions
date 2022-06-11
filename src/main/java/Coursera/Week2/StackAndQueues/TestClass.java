package Coursera.Week2.StackAndQueues;

import Coursera.Week2.Beans.Queue;
import Coursera.Week2.Beans.QueueArray;
import Coursera.Week2.Beans.Stack;

public class TestClass {

    public static void main(String[] args) {

        Queue qa = new Queue();

        for(int i=0;i<100;i++){
            qa.enqueue("Test "+i);
        }

        for(int i=0;i<100;i++){
            System.out.println(qa.dequeue());
        }
    }
}
