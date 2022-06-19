package DSA.Array;

public class KthElement {

    int[] arr;

    public KthElement(int[] arr){
        this.arr=arr;
//        bubbleSort();
//        selectionSort();
          insertionSort();
    }


    public void bubbleSort(){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public void selectionSort(){
        for(int i =0; i<arr.length-1;i++){
            int pos =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[pos]){
                    pos =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    public void insertionSort(){
        for(int i=1;i<arr.length-1;i++){
            int value = arr[i];
            int pos = i;

            while(pos>0 && arr[pos-1]>value){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = value;
        }
    }

    public void mergeSort(int[] a, int n){
        if(n<2){
            return;
        }
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    private void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int getKthElement(int k){
        return arr[k-1];
    }
}
