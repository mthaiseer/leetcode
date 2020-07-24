package recursion.core;

public class DigitSum {

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    static int sum(int n){
        if( n== 0 ) return 0;
        int digit = n %10;
        return digit + sum(n/10);
    }
}
