package string;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Find duplicate characters in a string
 */
public class program_3 {
    static void printDuplicate(String str){
        HashMap<Character, Integer> countChar = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            if(!countChar.containsKey(str.charAt(i)))
                countChar.put(str.charAt(i), 1);
            else
                countChar.put(str.charAt(i), countChar.get(str.charAt(i)) + 1);
        }

        for(Character ele : countChar.keySet()){
            int val = countChar.get(ele);
            if(val > 1)
                System.out.println(ele + " = " + val);
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printDuplicate(sc.nextLine());
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * testing
 * t = 2
 *
 * ========================================
 * 
 * geeksforgeeks
 * s = 2
 * e = 4
 * g = 2
 * k = 2
 * 
 */