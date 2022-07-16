package importantQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class ChkPair {

    int arr[];

    public ChkPair(int[] arr) {
        this.arr = arr;
        Arrays.sort(this.arr);
    }

    public boolean hasArrayTwoCandidate(int sum){
        int l =0, r = this.arr.length-1;

        while(l<r){
            if(arr[l]+arr[r]==sum){
                return true;
            }else if (arr[l]+arr[r]<sum){
                l++;
            }else{
                r--;
            }
        }

        return false;
    }

    public boolean hasArrayTwoCandidateUsingHashing(int sum){
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i)
        {
            int temp = sum - arr[i];

            // checking for condition
            if (s.contains(temp)) {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }

}
