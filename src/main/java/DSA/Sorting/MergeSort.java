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

        mergeSort(arr, aux, 0,arr.length);
    }

    private void mergeSort(int[] a, int[] aux, int low, int high){

        if(high<=low) return;

        int mid = low+(high-low)/2;
        mergeSort(a,aux, low,mid);
        mergeSort(a,aux, mid+1,high);
        merge(a, aux, low, mid, high);
    }

    private void merge(int[] a, int[] aux, int low, int mid, int high) {

        for(int k=low; k<=high; k++){
            aux[k] = a[k];
        }

        int i = low, j= mid+1;

        for(int k = low; k<=high; k++){
            if(i>mid)
                a[k]= aux[j++];
            else if(j>high)
                a[k]=aux[i++];
            else if(aux[j]<aux[i])
                a[k]=aux[j++];
            else
                a[k]= aux[i++];
        }
    }

    @Override
    public int[] getArr() {
        return arr;
    }
}
