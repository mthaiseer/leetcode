package arrays;

import java.util.HashSet;
import java.util.Set;

public class DoubleExists {

    public static void main(String[] args) {

        int[] arr = {3,1,7,11};
        System.out.println(new DoubleExists().checkIfExist(arr));

    }

    public boolean checkIfExist(int[] arr) {

        if(arr == null || arr.length ==0){
            return  false;
        }

        Set<Integer> holder = new HashSet<>();

        for(int i =0; i<arr.length; i++){
            if(holder.contains(arr[i]* 2) || (arr[i] %2 ==0 && holder.contains(arr[i]/2))){
                return true;
            }
            holder.add(arr[i]);
        }


        return false;

    }

}
