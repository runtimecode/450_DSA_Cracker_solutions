package DSA.Sorting;

import java.util.Arrays;

public class MergeSort implements Sorting{

    int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sort() {
        int[] aux = new int[this.arr.length];

        for(int i=0; i<this.arr.length;i++)
            aux[i] = this.arr[i];

        mergeSort(0,arr.length,aux);
    }

    private void mergeSort(int low, int high, int[] aux){
        if(low<high){
           int mid = (low+high)/2;
           mergeSort(low,mid, aux);
           mergeSort(mid+1,high, aux);
           merge(low, mid,high);

        }
    }

    private void merge(int low, int mid, int high){

        int[] aux = new int[high-low+1];

        int i=low, j = mid+1;

        for(int k=low; k<=high; k++)
            aux[k] = arr[k];

        for(int k=low; k<=high;k++){
            if(i>mid)
                arr[k] = aux[j++];
            else if(j>high)
                arr[k]= aux[j++];
            else if(aux[j]<aux[i])
                arr[k] = aux[j++];
            else
                arr[k]= aux[i++];
        }

        System.out.println(low +" "+mid+" "+high);
    }

    @Override
    public int[] getArr() {
        return arr;
    }
}
