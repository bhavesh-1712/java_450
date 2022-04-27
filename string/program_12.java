package string;

import java.util.Scanner;

/**
 * Split the binary string into two substring with equal 0's and 1's
 */

class program_12{
    static int maxSubStr(String str, int length){
        int count0 = 0, count1 = 0;

        int cnt = 0;

        for(int i = 0; i < length; i++){
            if(str.charAt(i) == '0')
                count0++;
            else
                count1++;
            
            if(count0 == count1){
                cnt++;
            }
        }

        if(count0 != count1)
            return -1 + cnt;
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Max Substrings : "+maxSubStr(str, str.length()));
        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * Enter a string : 
 * 0100110101
 * Max Substrings : 4
 */