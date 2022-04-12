package array;

/**
 * Minimum number of operations required to make an array palindrome
 */
public class program_34 {
    static int findMinOpsToMakeArrPalindrome(int[] arr, int n){
        int ans = 0;

        for(int i = 0, j = n - 1; i <= j;){
            if(arr[i] == arr[j]){
                i++;
                j--;
            }else if(arr[i] > arr[j]){
                j--;
                arr[j] += arr[j + 1];
                ans++;
            }else {
                i++;
                arr[i] += arr[i - 1];
                ans++;
            }
        }
    
        return ans;
    }

    public static void main(String[] args){
        // int arr[] = {1, 4, 5, 9, 1};

        // int arr[] = {15, 4, 15};

        int arr[] = {11, 14, 15, 99};

        System.out.println("Count of minimum operations is "+ findMinOpsToMakeArrPalindrome(arr, arr.length));
    }
}
/**
 * OUTPUT
 * 
 * Count of minimum operations is 1
 * 
 * ==================================
 * 
 * Count of minimum operations is 0
 * 
 * ==================================
 * 
 * Count of minimum operations is 3
 * 
 */