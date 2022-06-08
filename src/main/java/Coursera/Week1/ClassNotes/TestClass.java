package Coursera.Week1.ClassNotes;

public class TestClass {


    public static void main(String[] args) {

        UnionFind_optimisation_02 ufb = new UnionFind_optimisation_02(100);
        int noOfRandomUnion =(int) (Math.random() * 100);
        int noOfRandomFind = (int) (Math.random() * 100);

        System.out.println("Rondom union is "+noOfRandomUnion);

        while(noOfRandomUnion>0){
            ufb.union((int) (Math.random() * 100),(int) (Math.random() * 100));
            noOfRandomUnion--;
        }

        while(noOfRandomFind>0){
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            if(ufb.find(a,b)){
                System.out.printf("Yeeeeeee connection was found for %d and %d%n",a,b);
            }else{
                System.out.printf("Searched, however No connection was found for %d and %d%n",a,b);
            }
            noOfRandomFind--;
        }
        System.out.println("program completed successfully");
    }
}
