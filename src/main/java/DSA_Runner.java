import Arrays.Find_kth_small_element;
import Arrays.ReverseTheArray_1;
import Arrays.getMinMax_2;
import CLRS_DataStructure.MaximumSubarraySum;

public class DSA_Runner {

    public static void main(String[] args) {

        int[] arr = {0,13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};

        int[] resultArr = MaximumSubarraySum.bruteForceSolution(arr);

        for(int temp : resultArr){
            System.out.print(temp+"\t");
        }

    }
}
