package recursion.contest;

public class SubSet {

    public static void main(String[] args) {
        generate("ABC", "", 0);
    }

    static void generate(String S1, String result, int index){

        if(index == S1.length()){
            System.out.println(result);
            return;
        }

        generate(S1, result, index+1);
        generate(S1, result + S1.charAt( index), index+1);

    }
}
