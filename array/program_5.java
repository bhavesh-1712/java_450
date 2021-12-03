package array;

import java.util.Scanner;

/**
 * Move all the negative elements to one side of an array.
 */

public class program_5 {
    static void sort(int arr[], int arrLength){
        int j = 0, temp;
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    //this method print array
    static void printArray(int arr[], int arrLength){
        
        for(int i = 0 ; i < arrLength ; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Length of array : ");
        int n = sc.nextInt();
        System.out.println();

        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        sort(arr, arr.length);

        System.out.println("Sorted Array :");

        printArray(arr, arr.length);
        sc.close();
    }
}

/**
 ***** OUTPUT *****
Length of array : 6

-2
34
-42
49
-7
43
Sorted Array :
 -2 -42 -7 49 34 43
 */