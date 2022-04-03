package basic;

import java.util.Scanner;

/**
 * Find fibonacci number using recursion method
 */

public class FibonacciNumber {
    static int fibonacciSeries(int no){
        if(no <= 1)
            return no;
        
        return fibonacciSeries(no - 1) + fibonacciSeries(no - 2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();
        
        System.out.print(fibonacciSeries(no) + " ");

        sc.close();
    }
}
/**
 * OUTPUT:
 * 
 * 13
 * 233
 * 
 */