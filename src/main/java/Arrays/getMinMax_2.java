package Arrays;

//Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.
//
//
//
//        Example 1:
//
//        Input:
//        N = 6
//        A[] = {3, 2, 1, 56, 10000, 167}
//        Output:
//        min = 1, max =  10000
//
//
//        Example 2:
//
//        Input:
//        N = 5
//        A[]  = {1, 345, 234, 21, 56789}
//        Output:
//        min = 1, max = 56789
//
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function getMinMax() which takes the array A[] and its size N as inputs and returns the minimum and maximum element of the array.
//
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
//



//if we talk in terms of number of comparisons required in below approach, as we are making 2 comparisons for each number
//so there are 2n comparisons.
//can we reduce the number of comparisons?
public class getMinMax_2 {

    public static pair getMinMax(long[] a, long n){
        long max = a[0];
        long min = a[0];

        for(long temp: a){
            if(temp<min){
                min=temp;
            }else if(temp>max){
                max=temp;
            }
        }

        pair p = new pair(min,max);
        return p;
    }
}


//using Divide and conquer paradigm to reduce the number of comparisons required
//number of comparisons
//Recurrence equation
//T(n) = T(floor(n/2)) + T(ceil(n/2)) + 2  
//which gives   T(n)  = 3n/2 - 2 when n is a power of 2

//Time Complexity: O(n)
//Auxiliary Space: O(log n) as the stack space

class getMinMax_3 
{
    static pair getMinMax(long a[], long n)  
    {
        int l = 0;
        int r = a.length - 1;
        
        pair minmax = new pair(0l, 0l);
        
        minmax = getMinMaxUtil(a, l, r);
        
        return minmax;
    }
    
    static pair getMinMaxUtil(long a[], int l, int r){
        if(l == r){
            pair minmax = new pair(0l, 0l);
            minmax.first = a[l];
            minmax.second = a[l];
            return minmax;
        }
        
        if(r == l + 1){
           pair minmax = new pair(0l, 0l);
           if(a[l] > a[r]){
               minmax.first = a[r];
               minmax.second = a[l];
           } else {
               minmax.first = a[l];
               minmax.second = a[r];
           }
           return minmax;
        }
        int mid = l + (r - l) / 2;
        pair minmaxl = getMinMaxUtil(a, l, mid);
        pair minmaxr = getMinMaxUtil(a, mid + 1, r);
        
        pair minmax = new pair(0l, 0l);
        
        if(minmaxl.first < minmaxr.first){
            minmax.first = minmaxl.first;
        } else {
            minmax.first = minmaxr.first;
        }
        
        if(minmaxl.second < minmaxr.second){
            minmax.second = minmaxr.second;
        } else {
            minmax.second = minmaxl.second;
        }
        
        return minmax;
    }
}


class pair {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
