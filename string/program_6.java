package string;

import java.util.Arrays;

/**
 *  Write a program to check whether a strings are valid shuffle of two string or not
 */
public class program_6 {
    static boolean checkLength(String first, String second, String result){
        if(first.length() + second.length() != result.length())
            return false;
        else
            return true;
    }

    static String sortString(String str){
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    static boolean shuffleCheck(String first, String second, String result){
        first = sortString(first);
        second = sortString(second);
        result = sortString(result);

        int i = 0, j = 0, k = 0;
        while(k != result.length()){
            if(i < first.length() && first.charAt(i) == result.charAt(k))
                i++;
            else if(j < second.length() && second.charAt(j) == result.charAt(k))
                j++;
            else
                return false;

            k++;
        }
        
        if(i < first.length() || j < second.length())
            return false;
        
        return true;
    }
    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};

        for(String r : results){
            if(checkLength(first,second,r) && shuffleCheck(first, second, r))
                System.out.println(r + " is a valid shuffle of "+ first +" and "+ second);
            else
                System.out.println(r + " is not a valid suffle of "+ first +" and "+ second);
        }
    }
}
