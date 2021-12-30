package array;

import java.util.Scanner;

/**
 * Minimum no. of Jumps to reach end of an array
 */
public class program_10 {
    static int minJumps(int arr[], int l, int h)
    {
        if (h == l)
            return 0;
 
        if (arr[l] == 0)
            return Integer.MAX_VALUE;
 
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Minimum number of jumps to reach end is " + minJumps(arr, 0, n - 1));
        sc.close();
    }
}
/**
 ***** OUTPUT *****
Length of array : 6
1
3
6
1
0
9
Minimum number of jumps to reach end is 3
=========================
Length of array : 11
1
3
5
8
9
2
6
7
8
69
9
Minimum number of jumps to reach end is 3
=========================
Length of array : 6
1
4
3
2
6
7
Minimum number of jumps to reach end is 2
 */