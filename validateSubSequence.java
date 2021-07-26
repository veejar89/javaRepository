package toptalPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class validateSubSequence {
    public static void main(String[] args) {
        int[] arr1 = {5,1,22,25,6,-1,8,10};
        int[] arr2 = {-1,6,1,10};
        List<Integer> list1 = Arrays.asList(5,1,22,25,6,-1,8,10);
        List<Integer> list2 = Arrays.asList(-1,6,1,10);
        System.out.println(validateSubsequence(list1, list2));

        System.out.println(validateSubsequence(arr1, arr2));
    }

    public static boolean validateSubsequence(List<Integer> array, List<Integer> sequence){
        int arrSeq = 0;
        for(var arrVal : array){
            if(arrSeq == sequence.size()){
                break;
            }
            if(sequence.get(arrSeq).equals(arrVal)){
                arrSeq++;
            }
        }
        return arrSeq == sequence.size();
    }
    public static boolean validateSubsequence(int[] array1, int[] array2){
        int b = 0;
        int currentNum = array2[b];
        for(int a = 0; a<array1.length; a++){
            if(currentNum==array1[a]){
                if(b>=array2.length-1){
                   return true;
                } else {
                    a=0;
                    b = b+1;
                    currentNum = array2[b];
                }
            }
        }
        return false;
    }
}
