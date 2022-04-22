package matrix;

import java.util.HashMap;
import java.util.Map;

/**
 * Common elements in all rows of given matrix
 */
public class program_10 {
    static void printCommonElements(int arr[][], int m, int n){
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int j = 0; j < n; j++)
            map.put(arr[0][j], 1);

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(map.get(arr[i][j]) != null && map.get(arr[i][j]) == i){
                    map.put(arr[i][j], i + 1);

                    if(i == m - 1)
                        System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] ={  {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9} };
 
        printCommonElements(arr, arr.length, arr[0].length);
    }
}
/**
 * OUTPUT
 * 
 * 8 1 
 */