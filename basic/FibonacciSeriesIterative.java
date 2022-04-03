package basic;

import java.util.Scanner;

/**
 * Find fibonacci series using iterative method
 */
public class FibonacciSeriesIterative {

    static void fibonacciSeries(int no){
        int num1 = 0, num2 = 1;

        int index = 0;

        while(index++ < no){
            System.out.print(num1 + " ");

            int num3 = num2 + num1;

            num1 = num2;
            num2 = num3;
        }
    }
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        fibonacciSeries(sc.nextInt());

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * 13
 * 0 1 1 2 3 5 8 13 21 34 55 89 144
 * 
 * ===================================
 * NOTE : 
 * Time Complexity: O(N) 
 * Auxiliary Space: O(1)
 */