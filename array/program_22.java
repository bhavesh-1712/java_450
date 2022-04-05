package array;

import java.util.Scanner;

/**
 * Find factorial of large number
 */
public class program_22 {
    static int multiply(int x, int res[], int res_size){
        int carry = 0;

        for(int i = 0; i < res_size; i++){
            int prod = res[i] * x + carry;

            res[i] = prod % 10;

            carry = prod / 10;
        }

        while(carry != 0){
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

    static void factorial(int no){
        int res[] = new int[500];

        res[0] = 1;
        int res_size = 1;

        for(int x = 2; x <= no; x++)
            res_size = multiply(x, res, res_size);
        
        System.out.println("Factorial of given number is");
        for(int i = res_size - 1; i >= 0; i--)
            System.out.print(res[i]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        factorial(sc.nextInt());

        sc.close();
    }
}
/**
 * OUTPUT
 * 
 * 200
 * Factorial of given number is
 * 788657867364790503552363213932185062295135977687173263294742533244359449963403342920304284011984623904177212138919638830257642790242637105061926624952829931113462857270763317237396988943922445621451664240254033291864131227428294853277524242407573903240321257405579568660226031904170324062351700858796178922222789623703897374720000000000000000000000000000000000000000000000000
 * 
 * ==================================================================
 * 
 * 150
 * Factorial of given number is
 * 57133839564458545904789328652610540031895535786011264182548375833179829124845398393126574488675311145377107878746854204162666250198684504466355949195922066574942592095735778929325357290444962472405416790722118445437122269675520000000000000000000000000000000000000
 */