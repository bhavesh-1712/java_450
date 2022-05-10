package string;

import java.util.Arrays;

/**
 * Longest common prefix
 */
public class program_27 {
    static String longestCommonPrefix(String a[]){
        int size = a.length;

        if(size == 0)
            return " ";
        if(size == 1)
            return a[0];
        
        Arrays.sort(a);

        int end = Math.min(a[0].length(), a[size - 1].length());

        int i = 0;
        while(i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        String pre = a[0].substring(0, i);
        
        return pre;
    }
    public static void main(String[] args) {
        String input[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest common prefix is : "+longestCommonPrefix(input));
    }
}
/**
 * OUTPUT
 * 
 * The longest common prefix is : gee
 * 
 */