package string;

import java.util.Scanner;

/**
 * Reverse a string
 */
public class program_1 {
    static String reverseString(char[] str){
        String revStr = "";

        for(int i = str.length - 1; i >= 0; i--)
            revStr += str[i];

        return revStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reverse string : " + reverseString(str.toCharArray()));
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * Bhavesh
 * Reverse string : hsevahB
 * 
 * **********************************************
 * 
 * NOTE : You can use reverse() method of StringBuilder class to reverse a string in java
 * 
 */