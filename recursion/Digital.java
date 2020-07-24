package recursion.contest;

class Digital {

    public static void main(String[] args) {
        System.out.println(digitalRoot(10514));
    }
    // complete the function
    public static int digitalRoot(int n) {

        if(n < 10){
            return n;
        }

        return digitalRoot(digitSum(n, 0));
    }

    static int digitSum(int n, int sum) {

        if (n <=0) {
            return sum;
        }
        sum = sum +( n % 10);
        return digitSum(n / 10, sum);

    }


}