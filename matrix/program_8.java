package matrix;

/**
 * Rotate matrix by 90 degree
 */
public class program_8 {
    // first approach
    // static void rotate90Clockwise(int a[][], int n){
    //     for(int i = 0; i < n /2; i++){
    //         for(int j = i; j < n - 1; j++){
                
    //             int temp = a[i][j];
    //             a[i][j] = a[n - 1 - j][i];
    //             a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];
    //             a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];
    //             a[j][n - 1 - i] = temp;
    //         }
    //     }
    // }

    // second approach
    static void rotate90Clockwise(int arr[][], int n){
        for(int j = 0; j < n; j++){
            for(int i = n - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    static void printMatrix(int arr[][], int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };
        
        rotate90Clockwise(arr,arr.length);
        // printMatrix(arr,arr.length);
    }
}

/**
 * OUTPUT
 * 
 * 13 9 5 1  
 * 14 10 6 2 
 * 15 11 7 3 
 * 16 12 8 4 
 * 
 */