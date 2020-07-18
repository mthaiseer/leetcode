package arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] A=  {3,1,2,4};
        //int[] A=  {3,1,5,2};
        int B[] = new SortArrayByParity().sortArrayByParity(A);
        for(int c: B){
            System.out.print( " "+c);
        }
    }

    public int[] sortArrayByParity(int[] A) {

        int evenTracker =0;
        for(int i=0; i<A.length; i++){
            if(A[i] %2 ==0){
                int temp = A[i];
                A[i] = A[evenTracker];
                A[evenTracker] = temp;
                evenTracker++;
            }
        }


        return A;

    }
}
