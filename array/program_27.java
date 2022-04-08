package array;

/**
 * Find whether an array is subset of another array
 */
public class program_27{
    static boolean isSubset(int arr1[], int arr2[], int m, int n){
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++)
                if(arr2[i] == arr1[j])
                    break;
        
            // If the above inner loop was not broken at all then arr2[i] is not present in arr1[] 
            if(j == m)
                return false;
        }

        return true;
    }

    public static void main(String args[]){
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };

 
        if (isSubset(arr1, arr2, arr1.length, arr2.length))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not a subset of arr1[]");
    }
}
/**
 * OUTPUT
 * 
 * arr2[] is subset of arr1[]
 */