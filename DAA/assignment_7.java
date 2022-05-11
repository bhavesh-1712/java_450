package DAA;

import java.util.*;

/**
 * Write a non-recursive program to check whether Hamiltonian path exists in undirected graph or not. If exists print it. 
 * (backtracking).
 * 
 * time complexity = O(2^n * n^2)
 * 
 * Note : Time complexity of the above algorithm is O(2^n * n^2). Depth first search and backtracking 
 * can also help to check whether a Hamiltonian path exists in a graph or not. 
 * Simply apply depth first search starting from every vertex v and do labeling of all the vertices.
 */
public class assignment_7 {
    static void ham(int a[][], int n, int e) {
        Stack<Integer> S = new Stack<Integer>();
        S.push(0);

        for (int i = 0; i < n; i++) {
            int z = i;

            for (int j = (z + 1); j < n; j++) {
                if (a[z][j] == 1 && !S.contains(j)) {
                    S.push(j);
                    z = j;
                }
            }
        }

        if (S.size() < n) {
            System.out.println("\nHamilton Path doesn't Exist!");
        }else {
            System.out.println("\nHamilton Path is:");
            S.push(S.get(0));
            System.out.println(S);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter #Vertices & #Edges:");
        int i, s, d, n = sc.nextInt(), e = sc.nextInt();
        System.out.println("\nEnter " + e + " Edges:");
        int arr[][] = new int[n][n];

        for (i = 0; i < e; i++) {
            s = sc.nextInt();
            d = sc.nextInt();
            arr[s][d] = arr[d][s] = 1;
        }

        ham(arr, n, e);
        sc.close();
    }

}
