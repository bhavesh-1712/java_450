package DAA;

/**
 * Matrix mulitiplication using stressen's method
 * 
 * time complexity = O(n^3)
 * 
 * Note : Using this recurrence relation, we get T(n)=O(nlog7)
 * Hence, the complexity of Strassen’s matrix multiplication algorithm is O(nlog7).
 * 
 * log7 = 2.8
 */
public class assignment_1 {
    void split(int[][] p, int[][] c, int iB, int jB){
        for(int i1 = 0, i2 = iB; i1 < c.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < c.length; j1++, j2++)
                c[i1][j1] = p[i2][j2];
    }

    void join(int[][] c, int [][] p, int iB, int jB){
        for (int i1 = 0, i2 = iB; i1 < c.length; i1++, i2++)
            for (int j1 = 0, j2 = jB; j1 < c.length; j1++, j2++)
                p[i2][j2] = c[i1][j1];
    }


    int[][] add(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                c[i][j] = a[i][j] + b[i][j];
        
        return c;
    }

    int[][] sub(int[][] a, int[][] b){
        int n = a.length;
        int[][] c = new int[n][n];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                c[i][j] = a[i][j] - b[i][j];
        
        return c;
    }

    
    int[][] multiply(int[][] a, int[][] b){
        int n = a.length;
        int[][] r = new int[n][n];
    
        //if there is only single element
        if(n == 1)
            r[0][0] = a[0][0] * b[0][0];
        else{
            //Step 1: dividing matrix into sub-parts
            int[][] a11 = new int[n/2][n/2];
            int[][] a12 = new int[n/2][n/2];
            int[][] a21 = new int[n/2][n/2];
            int[][] a22 = new int[n/2][n/2];
            int[][] b11 = new int[n/2][n/2];
            int[][] b12 = new int[n/2][n/2];
            int[][] b21 = new int[n/2][n/2];
            int[][] b22 = new int[n/2][n/2];

            //Step 2 : dividing matrix a into 4 halves
            split(a, a11, 0, 0);
            split(a, a12, 0, n/2);
            split(a, a21, n/2, 0);
            split(a, a22, n/2, n/2);
        
            //Step 3: dividing matrix b into 4 halves
            split(b, b11, 0, 0);
            split(b, b12, 0, n/2);
            split(b, b21, n/2, 0);
            split(b, b22, n/2, n/2);

            int[][] m1 = multiply(add(a11, a22), add(b11, b22));
            int[][] m2 = multiply(add(a21, a22), b11);
            int[][] m3 = multiply(a11, sub(b12, b22));
            int[][] m4 = multiply(a22, sub(b21, b11));
            int[][] m5 = multiply(add(a11, a12), b22);
            int[][] m6 = multiply(sub(a21, a11), add(b11, b12));
            int[][] m7 = multiply(sub(a12, a22), add(b21, b22));

            int[][] c11 = add(sub(add(m1, m4), m5), m7);
            int[][] c12 = add(m3, m5);
            int[][] c21 = add(m2, m4);
            int[][] c22 = add(sub(add(m1, m3), m2), m6);

            join(c11, r, 0, 0);
            join(c12, r, 0, n/2);
            join(c21, r, n/2, 0);
            join(c22, r, n/2, n/2);
        }

        return r;
    }
    public static void main(String[] args) {
        assignment_1 ass = new assignment_1();

        int N = 4;

        int[][] a = {{1, 2, 3, 4},
                     {4, 3, 0, 1},
                     {5, 6, 1, 1},
                     {0, 2, 5, 6}};
        int[][] b = {{1, 0, 5, 1},
                     {1, 2, 0, 2},
                     {0, 3, 2, 3},
                     {1, 2, 1, 2}};

        int[][] c = ass.multiply(a, b);
        System.out.println("\nProduct of matrices A and  B : ");
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            for (int j = 0; j < N; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
