package arrays;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                maxCount = Math.max(count, maxCount);
                count = 0;
            } else {
                count++;
            }


        }
        return Math.max(count, maxCount);

    }
}
