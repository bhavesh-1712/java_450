package basic;

import java.util.Scanner;

/**
 * Check whether integer palindrome or not
 */
public class IntegerPalindrome {
    static boolean isPalindrome(int no){
        int rem, rev = 0, temp = no;
        
        while(no > 0){
            rem = no % 10;
            rev = (rev * 10) + rem;
            no = no/10;
        }

        if(temp == rev)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        if(isPalindrome(no))
            System.out.println(no + " is palindrome");
        else
            System.out.println(no + " is not palindrome");

        sc.close();
    }
}
