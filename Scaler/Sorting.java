import java.util.Arrays;

//Little pony is going to buy some mobile phones for his friends. As there many models available in the market at different prices, He is confused and wants to know the maximum distinct models of a mobile phone he can buy for his friends, given that he has a total X amount of money.
//You are given an array A of size N. denoting the size of prices of different models. The array is sorted based on prices in increasing order. You are given another array B of size Q denoting the queries. In i'th query, you need to tell the maximum distinct models of mobile phones he can buy with B[i] money.
// Sample Input A: [3,4,4,6] B:[20,4,10,2] Output:[4,1,2,0]
public class Day1Sorting {
    public static void main(String[] args) {

        int[] A ={3,4,4,6};
        int[] B = {2,7,10,50};
        for (int index = 1; index < A.length; index++){
            A[index] = A[index] + A[index-1];
        }
        for (int query = 0; query < B.length; query++){
            if (Arrays.binarySearch(A,B[query])>=0){
                System.out.println(Arrays.binarySearch(A,B[query])+1);
            } else {
                System.out.println(-Arrays.binarySearch(A, B[query]) - 1);
            }
        }

    }
}
