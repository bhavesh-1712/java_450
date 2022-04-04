package array;

/**
 * Rearrange the array in alternating positive and negative items with O(1) extra space
 */
public class program_20 {
    void rightRotate(int arr[], int n, int outOfPlace, int cur){
        int tmp = arr[cur];

        for(int i = cur; i > outOfPlace; i--)
            arr[i] = arr[i - 1];
        arr[outOfPlace] = tmp;
    }

    void rearrange(int arr[], int n){
        int outOfPlace = -1;

        for(int index = 0; index < n; index++){
            if(outOfPlace >= 0){
                if(((arr[index] >= 0) && (arr[outOfPlace] < 0)) || ((arr[index] < 0) && (arr[outOfPlace] >= 0))){
                    rightRotate(arr, n, outOfPlace, index);

                    if(index - outOfPlace >= 2)
                        outOfPlace = outOfPlace + 2;
                    else
                        outOfPlace = -1;
                }
            }

            if(outOfPlace == -1){
                if(((arr[index] >= 0) && ((index & 0x01) == 0)) || ((arr[index] < 0) && (index & 0x01) == 1))
                    outOfPlace = index;
            }
        }
    }

    void printArr(int arr[], int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        program_20 pr = new program_20();

        // int arr[] = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int arr[] = {1, 2, 3, -4, -1, 4};

        int n = arr.length;
    
        System.out.println("Given array is ");
        pr.printArr(arr, n);
    
        pr.rearrange(arr, n);

        System.out.println("Rearranged array is ");
        pr.printArr(arr, n);
    }
}
/**
 * OUTPUT :
 * 
 * Given array is 
 * -5 -2 5 2 4 7 1 8 0 -8 
 * Rearranged array is
 * -5 5 -2 2 -8 4 7 1 8 0
 * 
 * ===============================================
 * 
 * Given array is 
 * 1 2 3 -4 -1 4 
 * Rearranged array is
 * -4 1 -1 2 3 4
 * 
 * ===============================================
 * 
 * NOTE : Time Complexity : O(N^2)
 *        Space Complexity : O(1)
 */