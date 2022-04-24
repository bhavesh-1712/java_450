package string;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Count and say problem
 */
public class program_7 {
    static String replaceChar(String str, char ch, int index){
        return str.substring(0, index) + ch + str.substring(index + 1);
    }
    static String countAndSay(char[] charArr){
        StringBuilder result = new StringBuilder();

        for(char ch : charArr){
            if(result.indexOf(ch)){
               result.append(1);
               result.append(ch);
            }else{
                int val = result.charAt(result.indexOf(ch)) + 1;//old value
                result = replaceChar(result, (char)val, result.indexOf(ch));
            }
        }
       return result;
    }
    public static void main(String[] args) {
        String str = "3322251";
        System.out.println("Count and say of 3322251 is "+ countAndSay(str.toCharArray())); 
    }
}
