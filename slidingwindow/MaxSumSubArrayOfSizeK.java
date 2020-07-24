package slidingwindow;

public class MaxSumSubArrayOfSizeK {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(sum(arr, 3));
    }

    static int sum(int[] arr, int k) {
        int windowStart = 0;
        int windowEnd;
        int sum = 0;
        int maxSum = 0;

        for (windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
