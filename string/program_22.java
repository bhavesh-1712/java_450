package string;

/**
 * Count all palindromic subsequence in a given string
 */
public class program_22 {
    static int countPaliSub(String str, int n){
    
        int[][] cps = new int[n][n];

        for(int i = 0; i < n; i++)
            cps[i][i] = 1;
        
        for(int l = 2; l <= n; l++){
            for(int i = 0; i <= n - l; i++){
                int k = l + i - 1;
                if(str.charAt(i) == str.charAt(k)){
                    cps[i][k] = cps[i][k - 1] + cps[i + 1][k] + 1;
                }else{
                    cps[i][k] = cps[i][k - 1] + cps[i + 1][k] - cps[i + 1][k - 1];
                }
            }
        }

        return cps[0][n - 1];
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Total palindromic subsequence are : "+countPaliSub(str, str.length()));
    }
}
/**
 * OUTPUT
 * 
 * Total palindromic subsequence are : 4
 * 
 */