package DAA;
import java.util.*;

public class assignment_3
{
	public static void sol(int[] a, int n)
	{
		int mrt = 0;
		Arrays.sort(a);
		
		System.out.println("\nOptimal Soln is:");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
			mrt += (n - i) * a[i];
		}
		
		System.out.println();
		System.out.println("\nMRT = " + mrt);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter no of Elements:");
		int i, n = sc.nextInt();
		int[] a = new int[n];
		
		System.out.println("\nEnter " + n + " Elements:");
		
		for(i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("\nGiven Array is:");
		
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
		sc.close();
		System.out.println();
		
		sol(a, n);
		
		System.out.println("\nEnd of Program");
	}

}
