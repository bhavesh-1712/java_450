package string;

import java.util.Scanner;

/**
 * Check whether a string is palindrome or not
 */
public class program_2 {
    static boolean checkPalindrome(String str){
        int i = 0, j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(checkPalindrome(sc.nextLine().toLowerCase()))
            System.out.println("String palindrome");
        else
            System.out.println("String not palindrome");

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * abA
 * String palindrome
 * 
 * =======================================
 * 
 * bha
 * String not palindrome
 * 
 */