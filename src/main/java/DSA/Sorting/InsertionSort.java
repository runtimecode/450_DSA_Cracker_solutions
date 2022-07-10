package DSA.Sorting;

public class InsertionSort implements Sorting {

    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void sort(){
        for(int i=0;i<arr.length;i++){
            int value = arr[i];
            int pos = i;

            while(pos>0 && arr[pos-1]>value){
                arr[pos] = arr[pos-1];
                pos--;
            }

            arr[pos] = value;
        }
    }
}
