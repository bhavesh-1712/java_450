package array;

import java.util.Arrays;

/**
 * Write a program to cyclically rotate an array by one.
 */
class program_7 {

    static void rotateArray(int a[], int aLength){
        int temp = a[aLength-1];

        for(int i = aLength-1; i > 0; i--)
            a[i] = a[i-1];
        
        a[0] = temp;
    }

    public static void main(String[] args) {
        int a[] = {4, 32, 24, 53, 25, 24};
        System.out.println("Default Array : ");
        System.out.println(Arrays.toString(a));

        rotateArray(a, a.length);

        System.out.println("Rotated Array : ");
        System.out.println(Arrays.toString(a));
    }
}
/**
 ***** OUTPUT *****
Default Array : 
[4, 32, 24, 53, 25, 24]
Rotated Array :
[24, 4, 32, 24, 53, 25]
 */