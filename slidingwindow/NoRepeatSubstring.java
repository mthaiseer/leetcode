package slidingwindow;

import java.util.HashMap;
import java.util.Map;

class NoRepeatSubstring {

  public static void main(String[] args) {
    System.out.println(findLength("bbbb"));
  }
    public static int findLength(String str) {

        int windowStart = 0;
        int windowEnd = 0;
        Map<Character, Integer> characterIndexMap = new HashMap<>();
        int maxlength = Integer.MIN_VALUE;
        for (windowEnd = 0; windowEnd < str.length(); windowEnd++) {

            char currentChar = str.charAt(windowEnd);
            if (characterIndexMap.containsKey(currentChar)) {
                windowStart = Math.max(windowStart, characterIndexMap.get(currentChar) + 1);
            }
            characterIndexMap.put(currentChar, windowEnd);
            maxlength = Math.max(maxlength, (windowEnd - windowStart) + 1);

        }
        return maxlength;
    }
}