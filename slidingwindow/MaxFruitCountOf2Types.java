package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {

    public static void main(String[] args) {
        char [] fruits = {'A', 'B', 'C', 'A', 'C'};
        System.out.println(findLength(fruits));
    }

    public static int findLength(char[] arr) {

        int windowStart =0;
        int windowEnd =0;
        Map<Character, Integer> characterMap = new HashMap<>();
        int maxWindow = Integer.MIN_VALUE;

        for(windowEnd =0; windowEnd< arr.length; windowEnd++){
            char rightchar  = arr[windowEnd];
            characterMap.put(rightchar, characterMap.getOrDefault(rightchar, 0)+1);

            if(characterMap.size()> 2){
                char leftchar  = arr[windowStart];
                characterMap.put(leftchar, characterMap.get(leftchar)-1);
                if(characterMap.get(leftchar) == 0){
                    characterMap.remove(leftchar);
                }
                windowStart++;
            }
            maxWindow = Math.max(maxWindow, (windowEnd -  windowStart)+1);
        }
        return maxWindow;
    }
}
