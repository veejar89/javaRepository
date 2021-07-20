import java.util.*;
import java.io.*;

public class maxAndSecondMax{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the array length ");
    int l = s.nextInt();
    int arrInt[] = new int[l];
    for (int i=0; i<l; i++){
      System.out.println("Enter the number at index " + i);
        arrInt[i] = s.nextInt();
    }
    System.out.println("First and Second Largest Number in the given array is : " + maxAndSecondMaxInt(l, arrInt));
  }

  public static String maxAndSecondMaxInt(int arrLength, int[] arrInt){
    int big1 = Math.max(arrInt[0], arrInt[1]);
    int big2 = Math.min(arrInt[0], arrInt[1]);
    for (int a= 2; a <arrLength; a++){
      if(arrInt[a]> big2){
        big2 = arrInt[a];
      }
      if(arrInt[a] > big1){
        big2 = big1;
        big1 = arrInt[a];
      }
    }
    return big1 + " and " + big2;
  }
}
