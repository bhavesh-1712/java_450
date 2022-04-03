package array;

/**
 * Find all pairs on integer array whose sum is equal to given number
 */
public class program_18 {
    static void getPairsCount(int[] arr, int sum){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[i] + arr[j] == sum)){
                    count++;
                }
            }
        }

        System.out.println("Count of pairs is : "+count);
    }

    public static void main(String[] args){
        // int[] arr = { 1, 5, 7, -1, 5 };
        // int sum = 6;

        // int arr[] = {1, 5, 7, 1};
        // int sum = 6;

        int arr[] = {1, 1, 1, 1};
        int sum = 2;

        getPairsCount(arr, sum);
    }
}
/**
 * OUTPUT :
 * 
 * Count of pairs is : 3
 * 
 * =========================
 * 
 * Count of pairs is : 2
 * 
 * ========================
 * 
 * Count of pairs is : 6
 */