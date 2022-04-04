package basic;

import java.util.Scanner;

/**
 * Write a Java program to check if a given number is prime or not.
 */
public class PrimeNumber {
    static boolean isPrime(int no){
        if(no <= 1)
            return false;
        else if(no == 2)
            return true;
        else if(no % 2 == 0)
            return false;
        
        for(int i = 3; i <= Math.sqrt(no); i +=2 ){
            if(no % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no = sc.nextInt();

        if(isPrime(no))
            System.out.println(no + " is prime number");
        else
            System.out.println(no + " is not prime number");
        
        sc.close();
    }
}
/**
 * OUTPUT 
 * 
 * 10
 * 10 is not prime number
 * 
 * ===================================
 * 
 * 11
 * 11 is prime number
 */
