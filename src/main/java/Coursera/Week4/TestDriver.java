package Coursera.Week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class TestDriver {

    public static void main(String[] args) {

        Integer[] nums = new Integer[1000];

        Random random = new Random();

        for(int i=0;i<1000;i++){
            nums[i] = random.nextInt(9000);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        Integer[] tempTest = {1,2,3,4,5,6};

        Arrays.stream(tempTest).forEach(integer -> {
            if(maxHeap.size()== minHeap.size()){

                if(minHeap.size()>0){
                    maxHeap.add(minHeap.poll());
                    minHeap.add(integer);
                }else{
                    maxHeap.add(integer);
                }
            }else if(maxHeap.size()>minHeap.size()){
                minHeap.add(integer);
            }else {
                maxHeap.add(integer);
            }
        });
    }
}
