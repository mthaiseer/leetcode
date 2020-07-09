package arrays;

public class EvenNumberDigits {

    public int findNumbers(int[] nums) {

        int evenCount = 0;
        for(int n: nums){

            int digitCount = numberOfDigits(n);
            if(digitCount % 2 ==0){
                evenCount++;
            }

        }
        return evenCount;

    }

    private int numberOfDigits(int n){
        int count =0;
        while(n >0){
            n = n/10;
            count++;
        }
        return count;
    }
}
