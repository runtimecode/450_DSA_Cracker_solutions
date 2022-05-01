package Arrays;

//Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
//
//
//
//        Example 1:
//
//        Input:
//        N = 6
//        A[] = {3, 2, 1, 56, 10000, 167}
//        Output:
//        min = 1, max =  10000
//
//
//        Example 2:
//
//        Input:
//        N = 5
//        A[]  = {1, 345, 234, 21, 56789}
//        Output:
//        min = 1, max = 56789
//
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.
//
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
//




public class getMinMax_2 {

    public static pair getMinMax(long[] a, long n){
        long max = a[0];
        long min = a[0];

        for(long temp: a){
            if(temp<min){
                min=temp;
            }else if(temp>max){
                max=temp;
            }
        }

        pair p = new pair(min,max);
        return p;
    }
}

class pair {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
