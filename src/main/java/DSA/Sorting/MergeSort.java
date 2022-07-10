package DSA.Sorting;

public class MergeSort implements Sorting{

    int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        mergeSort(0,arr.length);
    }

    private void mergeSort(int low, int high){
        if(low<high){
           int mid = (low+high)/2;
           mergeSort(low,mid);
           mergeSort(mid+1,high);
           merge(low, mid,high);
        }
    }

    private void merge(int low, int mid, int high){
        System.out.println(low +" "+mid+" "+high);
    }

    @Override
    public int[] getArr() {
        return arr;
    }
}
