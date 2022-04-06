package array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Find longest consecutive subsequence
 */
public class program_24 {
    static int findLongestConsecutiveSubSeq(int arr[], int length){
        Arrays.sort(arr);

        int ans = 0, count = 0;

        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(10);

        for(int i = 1; i < length; i++){
            if(arr[i] != arr[i - 1])
                v.add(arr[i]);
        }

        for(int i = 0; i < v.size(); i++){
            if(i > 0 && v.get(i) == v.get(i - 1) + 1)
                count++;
            else
                count = 1;

            ans = Math.max(ans, count);
        }

        return ans;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
 
        int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};

        System.out.println(
            "Length of the Longest contiguous subsequence is " + findLongestConsecutiveSubSeq(arr, arr.length));
    }
}
/**
 * OUTPUT
 * 
 * Length of the Longest contiguous subsequence is 3
 * 
 * ===================================================
 * 
 * Length of the Longest contiguous subsequence is 4
 * 
 */