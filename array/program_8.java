package array;

/**
 * Find largest sum contiguous subarray (Starting with positive integer number) (Kadane’s Algorithm)
 */
class program_8 {
    
    static int largestSumContSubarray(int a[], int aLength){
        int largest = Integer.MIN_VALUE, temp = 0;
 
        for (int i = 0; i < aLength; i++)
        {
            temp = temp + a[i];
            if (largest < temp) //if temp is positive
                largest = temp;
            if (temp < 0) //if temp is negative
                temp = 0;
        }
        return largest;
    }

    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Largest sum of sub array is : "+largestSumContSubarray(a, a.length));
    }
}
/**
 ***** OUTPUT *****
Largest sum of sub array is : 7
 */
