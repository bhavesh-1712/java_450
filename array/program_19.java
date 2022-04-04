package array;

/**
 * Find common element in 3 sorted arrys
 */
public class program_19 {
    static void findCommonElement(int arr1[], int arr2[], int arr3[]) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {

            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr3[k])
                j++;
            else
                k++;
        }
    }

    public static void main(String[] args) {
        
        // int ar1[] = {1, 5, 10, 20, 40, 80};
        // int ar2[] = {6, 7, 20, 80, 100};
        // int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
 
        int ar1[] = {1, 5, 5};
        int ar2[] = {3, 4, 5, 5, 10};
        int ar3[] = {5, 5, 10, 20};

        System.out.print("Common elements are ");
        findCommonElement(ar1, ar2, ar3);

    }
}
/**
 * OUTPUT : 
 * 
 * Common elements are 20 80
 * 
 * ============================
 * 
 * Common elements are 5 5
 * 
 * ============================
 * 
 * NOTE : Time complexity of this solution is O(n1 + n2 + n3) where n1, n2 and n3 are sizes of ar1[], ar2[] and ar3[] respectively.
 */