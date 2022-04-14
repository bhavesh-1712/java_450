package matrix;

import java.util.Arrays;

/**
 * Find median in a row wise sorted matrix
 */
public class program_3 {
    static int binaryMedian(int arr[][], int r, int c){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int i = 0; i < r; i++){

            if(arr[i][0] < min)
                min = arr[i][0];

            if(arr[i][c - 1] > max)
                max = arr[i][c - 1];
        }
        int desired = (r * c + 1) / 2;
        while(min < max){
            int mid = min + (max - min) / 2;
            int place = 0, get = 0;

            for(int i = 0; i < r; ++i){
                get = Arrays.binarySearch(arr[i], mid);

                if(get < 0)
                    get = Math.abs(get) - 1;
                else{
                    while(get < arr[i].length && arr[i][get] == mid)
                        get += 1;
                }

                place += get;
            }

            if(place < desired)
                min = mid + 1;
            else
                max = mid;
        }
        return min;
    }

    public static void main(String[] args){
        int r = 3, c = 3;
        int arr[][] = {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};

        System.out.println("Median is " + binaryMedian(arr, r, c));
    }
}
/**
 * OUTPUT
 * 
 * Median is 5
 */
