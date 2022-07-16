package importantQuestions;

public class CycalicallyRotateArray {

    int[] arr;

    public CycalicallyRotateArray(int[] arr){
        this.arr = arr;
    }

    public int[] rotateCycallically(int degree){
        int[] degreeArray = new int[degree];

        for(int i=0;i<degree;i++){
            degreeArray[i]= arr[i];
        }
        int i=0;
        int j = degree;

        while(i< arr.length && j<arr.length){
            arr[i++] = arr[j++];
        }

        j=0;

        while(i<arr.length){
            arr[i++] = degreeArray[j++];
        }

        return this.arr;
    }

    public int[] rotateInCycallically(int degree){

        int[] degreeArray = new int[arr.length-degree];
        int pos =0;

        for(int i=arr.length-1;i>degree;i--){
            degreeArray[pos++] = arr[i];
        }

//        while(i<arr.length){
//            if(pos<arr.length){
//                arr[i++] = arr[pos++];
//            }else{
//                arr[i++] = degreeArray[j++];
//            }
//        }
//
//        while(pos<arr.length){
//            arr[pos++] = arr[i++];
//        }
        int i=0;
        int degAr = 0;
        while(i<arr.length){
            int temp = arr[i];
            arr[i] = degreeArray[degAr];
            degreeArray[degAr] = temp;
            i++;
            degAr++;
            if(degAr==degreeArray.length){
                degAr=0;
            }
        }
        return this.arr;
    }

}
