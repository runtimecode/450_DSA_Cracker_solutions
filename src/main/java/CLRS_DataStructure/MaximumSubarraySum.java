package CLRS_DataStructure;

import java.util.Arrays;

public class MaximumSubarraySum {

    public static int[] getMaximumContinuousSumArray(int arr[]) {
        int[] res = new int[arr.length];


        return res;
    }


    public static int[] bruteForceSolution(int[] arr) {
        int len = arr.length;

        int max_start = 0;
        int max_end = 0;
        int max_sum = 0;

        for (int i = 0; i < len; i++) {
            int curr_sum = 0;
            for (int j = i + 1; j < len; j++) {
                curr_sum += arr[i] + arr[j];

                if (curr_sum >= max_sum) {
                    max_sum = curr_sum;
                    max_start = i;
                    max_end = j;
                } else {
                    break;
                }
            }
        }
        System.out.println("Max Sum : " + max_sum + " i: " + max_start + " j: " + max_end + " start element: " + arr[max_start] + " end element: " + arr[max_end]);
        return Arrays.copyOfRange(arr, max_start, max_end);
    }

}
