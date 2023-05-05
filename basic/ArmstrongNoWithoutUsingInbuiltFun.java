package basic;

import java.util.Scanner;

/**
 * Check whether if the given number is armstrong or not without using inbuilt function
 */
public class ArmstrongNoWithoutUsingInbuiltFun {
    static int power(int x, int y){
        if(y == 0)
            return 1;
        if(y % 2 == 0)
            return power(x, y/2) * power(x, y/2);
        return x*power(x, y/2) * power(x, y/2);
    }

    static int order(int x){
        int n = 0;
        while(x != 0){
            n++;
            x = x / 10;
        }
        return n;
    }

    static boolean isArmstrong(int x){
        int n = order(x);
        int temp = x, sum = 0;

        while(temp != 0){
            int rem = temp % 10;
            sum += power(rem, n);
            temp = temp / 10;
        }

        return (sum == x);
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
 * Armstrong Number : Armstrong number is a number that is equal to the sum of cubes of its digits.
 * OUTPUT 
 * 
 * 121
 * 121 is not an Armstrong number
 * 
 * ==================================
 * 
 * 153
 * 153 is an Armstrong number.
 * 
 * ==================================
 * 
 * 371
 * 371 is an Armstrong number.
 * 
 */
