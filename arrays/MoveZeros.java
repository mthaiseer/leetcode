package arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] nums = {0,1};
        new MoveZeros().moveZeroes(nums);

        for(int c: nums){
            System.out.print(" "+c);
        }
    }

    public void moveZeroes(int[] nums) {

        //move all non zeros to left side
        int nonzeroPtr =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[nonzeroPtr] = nums[i];
                nonzeroPtr++;
            }
        }
        //fill zero on rest of the spaces
        for(int i=nonzeroPtr; i<nums.length; i++){
            nums[i]=0;
        }

    }

}
