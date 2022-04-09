package array;
/**
 * Trapping rain water problem
 */
public class program_29 {
    public static int maxWater(int[] arr, int n){
        int res = 0;

        for(int i = 1; i < n - 1; i++){
            int left = arr[i];
            for(int j = 0; j < i; j++){
                left = Math.max(left, arr[j]);
            }

            int right = arr[i];
            for(int j = i + 1; j < n; j++){
                right = Math.max(right, arr[j]);
            }

            res += Math.min(left, right) - arr[i];
        }
        return res;
    }

    public static void main(String[] args){
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.print(maxWater(arr,arr.length));
    }
}
/**
 * OUTPUT
 * 
 * 6
 * 
 * ===================
 * 
 * NOTE : 
 * 
 * Time Complexity == O(n2) == There are two nested loops traversing the array, So time Complexity is O(n2).
 * 
 * Space Complexity == O(1) == No extra space is required.
 * 
 */