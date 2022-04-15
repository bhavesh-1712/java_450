package matrix;

/**
 * Find the row with maximum number of 1's
 */
public class program_4{

    static int first(int arr[], int low, int high){
        if(high >= low){
            int mid = low + (high - low) / 2;

            if(( mid == 0 || arr[mid - 1] == 0) && arr[mid] == 1)
                return mid;
            else if(arr[mid] == 0)
                return first(arr, (mid + 1), high);
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }

    static int rowWithMaxOneS(int arr[][], int r, int c){
        int max_row_idx = 0, max = -1;
        int i, index;

        for(i = 0; i < r; i++){
            
            index = first(arr[i], 0, (c - 1));

            if(index != -1 && c - index > max){
                max = c - index;
                max_row_idx = i;
            }
        }
        return max_row_idx;
    }

    public static void main(String[] args) {
        
        int mat[][] = {{0, 0, 0, 1},
                       {0, 1, 1, 1},
                       {1, 1, 1, 1},
                       {0, 0, 0, 0}};
 
        System.out.print("Index of row with maximum 1s is " + rowWithMaxOneS(mat, 4, 4));       
    }
}
/**
 * OUTPUT : 
 * 
 * Index of row with maximum 1s is 2
 * 
 */