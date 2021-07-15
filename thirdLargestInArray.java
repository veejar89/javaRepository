//Given an array of distinct elements. Find the third largest element in it.
//Input:
//N = 5
//A[] = {2,4,1,3,5}
//Output: 3

import java.util.*;
import java.io.*;
class thirdLargestInArray{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0){
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n; i++)
      arr[i]= sc.nextInt{};
      Solution g = new Solution();
      System.out.println(g.thirdLargest(arr,n));
      t--;
    }
  }
}
class Solution{
  int thirdLargest(int a[], int n){
    if(n<=2){
      return -1;
    } else {
      int big1 = Math.max(a[0], a[1]);
      int big2 = Math.min(a[0], a[1]);
      int big3 = Integer.MIN_VALUE;

      for(int i =2; i <n; i++){
        if(a[i]>big3){
          big3 = a[i];
        }
        if(a[i]>big2){
          big3 = big2;
          big2 = a[i];
        }
        if(a[i]>big1){
          big2 = big1;
          big1 = a[i];
        }
      }
      return big3;
    }
  }
}
