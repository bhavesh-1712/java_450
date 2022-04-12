package array;

/**
 * Minimum swaps required bring elements less than or equal to K together
 */
public class program_33 {
    static int minSwap(int arr[], int n, int k){
        int count = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] <= k)
                count++;
        }

        int bad = 0;
        for(int i = 0; i < count; i++){
            if(arr[i] > k)
                ++bad;
        }

        int ans = bad;
        for(int i = 0, j = count; j < n; ++i, ++j){
            if(arr[i] > k )
                --bad;
            
            if(arr[j] > k)
                ++bad;
            
            ans = Math.min(ans, bad);
        }
        return ans;
    }

    public static void main(String[] args){
        // int arr[] = {2, 1, 5, 6, 3};
        // int k = 3;

        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int k = 5;

        System.out.println("Minimum number of swaps : "+minSwap(arr, arr.length, k));
    }
}
/**
 * OUTPUT
 * 
 * Minimum number of swaps : 1
 * 
 * =====================
 * 
 * Minimum number of swaps : 2
 * 
 */
