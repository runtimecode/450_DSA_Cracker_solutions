package Coursera.Week2.Beans;

public class LinedListArray {
    int size = 10;
    String[] arr;
    int header = 0;

    public LinedListArray() {
        this.arr = new String[size];
    }

    public void push(String a){
        if(isFull()){
            extendArray();
        }
        arr[header++] = a;
    }

    public String pop(){
        return arr[header--];
    }

    private boolean isFull(){
        return header==size;
    }

    private void extendArray(){
        size = 2*size;
        String[] updatedArr = new String[size];
        for(int i=0;i<arr.length;i++){
            updatedArr[i] = arr[i];
        }
        System.out.println("Updated array size "+size);
        arr = updatedArr;
    }

    public boolean isEmpty(){
        return header==0;
    }

}
