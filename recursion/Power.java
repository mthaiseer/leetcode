package recursion.contest;

public class Power {

    public static void main(String[] args) {
        System.out.println(RecursivePower(4, 0));
    }

    static int RecursivePower(int n, int p) {

        if( p ==  0){
            return 1;
        }

        if( p  <= 1){
            return n;
        }

        return n * RecursivePower(n, p-1);

    }
}
