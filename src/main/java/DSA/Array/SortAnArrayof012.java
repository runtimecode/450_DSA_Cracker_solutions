package DSA.Array;

public class SortAnArrayof012 {

    int[] arr;
    int count0=0;
    int count1=0;
    int count2=0;

    public SortAnArrayof012(int[] arr){
        this.arr = arr;
        count();
    }

    public void count(){
        for(int temp : arr){
            switch (temp){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                default:
                    break;
            }
        }
    }

    public int getNthItem(int n){
        return (n>count0?n>count0+count1?2:1:0);
    }
}
