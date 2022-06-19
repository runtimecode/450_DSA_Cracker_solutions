package DSA;

import DSA.Array.*;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class TestClass {

    public static void main(String[] args) {
        Random random = new Random();
        int testSize = 100;

        int[] arr = new int[testSize+1];

        while (testSize>=0){
            arr[testSize--]= random.nextInt(100);
        }
//
//        KthElement ra = new KthElement(arr);
//        System.out.println(ra.getKthElement(4));

        int[] temp = {1,2,3,4,5};
        CycalicallyRotateArray sr = new CycalicallyRotateArray(temp);
        Arrays.stream(sr.rotateInCycallically(2)).forEach(System.out::print);
    }
}
