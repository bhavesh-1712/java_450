package DAA;

import java.util.Scanner;

/**
 * implement program to find minimum and maximum element from given list using divide and conquer.
 * 
 * time complexity = O(nlog(n))
 */
public class assignment_2 {
    static int[] minmax(int arr[], int i, int j, int min, int max){
        int p[] = new int[2];
        int q[] = new int[2];

        if(i == j){
            p[0] = p[1] = arr[i];
            return p;
        }else if((j - i) == 1){
            if(arr[i] <= arr[j]){
                min = arr[i];
                max = arr[j];
            }else{
                min = arr[j];
                max = arr[i];
            }
            p[0] = min;
            p[1] = max;
            return p;
        }else{
            int m = (i + j) / 2;
            p[0] = min;
            p[1] = max;
            q[0] = min;
            q[1] = max;

            p = minmax(arr, i, m, min, max);
            q = minmax(arr, (m + 1), j, q[0], q[1]);

            if(p[0] >= q[0])
                p[0] = q[0];

            if(p[1] <= q[1])   
                p[1] = q[1];
            
            return p;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c;

        do{
            System.out.println("Enter no of elements : ");
            int min, max, i, n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("\nEnter "+n+" elements : ");
            for(i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            System.out.println("\nGiven Array : ");
            for(i = 0; i < n; i++)
                System.out.print(arr[i]+" ");
            
            min = max = arr[0];
            int a[] = new int[2];

            a = minmax(arr, 0, (n-1), min, max);

            min = a[0];
            max = a[1];

            System.out.println("\nMax is : "+max+"\nMin is : "+min);
            System.out.println("\nDo you want to continue ? (0 to exit) : ");
            c = sc.nextInt();
        }while(c != 0);
    
        sc.close();
    }
}
