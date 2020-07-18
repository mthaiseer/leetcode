package recursion;

public class Power {

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.myPow(2.00000, -2));
    }
    public double myPow(double x, int n) {
         return myPow(x, n, x);
    }

    public double myPow(double x, int n, double result){
    if(n == 1){
            return x;
        }
        return x * myPow(x, n-1, result * x);
    }

}
