package arrays;

public class ReplaceElementsInplace {

    public static void main(String[] args) {

        int [] A = {400, 1};
        int[] B = new ReplaceElementsInplace().replaceElements(A);

        for(int b: B){
            System.out.print(" "+b);
        }
    }

    public int[] replaceElements(int[] arr) {

        if(arr == null ){
            return arr;
        }
        if(arr.length ==1){
            arr[0] = -1;
            return arr;

        }

        if(arr.length < 3){
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] =-1;
            return arr;
        }

        int max = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i-- ){
            int current = arr[i];
            arr[i] = max;
            if (current > max){
                max= current;
            }
        }
        arr[arr.length-1] = -1;
        return arr;

    }

}
