package string;

import java.util.Arrays;

/**
 * Word wrap problem
 */
public class program_13 {
    int solveWordWrap(int[] nums, int k){
        int[][] memo = new int[nums.length][k + 1];
        for(int i = 0; i < nums.length; i++){
            Arrays.fill(memo[i], -1);
        }
        return solveWordWrapUsingMemo(nums, nums.length, k, 0, k, memo);
    }

    static int solveWordWrap(int[] words, int n, int length, int wordIndex, int remLength, int[][] memo){
        if(wordIndex == n - 1){
            memo[wordIndex][remLength] = words[wordIndex] < remLength ? 0 : square(remLength);
            return memo[wordIndex][remLength];
        }
        int currWord = words[wordIndex];
        if(currWord < remLength){
            return Math.min(
                solveWordWrapUsingMemo(words, n, length, wordIndex + 1, remLength == length ? remLength - currWord : remLength - currWord - 1, memo),

                square(remLength) + solveWordWrapUsingMemo(words, n, length, wordIndex + 1, length - currWord, memo));
        }else{
            return square(remLength) + solveWordWrapUsingMemo(words, n, length, wordIndex + 1, length - currWord, memo);
        }
    }

    static int solveWordWrapUsingMemo(int[] words, int n, int length, int wordIndex, int remLength, int[][] memo) {
        if (memo[wordIndex][remLength] != -1) {
            return memo[wordIndex][remLength];
        }
 
        memo[wordIndex][remLength] = solveWordWrap(words, n, length, wordIndex, remLength, memo);
        return memo[wordIndex][remLength];
    }
 
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        System.out.println(new program_13().solveWordWrap(new int[]{3, 2, 2, 5}, 6));
    }
}
/**
 * OUTPUT
 * 
 * 10
 * 
 */