package string;

/**
 * Find the longest common subsequence between two string
 */
public class program_31 {
    static int lcs(char[] X, char[] Y, int m, int n){
        if(m == 0 || n == 0)
            return 0;
        if(X[m - 1] == Y[n - 1])
            return 1 + lcs(X, Y, m - 1, n - 1);
        else
            return max(lcs(X, Y, m - 1, n), lcs(X, Y, m, n - 1));
    }
    static int max(int a, int b){
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
 
        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
 
        System.out.println("Length of LCS is "+ lcs( X, Y, X.length, Y.length ) );
    }
}
/**
 * OUTPUT
 * 
 * Length of LCS is 4
 * 
 */