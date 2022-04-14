package matrix;

/**
 * Search element in a matrix
 */
public class program_2 {
    static void search(int arr[][], int n, int ele){
        if(n == 0)
            return;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == ele){
                    System.out.println("Element found");

                    return;
                }
            }
        }

        System.out.println("Element not found");
        return;
    }
    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        
        search(arr, 4, 29);
    }
}
/**
 * OUTPUT
 * 
 * Element found
 * 
 */