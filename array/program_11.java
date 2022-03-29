package array;

import java.util.Scanner;

/**
 * Find duplicate in an array of N+1 Integers
 */
public class program_11 {
    static void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");
         
        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printRepeating(arr, n);
        sc.close();
            
    }
}
/**
 ***** OUTPUT *****
Length of array : 5
1
3
4
2
2
The repeating elements are : 
2
=========================
Length of array : 5
3
1
3
4
2
The repeating elements are : 
3
=========================
Length of array : 7
1
2
3
1
3
6
6
The repeating elements are : 
1 3 6
 */