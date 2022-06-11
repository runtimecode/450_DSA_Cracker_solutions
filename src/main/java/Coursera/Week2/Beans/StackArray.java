package Coursera.Week2.Beans;

public class StackArray {

    int size = 10;
    int header = 0;
    String[] arr = new String[size];


    public boolean isEmpty(){
        return header==0;
    }

    public boolean isFull(){
        return header==size;
    }

    public void extendArray(){
        size *=2;
        String[] updatedArr = new String[size];
        for(int i=0;i<arr.length;i++){
            updatedArr[i] = arr[i];
        }
        arr = updatedArr;
    }

    public void push(String str){
        if(isFull()){
            extendArray();
        }
        arr[header++] = str;
    }

    public String pop(){
        return arr[--header];
    }

    public String peek(){
        return arr[header];
    }
}
