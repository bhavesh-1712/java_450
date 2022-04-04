package basic;

import java.util.Scanner;

/**
 * Check whether string palindrome or not
 */
public class StringPalindrome{
    static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            
            i++;
            j--;
        }

        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toLowerCase();

        if(isPalindrome(str))
            System.out.println(str + " is palindrome");
        else
            System.out.println(str + " is not palindrome");
        
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * Bob
 * bob is palindrome
 * 
 * =========================
 * 
 * Bhavesh
 * bhavesh is not palindrome
 * 
 */