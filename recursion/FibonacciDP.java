package recursion;

public class FibonacciDP {

    public static void main(String[] args) {
        FibonacciDP obj = new FibonacciDP();
        System.out.println(obj.fib(2));
    }

    public int fib(int N) {

        if( N == 0) return 0;
        if(N == 1) return 1;

        int[] memo = new int[N+1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i =2; i <=N; i++){
            memo[i] = memo[i-1]+ memo[i-2];
        }

        return memo[N];
    }
}
