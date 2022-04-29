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


}
