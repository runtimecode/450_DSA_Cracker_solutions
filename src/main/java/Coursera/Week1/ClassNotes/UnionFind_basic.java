package Coursera.Week1.ClassNotes;

public class UnionFind_basic {


    Integer[] arr;

    public UnionFind_basic(int n){
        int count =0;
        arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=count++;
        }
    }

    public void union(int a, int b){
        int p = arr[a];
        int q = arr[b];

        for(int i=0;i<arr.length;i++){
            if(arr[i]==p){
                arr[i]=q;
            }
        }
//        System.out.printf("Union for %d and %d is successfully done%n",a,b);
    }

    public boolean find(int a, int b){
//        System.out.printf("Searching for connection between %d and %d %n",a,b);
        return arr[a]==arr[b];
    }
}
