/*You are given an integer N. You need to convert all zeroes of N to 5.
'Example 1:
'Input:
'N = 1004
'Output: 1554
'Explanation: There are two zeroes in 1004
'on replacing all zeroes with "5", the new
'number will be "1554".*/


import java.util.*;

public class replaceAllZeroWithFive {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T >0){
      int N = sc.nextInt();
      System.out.println(new GfG().convertFive(N));
      T--;
    }
  }
}

class GfG {
  int convertFive(int num){
    String givenValue = String.valueOf(num);
    if(givenValue.contains("0")){
      givenValue = givenValue.replace("0", "5");
    }
    return Integer.parseInt(givenValue);
  }
}
