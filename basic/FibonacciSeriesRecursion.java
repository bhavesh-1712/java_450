package basic;

import java.util.Scanner;

/**
 * Find fibonacci series using recursion method
 */
public class FibonacciSeriesRecursion {

    static int fibonacciSeries(int no){
        if(no <= 1)
            return no;
        
        return fibonacciSeries(no - 1) + fibonacciSeries(no - 2);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        for(int i = 0; i < no; i++){
            System.out.print(fibonacciSeries(i) + " ");
        }

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * 13
 * 0 1 1 2 3 5 8 13 21 34 55 89 144 
 * 
 * =================================
 * 
 * NOTE : 
 * Time Complexity: O(2N)  
 * Auxiliary Space: O(1)
 */