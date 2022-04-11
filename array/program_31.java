package array;

/**
 * Smallest subarray with sum greater than a given value
 */
public class program_31{
    static int smallSubWithSum(int arr[], int n, int x){
        int min_len = n + 1;

        for(int start = 0; start < n; start++){
            int curr_sum = arr[start];  

            if(curr_sum > x)
                return 1;
            
            for(int end = start + 1; end < n; end++){
                curr_sum += arr[end];

                if(curr_sum > x && (end - start + 1) < min_len)
                    min_len = (end - start + 1);
            }
        }
        return min_len;
    }

    public static void main(String[] args){
        // int arr[] = {1, 4, 45, 6, 10, 19};
        // int x = 51;

        // int arr[] = {1, 10, 5, 2, 7};
        // int x = 9;

        int arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int x = 280;

        int res1 = smallSubWithSum(arr, arr.length, x);
        if (res1 == arr.length + 1)
           System.out.println("Not Possible");
        else
           System.out.println(res1);
    }
}
/**
 * OUTPUT :
 * 
 * 3
 * 
 * =================
 * 
 * 1
 * 
 * =================
 * 
 * 4
 * 
 */