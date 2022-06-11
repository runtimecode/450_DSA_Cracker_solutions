package Coursera.Week2.Beans;

public class QueueArray {

    int size = 10;

    String[] arr = new String[size];
    int start =0;
    int end=0;
    int capacity =0;

    public boolean isEmpty(){
        return capacity==0;
    }

    public boolean isFull(){
        return capacity==size;
    }

    private void extendArray(){
        size *=2;
        String[] updatedArr = new String[size];

        for(int i=0;i<arr.length;i++){
            updatedArr[i] = arr[i];
        }
        arr = updatedArr;
    }

    public void enqueue(String str){
        if(isFull()){
            extendArray();
        }
        arr[end++] = str;
        capacity++;
    }

    public String dequeue(){
        capacity--;
        return arr[start++];
    }


}
