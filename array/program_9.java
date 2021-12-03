package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Minimise the maximum difference between heights
 */
class program_9 {
    static class Pair {
        private int value;
        private int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return this.value;
        }

        public int getIndex() {
            return this.index;
        }
    }

    static int getMinDifference(int a[], int n, int k) {
        ArrayList<Pair> possibleHeights = new ArrayList<>();
        int visited[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] - k >= 0)
                possibleHeights.add(new Pair(a[i] - k, i));
            possibleHeights.add(new Pair(a[i] + k, i));
            visited[i] = 0;
        }

        Collections.sort(possibleHeights, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p1.getValue() - p2.getValue();
            }
        });

        int ele = 0, left = 0, right = 0, size = possibleHeights.size();

        while (ele < n && right < size) {
            if (visited[possibleHeights.get(right).getIndex()] == 0)
                ele++;
            visited[possibleHeights.get(right).getIndex()]++;
            right++;
        }

        int ans = possibleHeights.get(right - 1).getValue() - possibleHeights.get(left).getValue();

        while (right < size) {
            if (visited[possibleHeights.get(left).getIndex()] == 1)
                ele--;
            visited[possibleHeights.get(left).getIndex()]--;
            left++;

            while (ele < n && right < size) {
                if (visited[possibleHeights.get(right).getIndex()] == 0)
                    ele++;
                visited[possibleHeights.get(right).getIndex()]++;
                right++;
            }

            if (ele == n)
                ans = Math.min(ans, possibleHeights.get(right - 1).getValue() -
                        possibleHeights.get(left).getValue());
            else
                break;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter K-Factor : ");
        int k = sc.nextInt();
        System.out.print("Maximum difference : " + getMinDifference(arr, n, k));
        sc.close();
    }
}
/**
 ***** OUTPUT *****
 Length of array : 3
1
15
10
Enter K-Factor : 6
Maximum difference : 5
=========================
Length of array : 4
1
5
15
10
Enter K-Factor : 3
Maximum difference : 8
=========================
Length of array : 22
4
6
Enter K-Factor : 10
Maximum difference : 2
 */