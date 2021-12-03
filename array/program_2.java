package array;

/**
 * Find the minimum and maximum in an array
 */

class program_2 {
    static class MinMax{
        int min;
        int max;
    }

    static MinMax getMinMax(int arr[], int arrSize){
        MinMax minMax = new MinMax();

        if(arrSize == 1){
            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;
        }

        if(arr[0] > arr[1]){
            minMax.max = arr[0];
            minMax.min = arr[1];
        }else{
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        for(int i = 2 ; i < arrSize ; i++){
            if(arr[i] > minMax.max)
                minMax.max = arr[i];
            else if(arr[i] < minMax.min)
                minMax.min = arr[i];
        }
        return minMax;
    }
    public static void main(String[] args) {

        int arr[] = {200, 300, 800, 10000, 1, 40};
        MinMax minmax = getMinMax(arr, arr.length);
        // printf() method is used to print string along with int, double, char, float etc., variable
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}

/**
 ***** OUTPUT ***** 
Minimum element is 1
Maximum element is 10000
*/