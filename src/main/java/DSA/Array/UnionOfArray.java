package DSA.Array;

import java.util.HashSet;
import java.util.Iterator;

public class UnionOfArray {

    int arr[];

    public UnionOfArray(int[] arr){
        this.arr=arr;
    }

    public int[] getUnionOfArray(){
        HashSet<Integer> hs = new HashSet<>();

        for(int temp : arr){
            hs.add(temp);
        }
        int[] res = new int[hs.size()];
        int i=0;
        Iterator it = hs.iterator();

        while (it.hasNext()){
            res[i++] =(Integer) it.next();
        }
        return res;
    }

    public void getIntersectionOfArray(){
        System.out.println("Return whatever is not in union");
    }
}
