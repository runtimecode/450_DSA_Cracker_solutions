package DSA.Array;

import java.util.Arrays;

public class MaxAndMin {

    /*
        Find minimum and maximum element in an array
     */

    int[] arr;
    int max;
    int min;

    public MaxAndMin(int[] arr){
        this.arr = arr;
        max=arr[0];
        min=arr[0];

        Arrays.stream(arr).forEach(e->{
            if(e>max){
                max=e;
            }else if(e<min){
                min=e;
            }
        });
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

}
