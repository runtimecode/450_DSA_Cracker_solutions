import Arrays.ReverseTheArray_1;

public class DSA_Runner {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int T=sc.nextInt(); // number of testcases
//
//        for(int i=0; i<T;i++){
//            int n = sc.nextInt();
//
//            int[] arr = new int[n];
//
//            for( int m=0;m<n;m++){
//                arr[m] = sc.nextInt();
//            }

        int[] arr = {1,2,3,4};
            int[] sol = ReverseTheArray_1.bruteForce(arr);
            for(int n : sol){
                System.out.print(n+", ");
            }
    }
}
