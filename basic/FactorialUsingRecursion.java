package basic;

import java.util.Scanner;

/**
 * Find factorial using recursion method
 */
public class FactorialUsingRecursion {
    static int factorial(int no){
        if(no == 0)
            return 1;
        
        return no * factorial(no - 1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        System.out.println("Factorial of "+ no +" : "+ factorial(no));

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * 5
 * Factorial of 5 : 120
 *
 * ======================================
 *
 * 7
 * Factorial of 7 : 5040
 * 
 */
