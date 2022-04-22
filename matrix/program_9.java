package matrix;

/**
 * Kth smallest element in a row-column wise sorted matrix
 */
public class program_9 {
    static class HeapNode{
        int val, r, c;

        HeapNode(int val, int r, int c){
            this.val = val;
            this.c = c;
            this.r = r;
        }
    }

    static void minHeapify(HeapNode harr[], int i, int heap_size){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int min = i;

        if(l < heap_size && r < heap_size && harr[l].val < harr[i].val && harr[r].val < harr[i].val){
            HeapNode temp = harr[r];
            harr[r] = harr[i];
            harr[i] = harr[l];
            harr[l] = temp;
            minHeapify(harr, l, heap_size);
            minHeapify(harr, r, heap_size);
        }

        if(l < heap_size && harr[l].val < harr[i].val){
            HeapNode temp = harr[i];
            harr[i] = harr[l];
            harr[l] = temp;
            minHeapify(harr, l, heap_size);
        }
    }

    static int kThSmallest(int[][] arr, int n, int k){
        if(k < 0 && k >= n * n)
            return Integer.MAX_VALUE;
        
        HeapNode harr[] = new HeapNode[n];

        for(int i = 0; i < n; i++)
            harr[i] = new HeapNode(arr[0][i], 0, i);
        
        HeapNode hr = new HeapNode(0, 0, 0);

        for(int i = 1; i <= k; i++){
            hr = harr[0];
            int nextVal = hr.r < n - 1 ? arr[hr.r + 1][hr.c] : Integer.MAX_VALUE;

            harr[0] = new HeapNode(nextVal, hr.r + 1, hr.c);

            minHeapify(harr, 0, n);
        }

        return hr.val;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 25, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
         
        int res = kThSmallest(arr, arr.length, 7);

        System.out.print("7th smallest element is "+ res);
    }
}
/**
 * OUTPUT
 * 
 * 7th smallest element is 30
 * 
 */