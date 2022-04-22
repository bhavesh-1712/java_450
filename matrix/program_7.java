package matrix;

/**
 * Find specific pair in matrix
 */
public class program_7 {
    static int findMaxValue(int n, int arr[][]){
        int max_value = Integer.MIN_VALUE;

        for(int a = 0; a < n - 1; a++){
            for(int b = 0; b < n - 1; b++){
                for(int d = a + 1; d < n; d++)
                    for(int e = b + 1; e < n; e++)
                        if(max_value < (arr[d][e] - arr[a][b]))
                            max_value = arr[d][e] - arr[a][b];
            }
        }

        return max_value;
    }

    public static void main(String[] args) {
        int n = 5;

        int arr[][] = {
                        { 1, 2, -1, -4, -20 },
                        { -8, -3, 4, 2, 1 },
                        { 3, 8, 6, 1, 3 },
                        { -4, -1, 1, 7, -6 },
                        { 0, -4, 10, -5, 1 }
                    };
        
        System.out.println("Maximum value is : "+findMaxValue(n, arr));
    }
}
