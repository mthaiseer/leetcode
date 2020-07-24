package recursion.core;

public class NumberOrderChecker {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(inOrder(arr, arr.length-1));
    }
    static boolean inOrder(int[] A, int i){
        if(i<= 0){
            return true;
        }
        return A[i] - 1 ==  A[i-1] && inOrder(A, i-1);
    }
}
