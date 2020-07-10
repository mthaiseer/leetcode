package arrays;

public class DuplicateZeros {

    //[0,0,0,0,0,0,0]
    public static void main(String[] args) {
        DuplicateZeros obj = new DuplicateZeros();
        int[] arr = {1,0,2,3,0,4,5,0};
        obj.duplicateZeros(arr);

        for (int a : arr) {
            System.out.print(" " + a);
        }
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==0){
                shiftRight(arr, i+1, arr.length-1);
                i+=1;
            }

        }


    }

    private void shiftRight(int[] arr, int start, int end) {

        for (int i = end; i >= start; i--) {
            arr[i] = arr[i - 1];
        }

    }


}
