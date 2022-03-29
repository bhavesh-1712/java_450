package array;

/**
 * Merge Without Extra Space
 */
public class program_12 {
    // Function to find next gap.
    private static int nextGap(int gap){
        if (gap <= 1)
            return 0;
        return (gap / 2) + (gap % 2);
    }
    
    private static void mergeArr(int[] arr1, int[] arr2, int n, int m){
        
        int i, j, gap = n + m;
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)){
            // comparing elements in the first array.
            for (i = 0; i + gap < n; i++){
                if (arr1[i] > arr1[i + gap])
                {
                    int temp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = temp;
                }
            }
 
            // comparing elements in both arrays.
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++){
                if (arr1[i] > arr2[j])
                {
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
 
            if (j < m)
            {
                // comparing elements in the
                // second array.
                for (j = 0; j + gap < m; j++){
                    if (arr2[j] > arr2[j + gap])
                    {
                        int temp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        // int[] a1 = { 10, 27, 38, 43, 82 };
        // int[] a2 = { 3, 9 };

        int[] a1 = {3, 27, 38, 43}; 
        int[] a2 = {9, 10, 82};
 
        // Function Call
        mergeArr(a1, a2, a1.length, a2.length);
 
        System.out.print("First Array: ");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
 
        System.out.println();
 
        System.out.print("Second Array: ");
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}

/**
 ****** OUTPUT *****
First Array: 3 9 10 27 38 
Second Array: 43 82 
====================================
First Array: 3 9 10 27 
Second Array: 38 43 82
 */