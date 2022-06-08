package Coursera.Week1.ClassNotes;

public class UnionFind_optimisation_01 {
    Integer[] arr;

    UnionFind_optimisation_01(int n){
        int count =0;
        arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=count++;
        }
    }

    private int root(int i){
        while(i!=arr[i]){
            i=arr[i];
        }
        return i;
    }

    public void union(int a, int b){
        if(a==b)
            return;
        int p = root(a);
        int q = root(b);

        arr[p]=q;

        System.out.printf("Union for %d and %d is successfully done%n",a,b);
    }

    public boolean find(int a, int b){
        System.out.printf("Searching for connection between %d and %d %n",a,b);
        return root(a)==root(b);
    }
}
