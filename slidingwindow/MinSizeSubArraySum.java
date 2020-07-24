package slidingwindow;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr= {2, 1, 5, 2, 3, 2};

        System.out.println(minSizeSum(arr, 7));
    }

    static int minSizeSum(int[] arr, int k){

        int windowStart=0, windowEnd;
        int  maxWindowSize=Integer.MAX_VALUE;
        int sum =0;

        for(windowEnd =0; windowEnd< arr.length; windowEnd++){
            sum += arr[windowEnd];
            while(sum >= k){
                maxWindowSize =  Math.min(maxWindowSize, (windowEnd-windowStart)+1);
                sum-= arr[windowStart];
                windowStart++;
            }
        }

        return maxWindowSize;
    }
}
