package array;

/**
 * Reverse the array
 */

class program_1 {
    //this method print array
    static void printArray(int arr[], int arrLength){
        
        for(int i = 0 ; i < arrLength ; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    // this method reverse the array
    static void reverseArray(int arr[], int arrStart, int arrEnd){
        int temp;

        while(arrStart < arrEnd){
            temp = arr[arrStart];
            arr[arrStart] = arr[arrEnd];
            arr[arrEnd] = temp;

            arrStart++;
            arrEnd--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7};

        printArray(arr, arr.length);

        reverseArray(arr, 0, arr.length-1);

        System.out.println("Reverse array is :");

        printArray(arr, arr.length);
    }
}

/**
 ***** OUTPUT ***** 
 2 3 4 5 6 7
Reverse array is :
 7 6 5 4 3 2
*/