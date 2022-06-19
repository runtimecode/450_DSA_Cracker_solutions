package DSA;

import DSA.Array.KthElement;
import DSA.Array.MaxAndMin;
import DSA.Array.ReverseAnArray;
import DSA.Array.SortAnArrayof012;

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
        SortAnArrayof012 sr = new SortAnArrayof012(arr);
        System.out.println(sr.getNthItem(55));
    }
}
