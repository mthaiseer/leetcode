package recursion.contest;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseRecursive(arr, 0, arr.length-1);
        for(int s: arr){
            System.out.print(" "+ s);
        }
    }

    static void reverseRecursive(int[] arr, int i, int j){

        if( i > j){
            return;
        }
        swap(arr, i, j);
        reverseRecursive(arr, i+1, j-1);

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
