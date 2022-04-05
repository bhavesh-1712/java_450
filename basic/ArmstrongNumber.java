package basic;

import java.util.Scanner;

/**
 * Check whether if the given number is Armstrong number or not.
 */
public class ArmstrongNumber {
    static boolean isArmstrong(int no){
        int temp = no, rem, result = 0;

        while(temp != 0){
            rem = temp % 10;
            result += Math.pow(rem, 3);
            temp /= 10;
        }

        return (no == result);
    }   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no = sc.nextInt();

        if(isArmstrong(no))
            System.out.println(no + " is an Armstrong number.");
        else
            System.out.println(no + " is not an Armstrong number");

        sc.close();
    }
}
/**
 * OUTPUT :
 * 
 * 153
 * 153 is an Armstrong number.
 * ==================================
 * 
 * 121
 * 121 is not an Armstrong number
 * 
 * ==================================
 * 
 * 371
 * 371 is an Armstrong number.
 * 
 */