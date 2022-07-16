package importantQuestions;

import java.util.HashMap;

public class NumOccuringOddTimes {

//    Time Complexity: O(n)
//
//    Auxiliary Space: O(n)

    int arr[];

    public NumOccuringOddTimes(int[] arr) {
        this.arr = arr;
    }

    static int getOddOccurrence(int arr[], int n)
    {
        HashMap<Integer,Integer> hmap = new HashMap<>();

        // Putting all elements into the HashMap
        for(int i = 0; i < n; i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                int val = hmap.get(arr[i]);

                // If array element is already present then
                // increase the count of that element.
                hmap.put(arr[i], val + 1);
            }
            else

                // if array element is not present then put
                // element into the HashMap and initialize
                // the count to one.
                hmap.put(arr[i], 1);
        }

        // Checking for odd occurrence of each element present
        // in the HashMap
        for(Integer a:hmap.keySet())
        {
            if(hmap.get(a) % 2 != 0)
                return a;
        }
        return -1;
    }
}
