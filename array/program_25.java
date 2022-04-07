package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n and a number k, find all elements that appear more than "n/k" times
 */
public class program_25 {
    static void moreThanNbyK(int arr[], int n, int k){
        int x = n / k;

        HashMap<Integer, Integer> y = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(!y.containsKey(arr[i]))
                y.put(arr[i], 1);
            else{
                int count = y.get(arr[i]);
                y.put(arr[i], count + 1);
            }
        }

        for(Map.Entry m : y.entrySet()){
            Integer temp = (Integer) m.getValue();
            if(temp > x)
                System.out.println(m.getKey());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1};

        int n = 12;
        int k = 4;

        moreThanNbyK(arr, n, k);
    }
}
