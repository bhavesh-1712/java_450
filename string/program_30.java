package string;

import java.util.Vector;

/**
 * Minimum number of swaps for bracket balancing
 */
public class program_30 {
    static long swapCount(String s){
        Vector<Integer> pos = new Vector<Integer>();

        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) =='[')
                pos.add(i);
            
        int count = 0, p = 0;
        long sum = 0;
        char[] S = s.toCharArray();

        for(int i = 0; i < s.length(); ++i){
            if(S[i] == '['){
                ++count;
                ++p;
            }else if(S[i] == ']')
                --count;

            if(count < 0){
                sum += pos.get(p) - i;
                char temp = S[i];
                S[i] = S[pos.get(p)];
                S[pos.get(p)] = temp;
                ++p;

                count = 1;  
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println(swapCount(s));
  
        s = "[[][]]";
        System.out.println(swapCount(s));
    }
}
/**
 * OUTPUT
 * 
 * 2
 * 0
 * 
 */