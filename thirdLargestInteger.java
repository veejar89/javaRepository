//Given an array of distinct elements. Find the third largest element in it.
//Input:
//N = 5
//A[] = {2,4,1,3,5}
//Output: 3

import java.util.*;
import java.io.*;

public class thirdLargestInteger{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter array length : ");
    int n = input.nextInt();
    int arrInt[] = new int[n];
    System.out.println("Enter numbers in array: ");
    int i=0;
    int totalInt = n;
    while (n>0){
      System.out.println("Enter Number at " + i + " index : ");
      arrInt[i] = input.nextInt();
      i++;
      n--;
    }
    Solution s = new Solution();
    System.out.println("Third Largest Number in the given Array is " + s.thirdLargestInteger(totalInt, arrInt));
  }
}

class Solution{
  public int thirdLargestInteger(int n, int[] arrInt){
    if(n<3){
      return -1;
    } else {
      int big1 = Math.max(arrInt[0], arrInt[1]);
      int big2 = Math.min(arrInt[0], arrInt[1]);
      int big3 = Integer.MIN_VALUE;
      for(int a = 2; a<arrInt.length; a++){
        if(arrInt[a] > big3){
          big3 = arrInt[a];
        }
        if(arrInt[a]>big2){
          big3 = big2;
          big2= arrInt[a];
        }
        if(arrInt[a]>big1){
          big2 = big1;
          big1 = arrInt[a];
        }
      }
      return big3;
    }
  }
}
