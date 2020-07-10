package arrays;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = {3,2,2,3};
        System.out.println(obj.removeElement(nums, 2));

    }

    public int removeElement(int[] nums, int val) {

        int nonElementPointer = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                nums[nonElementPointer] = nums[i];
                nonElementPointer++;

            }
        }
        return nonElementPointer;

    }

}


