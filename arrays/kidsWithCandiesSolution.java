package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
 */
public class kidsWithCandiesSolution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = max(candies);
        List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++){

            if(candies[i] >= max || candies[i]+extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }

        }
        return result;

    }

    private int max(int[] candies){
        int max =0;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
}
