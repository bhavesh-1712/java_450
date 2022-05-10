package DAA;

import java.util.*;

/**
 * implement longest common subsequence (Dynamic programming)
 * 
 * time complexity O(n * m)
 * 
 * Note : Since we are using two for loops for both the strings ,
 * therefore the time complexity of finding the longest common subsequence 
 * using dynamic programming approach is O(n * m) where n and m are the lengths of the strings.
 */
public class assignment_4
{
	static int lcs(char[] a, char[] b, int m, int n){
		if(m == 0 || n == 0)
			return 0;

		if(a[m - 1] == b[n - 1])
			return 1 + lcs(a, b, m - 1, n - 1);
		else	
			return max(lcs(a, b, m, n - 1), lcs(a, b, m - 1, n));
	}

	static int max(int a, int b){
		return (a > b) ? a : b;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char a[] = sc.nextLine().toCharArray(), b[] = sc.nextLine().toCharArray();

		int m = a.length, n = b.length;

		System.out.println("Length of LCS: " + lcs(a, b, m, n));
		sc.close();
	}
	
}

