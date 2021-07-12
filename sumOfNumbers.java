import java.util.*;

public class sumOfNumbers {
  public static void main(String[] args){
    int totNum, sum;
    HashMap<String, Integer> numbers = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter total Numbers to be added: ");
    totNum = sc.nextInt();
    System.out.println("Total Numbers " + totNum);
    for (int a= 1; a <= totNum; a++){
      System.out.println("Enter " + a + "Number ");
      numbers.put("Key" + a, sc.nextInt());
      System.out.println(numbers.get("Key" + a));
    }
sum =0;
    for (Map.Entry<String, Integer> entry : numbers.entrySet()){
      sum = sum + entry.getValue();
    }
    System.out.println("Sum of given numbers is " + sum);
  }
}
