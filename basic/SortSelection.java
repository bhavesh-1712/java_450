package basic;

/**
 * Selection Sort
 */
public class SortSelection {
    static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++)
                if(arr[j] < arr[min_idx])
                    min_idx = j;

            //swap element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
    public static void main(String[] args) {
        // int arr[] = {64,25,12,22,11};

        int arr[] = {100, 3, 45, 98, 90};

        selectionSort(arr);
        System.out.println("Sorted Array : ");
        printArr(arr);
    }
}
/**
 * OUTPUT
 * 
 * Sorted Array : 
 * 11 12 22 25 64
 * 
 * ============================
 * 
 * Sorted Array : 
 * 3 45 90 98 100 
 * 
 */