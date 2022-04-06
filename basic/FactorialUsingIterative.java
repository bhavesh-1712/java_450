package basic;

import java.util.Scanner;

/**
 * Find factorial using iterative method
 */
public class FactorialUsingIterative {
    static int factorial(int no){
        int res = 1, i;
        for(i = 2; i <= no; i++)
            res *= i;
    
        return res;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        System.out.println("Factorial of "+no+" : "+factorial(no));

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * 6
 * Factorial of 6 : 720
 * 
 * ==========================================
 * 
 * 12
 * Factorial of 12 : 479001600
 * 
 */