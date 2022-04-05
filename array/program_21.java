package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Find if there is any subarray with sum equal to 0
 */
public class program_21 {
    
    static boolean checkSubArraySum0(int arr[]){
        Set<Integer> hs = new HashSet<Integer>();

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];

            if(arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;
            
            hs.add(sum);
        }

        return false;
    }

    public static void main(String[] args) {
        // int arr[] = {-3, 2, 3, 1, 6};
        // int arr[] = {4, 2, -3, 1, 6};
        int arr[] = {4, 2, 0, 1, 6};

        if(checkSubArraySum0(arr))
            System.out.println("Subarray is present with sum 0");
        else
            System.out.println("No such subarray is present");        
    }
}
/**
 * OUTPUT
 * 
 * No such subarray is present
 * 
 * ================================
 * 
 * Subarray is present with sum 0
 * 
 * ================================
 * 
 * Subarray is present with sum 0
 */
