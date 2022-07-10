package DSA.Sorting;

public class BubbleSort implements Sorting{

    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public int[] getArr() {
        return arr;
    }
}
