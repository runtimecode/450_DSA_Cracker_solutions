package DSA.Array;

public class ReverseAnArray {

    /*
        Given an Array arr = [1,2,3,4,5,6,7]
        print 7,6,5,4,3,2,1

     */

    int[] arr;

    public ReverseAnArray(int[] arr){
        this.arr = arr;
    }

    public int[] printReverseArray(){

        int left =0;
        int right =arr.length/2;
        if(arr.length%2==0){
            left =right-1;
        }else{
            left = right-1;
            right =right+1;
        }

        while (left>=0){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left--;
            right++;
        }

        return this.arr;
    }
}
