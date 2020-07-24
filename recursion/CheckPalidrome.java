package recursion.core;

public class CheckPalidrome {

    public static void main(String[] args) {
        String str = "ABMBC";
        System.out.println(check(str, 0, str.length()-1));
    }

    static boolean check(String str, int l, int r){

        if(l>= r){
            return  true;
        }

        return str.charAt(l) ==  str.charAt(r) && check(str, l+1, r-1);

    }
}
