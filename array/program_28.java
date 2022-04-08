package array;

/**
 * Find the triplet that sum to a given value
 */
public class program_28 {
    static boolean findTriplet(int arr[], int arr_size, int sum){
        
        for(int i = 0; i < arr_size - 2; i++){
            for(int j = i + 1; j < arr_size - 1; j++){

                for(int k = i + 1; k < arr_size; k++){
                    if(arr[i] + arr[j] + arr[k] == sum){
                        System.out.println("Triplet is "+arr[i]+", "+arr[j]+", "+arr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        if(!findTriplet(arr, arr.length, sum)){
            System.out.println("Triplet not found");
        }
    }
}
/**
 * OUTPUT
 * 
 * Triplet is 4, 10, 8
 */