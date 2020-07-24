package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static void main(String[] args) {
        System.out.println(findLongestString("araaarci", 2));
    }

    static int findLongestString(String S1, int k) {
        int windowStart = 0;
        int windowEnd;
        Map<Character, Integer> characterMap = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;

        for (windowEnd = 0; windowEnd < S1.length(); windowEnd++) {
            char rightChar = S1.charAt(windowEnd);
            characterMap.put(rightChar, characterMap.getOrDefault(rightChar, 0) + 1);

            while (characterMap.size() > k) {
                char leftchar = S1.charAt(windowStart);
                characterMap.put(leftchar, characterMap.get(leftchar) - 1);
                if (characterMap.get(leftchar) == 0) {
                    characterMap.remove(leftchar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, (windowEnd - windowStart) + 1);
        }
        return maxLength;
    }
}
