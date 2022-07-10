package DSA.Sorting;

public class SelectionSort implements Sorting{

    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void sort(){
        for(int i=0;i<arr.length;i++){
            int pos = i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[pos]){
                    pos =j;
                }
            }

            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }
}
