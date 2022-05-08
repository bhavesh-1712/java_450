package string;

import java.util.Scanner;

/**
 * Convert a sentence into its equivalent mobile numeric keypad sequence.
 */
public class program_20 {
    static String printSequence(String str[], String s){
        String output = "";
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ')
                output += "0";
            else{
                int pos = s.charAt(i) - 'A';
                output += str[pos];
            }
        }

        return output;
    }
    public static void main(String[] args) {
        String str[] = {"2", "22", "222",
                        "3", "33", "333",
                        "4", "44", "444",
                        "5", "55", "555",
                        "6", "66", "666",
                        "7", "77", "777", "777",
                        "8", "88", "888",
                        "9", "99", "999", "9999"
                    };
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(printSequence(str, s.toUpperCase()));
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * BHAVESH
 * 224428883377744
 * 
 */
