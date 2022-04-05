package basic;

import java.util.Scanner;

/**
 * Reverse string without using inbuit function
 */
public class ReverseStringWithoutUsingInbuiltFun {
    static String reverseString(String str){
        String result="";

        for(int i = str.length()-1; i >= 0; i--){
            char ch = str.charAt(i);
            result += ch;
        }

        return result;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println("Reverse string of "+str + " is a "+reverseString(str));

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * ABC
 * Reverse string of ABC is a CBA
 * 
 * ===================================
 * 
 * XYZ
 * Reverse string of XYZ is a ZYX
 * 
 */