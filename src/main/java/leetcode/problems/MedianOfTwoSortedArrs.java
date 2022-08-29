package leetcode.problems;

public class MedianOfTwoSortedArrs {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int lo = 0;
        int hi = nums1.length;
        int combinedLength = (lo+hi)/2;

        while(lo<=hi){
            int partx = (lo+hi)/2;
            int party = (combinedLength+1)/2 - partx;

//            int leftX = getMax


        }
        return 0.0;

    }
}
