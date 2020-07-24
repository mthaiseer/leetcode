package recursion.core;

public class SumofEvenNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(arr, arr.length-1));
    }


    static int sum(int[] arr, int i){
        if(i < 0){
            return 0;
        }
        return arr[i] % 2 != 0 ?  sum(arr, i-1) : arr[i] + sum(arr, i-1);

    }
}
