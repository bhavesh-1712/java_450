package array;

/**
 * Find the union and intersection of two SORTED ARRAYS
 */
public class program_6 {

    static int printUnion(int arr1[], int arr2[], int m, int n) {
        System.out.println("Union numbers are : ");

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])          //Compare element of arr1 is less than element of arr2 
                System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i])     //Compare element of arr2 is less than element of arr1
                System.out.print(arr2[j++] + " ");
            else {                          // If above both conditions not satisified means this bothe numbers are equal
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }

        while (i < m)
            System.out.print(arr1[i++] + " ");
        while (j < n)
            System.out.print(arr2[j++] + " ");

        return 0;
    }

    static void printIntersection(int arr1[], int arr2[], int m, int n) {
        System.out.println("Intersection numbers are : ");
        
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])          //Compare element of arr1 is less than element of arr2 
                i++;
            else if (arr2[j] < arr1[i])     //Compare element of arr2 is less than element of arr1
                j++;
            else {                          // If above both conditions not satisified means this bothe numbers are equal
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = { 2, 3, 5, 7 };

        printUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println();
        printIntersection(arr1, arr2, arr1.length, arr2.length);
    }
}

/**
 ***** OUTPUT *****
Union numbers are : 
1 2 3 4 5 6 7 
Intersection numbers are :
2 3 5 7
 */