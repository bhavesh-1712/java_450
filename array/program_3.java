package array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find the 'kth' minimum and maximum in an array
 */

class program_3 {
    
    static class MinMax{
        int min;
        int max;
    }

    public static MinMax kthMinMax(int[] arr){
        MinMax minMax = new MinMax();
        
        Arrays.sort(arr);

        minMax.max = arr[arr.length - 1];
        minMax.min = arr[0];
                  
        return minMax;
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
        
        MinMax minMax = kthMinMax(arr);

        System.out.printf("\nMinimum element is %d", minMax.min);
        System.out.printf("\nMaximum element is %d", minMax.max);

        sc.close();
    }
}

/**
 ***** OUTPUT ***** 
Length of array : 5

7
9
54
56
45

Minimum element is 7
Maximum element is 56
*/
