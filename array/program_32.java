package array;

/**
 * Three way partitioning of an array around a given value
 */
public class program_32 {
    static void threeWayPartitioning(int[] arr, int lowVal, int highVal){
        int n = arr.length;

        int start = 0, end = n -1;

        for(int i = 0; i <= end;){

            if(arr[i] < lowVal){
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            }else if(arr[i] > highVal){
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            }else
                i++;
        }
    }

    public static void main(String[] args){
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
         
        threeWayPartitioning(arr, 10, 20);
  
        System.out.println("Modified array ");

        for (int i=0; i < arr.length; i++)
            System.out.print(arr[i] + " ");   
    }
}
/**
 * OUTPUT
 * 
 * Modified array 
 * 1 5 4 2 1 3 14 20 20 98 87 32 54 
 * 
 */
