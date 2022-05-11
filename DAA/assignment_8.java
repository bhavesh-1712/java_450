package DAA;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Write a program to solve the travelling salesman problem. Print the path and
 * the cost. (Branch and Bound).
 * 
 * time complexity = O(n^2)
 */
public class assignment_8 {
    static int final_res = Integer.MAX_VALUE;

    static void copyToFinal(int curr_path[], int N, Vector<Integer> final_path) {
        for (int i = 0; i < N; i++) {
            final_path.add(i, curr_path[i]);
        }

        final_path.add(curr_path[0]);
    }

    static int firstMin(int adj[][], int i, int N) {
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < N; j++) {
            if (adj[i][j] < min && i != j) {
                min = adj[i][j];
            }
        }

        return min;
    }

    static int secondMin(int adj[][], int i, int N) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int j = 0; j < N; j++) {
            if (i == j) {
                continue;
            }

            if (adj[i][j] <= first) {
                second = first;
                first = adj[i][j];
            }else if (adj[i][j] <= second && adj[i][j] != first) {
                second = adj[i][j];
            }
        }

        return second;
    }

    static void TSPRec(int adj[][], int curr_bound, int curr_weight, int level, int curr_path[], int N,
            boolean visited[], Vector<Integer> final_path) {
        if (level == N) {
            if (adj[curr_path[level - 1]][curr_path[0]] != 0) {
                int curr_res = curr_weight + adj[curr_path[level - 1]][curr_path[0]];

                if (curr_res < final_res) {
                    copyToFinal(curr_path, N, final_path);
                    final_res = curr_res;
                }
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (adj[curr_path[level - 1]][i] != 0 && visited[i] == false) {
                int temp = curr_bound;
                curr_weight += adj[curr_path[level - 1]][i];

                if (level == 1) {
                    curr_bound -= ((firstMin(adj, curr_path[level - 1], N) + firstMin(adj, i, N)) / 2);
                }else {
                    curr_bound -= ((secondMin(adj, curr_path[level - 1], N) + firstMin(adj, i, N)) / 2);
                }

                if (curr_bound + curr_weight < final_res) {
                    curr_path[level] = i;
                    visited[i] = true;
                    TSPRec(adj, curr_bound, curr_weight, level + 1, curr_path, N, visited, final_path);
                }

                curr_weight -= adj[curr_path[level - 1]][i];
                curr_bound = temp;
                Arrays.fill(visited, false);

                for (int j = 0; j <= level - 1; j++) {
                    visited[curr_path[j]] = true;
                }
            }
        }
    }

    static void TSP(int adj[][], int N) {
        int curr_path[] = new int[N + 1];
        int curr_bound = 0;
        boolean visited[] = new boolean[N];
        Vector<Integer> final_path = new Vector<Integer>(N + 1);
        Arrays.fill(curr_path, -1);
        Arrays.fill(visited, false);

        for (int i = 0; i < N; i++) {
            curr_bound += (firstMin(adj, i, N) + secondMin(adj, i, N));
        }

        curr_bound = (curr_bound == 1) ? ((curr_bound / 2) + 1) : (curr_bound / 2);
        visited[0] = true;
        curr_path[0] = 0;
        TSPRec(adj, curr_bound, 0, 1, curr_path, N, visited, final_path);
        System.out.print("\nMinimum cost = " + final_res);
        System.out.print("\nPath Taken: ");

        for (int i = 0; i < N; i++) {
            System.out.print(final_path.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter #Vertices & #Edges:");
        int i, s, d, c, N = sc.nextInt(), e = sc.nextInt();
        System.out.println("\nEnter Edge as Source Destination Cost:");
        int arr[][] = new int[N][N];

        for (i = 0; i < e; i++) {
            s = sc.nextInt();
            d = sc.nextInt();
            c = sc.nextInt();
            arr[s][d] = c;
        }

        for (i = 0; i < N; i++) {
            arr[i][i] = 0;
        }

        TSP(arr, N);
        sc.close();
    }
}
