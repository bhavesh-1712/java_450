package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Program to generate all possible valid IP addresses from given string.
 */
public class program_32 {
    static boolean isValid(String ip){
        String a[] = ip.split("[.]");

        for(String s : a){
            int i = Integer.parseInt(s);
            if(s.length() > 3 || i < 0 || i > 255)
                return false;
            if(s.length() > 1 && i == 0)
                return false;
            if(s.length() > 1 && i != 0 && s.charAt(0) == '0')
                return false;
        }

        return true;
    }
    static ArrayList<String> convert(String str){
        ArrayList<String> l = new ArrayList<>();
        int size = str.length();

        String sNew = str;

        for(int i = 1; i < size - 2; i++){
            for(int j = i + 1; j < size - 1; j++){
                for(int k = j + 1; k < size; k++){
                    sNew = sNew.substring(0, k) + "." + sNew.substring(k);
                    sNew = sNew.substring(0, j) + "." + sNew.substring(j);
                    sNew = sNew.substring(0, i) + "." + sNew.substring(i);

                    if(isValid(sNew))
                        l.add(sNew);
                }
                sNew = str;
            }
        }

        Collections.sort(l, new Comparator<String>(){
            public int compare(String o1, String o2){
                String a1[] = o1.split("[.]");
                String a2[] = o2.split("[.]");

                int result = -1;
                for(int i = 0; i < 4 && result != 0; i++)
                    result = a1[i].compareTo(a2[i]);
                return result;
            }
        });

        return l;
    }
    static ArrayList<String> restoreIPAddresses(String str){
        if(str.length() < 3 || str.length() > 12)
            return new ArrayList<>();
        return convert(str);
    }
    public static void main(String[] args) {
        String str = "25525511135";
        
        System.out.println(restoreIPAddresses(str.toString()));
    }
}
