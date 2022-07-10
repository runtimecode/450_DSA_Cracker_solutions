package DSA.Sorting;

import java.util.Arrays;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        Random random = new Random();
        int testSize = 100;

        int[] arr = new int[testSize+1];

        while (testSize>=0){
            arr[testSize--]= random.nextInt(1000);
        }

        Sorting bs = new MergeSort(arr);
        bs.sort();
        Arrays.stream(bs.getArr()).forEach(e->{
            System.out.print(e+", ");
        });
        System.out.println("");
    }
}
