package basic;

import java.util.Scanner;

/**
 * String Reverse
 */
public class ReverseString {
    static String reverseString(String str){
        StringBuilder result = new StringBuilder();

        result.append(str);

        result.reverse();

        return result.toString();
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Reverse string of "+str + " is a "+reverseString(str));

        sc.close();
    }
}
/**
 * OUTPUT : 
 * 
 * BGP
 * Reverse string of BGP is a PGB
 * 
 * =====================================
 * 
 * Bhavesh
 * Reverse string of Bhavesh is a hsevahB
 * 
 */