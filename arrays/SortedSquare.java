package arrays;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {
        int[] A = {0,3,1};
        int[] result = sortedSquares(A);
        for(int a: result){
            System.out.print(" "+a);
        }
    }

    public static int[] sortedSquares(int[] A) {

        Arrays.sort(A);
        int start =0;
        int end = A.length-1;
        int endPointer= A.length-1;
        int[] result = new int[A.length];

        while(end >= start){

            int leftSquare  = A[start]* A[start];
            int rightSquare  = A[end]* A[end];

            if(rightSquare > leftSquare){
                result[endPointer] =  rightSquare;
                endPointer--;
                end--;
            }else{
                result[endPointer]= leftSquare;
                endPointer--;
                start++;
            }

        }
        return result;
    }
}
