package array;

/**
 * Find maximum product subarray
 */
public class program_23{
    static int maxSubArrProduct(int arr[]){
        int result = arr[0], n = arr.length;
        
        for(int i = 0; i < n; i++){
            int mul = arr[i];

            for(int j = i + 1; j < n; j++){
                result = Math.max(result, mul);
                mul *= arr[j];
            }

            result = Math.max(result, mul);
        }

        return result;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, -2, -3, 0, 7, -8, -2 };

        // int arr[] = {6, -3, -10, 0, 2};

        // int arr[] = {-1, -3, -10, 0, 60};

        int arr[] = {-2, -40, 0, -2, -3};

        System.out.println("Maximum Sub array product is " + maxSubArrProduct(arr));
    }
}
/**
 * OUTPUT
 * 
 * Maximum Sub array product is 112
 * 
 * ========================================
 * 
 * Maximum Sub array product is 180
 * 
 * ========================================
 * 
 * Maximum Sub array product is 60
 * 
 * ========================================
 * 
 * Maximum Sub array product is 80
 * 
 */