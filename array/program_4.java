package array;

import java.util.Scanner;

/**
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */

class program_4 {
    static void sort(int arr[], int arrLength){
        int low = 0;
        int high = arrLength - 1;
        int mid = 0, temp = 0;

        while (mid <= high) {
            switch (arr[mid]) {
            case 0:
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
                break;
            case 1:
                mid++;
                break;
            case 2:
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
                break;
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

0
0
1
2
2
1
Sorted Array :
 0 0 1 1 2 2
*/


/**
 ***** ALGORITHM ***** 
1. Keep three indices low = 1, mid = 1 and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
2. Traverse the array from start to end and mid is less than high. (Loop counter is i)
3. If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1
4. If the element is 1 then update mid = mid + 1
5. If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1. As the swapped element is not processed
6. Print the output array.
 * 
 */