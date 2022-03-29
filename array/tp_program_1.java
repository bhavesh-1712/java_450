package array;

import java.util.Scanner;

/**
 * Find duplicate in an array of N+1 Integers
 */
public class tp_program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();

        for(int i = 0; i < s1.length(); i++) {
            int index = (int) s1.charAt(i);

            int revCharIndex = 122 - index;

            System.out.print((char) (revCharIndex + 97));
        }
        sc.close();
    }
}
/**
Input String : abcd

Output String : zyxw.
 */