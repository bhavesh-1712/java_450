package matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * Spiral traversal on a matrix
 */
public class program_1 {

    static List<Integer> printSpiralOrder(int[][] arr){
        List<Integer> ans = new ArrayList<Integer>();

        if(arr.length == 0)
            return ans;
        
        int R = arr.length, C = arr[0].length;
        boolean[][] seen = new boolean[R][C];

        int[] dr = { 0, 1, 0, -1};
        int[] dc = { 1, 0, -1, 0};
        int r = 0, c = 0, di = 0;

        for(int i = 0; i < R * C; i++){
            ans.add(arr[r][c]);
            seen[r][c] = true;
            
            int cr = r + dr[di];
            int cc = c + dc[di];

            if(0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
                r = cr;
                c = cc;
            }else{
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int arr[][] = {{1, 2, 3, 4},
                     {5, 6, 7, 8},
                     {9, 10, 11, 12},
                     {13, 14, 15, 16}};
        
        System.out.println(printSpiralOrder(arr));
    }
}
/**
 * OUTPUT
 * 
 * [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
 * 
 */