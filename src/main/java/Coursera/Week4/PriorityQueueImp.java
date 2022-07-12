package Coursera.Week4;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueImp {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Random random = new Random();

        int itr = 100;

        while (itr>0){
            itr--;
            pq.add(random.nextInt(9000));
        }


        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
