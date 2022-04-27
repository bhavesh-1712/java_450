package string;

import java.util.Scanner;

/**
 * Print all permutations of the given string
 */
class program_11{
    static void printPerutation(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            printPerutation(ros, ans + ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        printPerutation(sc.nextLine(), "");
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * Enter a string : 
 * abc
 * abc acb bac bca cab cba 
 */