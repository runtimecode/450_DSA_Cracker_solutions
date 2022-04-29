package Arrays;

public class ReverseTheArray_1 {

//    Given an array A of size N, print the reverse of it.
//
//            Input:
//    First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.
//
//            Output:
//    For each testcase, in a new line, print the array in reverse order.
//
//    Constraints:
//            1 <= T <= 100
//            1 <= N <=100
//            0 <= Ai <= 100
//
//    Example:
//    Input:
//            1
//            4
//            1 2 3 4
//    Output:
//            4 3 2 1

    public static int[] bruteForce(int[] arr){

        System.out.println("Brute force : issue new array space and O(n) complexity");

        int temp = arr.length;
        int[] res = new int[temp];

        for(int i=0;i<temp;i++){
            res[i] = arr[temp-1-i];
        }
        return res;
    }

    public static int[] optimization_1(int[] arr){

        System.out.println("Optimization 1 : No additional Array and O(n/2) Complexity");

        int arrlen = arr.length;
        if(arr.length%2==0){
            int mid = (arrlen/2);
            for(int i=mid-1; i>=0;i--){
                System.out.println("print->"+i+"\t"+(arrlen-1-i));
                int temp = arr[i];
                arr[i] = arr[arrlen-i-1];
                arr[arrlen-i-1] = temp;
            }
        }else{
            int mid = arrlen/2;
            for(int i=mid; i>0;i--){
                arr[i] =arr[arrlen-mid];
            }
        }


        return arr;
    }


}
