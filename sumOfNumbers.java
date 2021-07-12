import java.util.*;

public class sumOfNumbers {
  public static void main(String[] args){
    int totNum =0 , sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total Numbers to be added: ");
    totNum = sc.nextInt();
    System.out.println("Total Numbers " + totNum);
    for (int a= 1; a <= totNum; a++){
      System.out.println("Enter " + a + "Number ");
      sum = sum + sc.nextInt();
    }
    System.out.println("Sum of given numbers is " + sum);
  }
}
