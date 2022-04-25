package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Count and say problem
 */
public class program_7 {
    static String countAndSay(char[] str, int n) {
        HashMap<Character, Integer> countChar = new HashMap<>();
        HashSet<Character> s = new LinkedHashSet<>(n - 1);//hash set doesn't allow repatition of element

        String result = "";

        for(int i = 0; i < n; i++){
            if(!countChar.containsKey(str[i]))
                countChar.put(str[i], 1);
            else
                countChar.put(str[i], countChar.get(str[i]) + 1);
            
            s.add(str[i]);
        }

        for(Character ch : s){
            result += String.valueOf(countChar.get(ch) + String.valueOf(ch));
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "3322251";
        System.out.println("Count and say of 3322251 is " + countAndSay(str.toCharArray(), str.length()));
    }
}
/**
 * OUTPUT
 * 
 * Count and say of 3322251 is 23321511
 * 
 */