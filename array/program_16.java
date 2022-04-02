package array;

/**
 * Count Inversion
 */
public class program_16 {
    
    static int getInversionCount(int arr[], int lenth){
        
        int inv_count = 0;

        for(int i = 0; i < lenth - 1; i++)
            for(int j = i + 1; j < lenth; j++)
                if(arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }

    public static void main(String[] args){
        // int arr[] = { 1, 20, 6, 4, 5 };

        // int arr[] = {8, 4, 2, 1};

        int arr[] = {3, 1, 2};

        System.out.println("Number of inversions are : "+getInversionCount(arr, arr.length));
    }

}
/**
 * OUTPUT
 * 
 * Number of inversions are : 5
 * 
 * ==================================
 * 
 * Number of inversions are : 6
 * 
 * ==================================
 * 
 * Number of inversions are : 2
 */