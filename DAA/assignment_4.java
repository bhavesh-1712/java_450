package DAA;

import java.util.*;

public class assignment_4
{
	static int lcs(String a, String b, int m, int n, int dp[][])
	{
		if(m == 0 || n == 0)
		{
			return 0;
		}

		if(dp[m - 1][n - 1] != -1)
		{
			return dp[m - 1][n - 1];
		}

		if(a.charAt(m - 1) == b.charAt(n - 1))
		{
			dp[m - 1][n - 1] = 1 + lcs(a, b, m - 1, n - 1, dp);
			return dp[m - 1][n - 1];
		}
		
		else
		{
			int z = lcs(a, b, m, n - 1, dp), y = lcs(a, b, m - 1, n, dp);
			dp[m - 1][n - 1] =  z > y ? z : y;
			return dp[m - 1][n - 1];
		}
		
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine().toLowerCase(), b = sc.nextLine().toLowerCase();
		int maximum = a.length() * b.length(); 
		int m = a.length(), n = b.length(), dp[][] = new int[m][maximum];

		for(int[] row : dp)
		{
			Arrays.fill(row, -1);
		}

		System.out.println("Length of LCS: " + lcs(a, b, m, n, dp));
		sc.close();
	}
	
}

