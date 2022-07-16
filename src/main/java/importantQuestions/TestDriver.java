package importantQuestions;

import DSA.Array.CycalicallyRotateArray;

import java.util.Arrays;

public class TestDriver {

    public static void main(String[] args) {
//        int arr[] = {1, 4, 45, 6, 10, -8};
//        int sum = 16;
//
//        ChkPair cp = new ChkPair(arr);
//        System.out.println(cp.hasArrayTwoCandidateUsingHashing(sum));
//
//        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
//        int n = ar.length;
//        NumOccuringOddTimes numOccuringOddTimes = new NumOccuringOddTimes(ar);
//
//        System.out.println(numOccuringOddTimes.getOddOccurrence(ar,n));

        int arr[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
        CycalicallyRotateArray cr = new CycalicallyRotateArray(arr);

        Arrays.stream(cr.rotateInCycallically(2)).forEach(value -> System.out.println(value));
    }
}
