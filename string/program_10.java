package string;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all subsequences of a string
 */
public class program_10 {
    static List<String> al = new ArrayList<>();
    static void findSubSeq(String s, String ans){
        if(s.length() == 0){
            al.add(ans);
            return;
        }

        findSubSeq(s.substring(1), ans + s.charAt(0));

        findSubSeq(s.substring(1), ans);
    }
    public static void main(String[] args) {
        String s = "abcd";
        findSubSeq(s, "");
        System.out.println(al);
    }
}
/**
 * OUTPUT
 * 
 * [abcd, abc, abd, ab, acd, ac, ad, a, bcd, bc, bd, b, cd, c, d, ]
 * 
 */