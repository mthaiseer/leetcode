package recursion.core;

public class FindMaximum {

    public static void main(String[] args) {
        int[] arr =  {1,2,4,0,6,8,100};
        System.out.println(findMax(arr, arr.length-1));
    }

    static int findMax(int[] A, int i){

        if( i == 0){
            return A[0];
        }
        return Math.max(A[i], findMax(A, i-1));
    }
}
