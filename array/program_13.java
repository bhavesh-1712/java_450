package array;
/**
 * Kadane's Algorithm
 * OR
 * Program to print largest contiguous array sum
 */
public class program_13 {
    static int maxSubArrSum(int a[]){
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for(int i = 0; i < a.length; i++){
            max_ending_here = max_ending_here + a[i];

            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }

        return max_so_far;
    }
    
    public static void main(String[] args){
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        
        // int[] a = {1, 4, -9, 3, -6, -2, 4, 5};

        System.out.println("Maximum continous sum is : "+maxSubArrSum(a));
    }
}
/**
 * OUTPUT
 * 
 * Maximum continous sum is : 7
 * 
 * ===================================
 * 
 * Maximum continous sum is : 9
 */