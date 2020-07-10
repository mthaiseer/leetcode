package arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums=  {1,1,2,2,3};
        System.out.println(new RemoveDuplicate().removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {

        if(nums  == null){
            throw new IllegalArgumentException("");
        }

        if(nums.length == 1){
            return 1;
        }

        int nondupPtr=1;
        for(int i=1; i<nums.length; i++){
            if(nums[nondupPtr-1] != nums[i]){
                nums[nondupPtr] = nums[i];
                nondupPtr++;
            }


        }
        return nondupPtr;
    }

}
