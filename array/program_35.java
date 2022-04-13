package array;

/**
 * Median of 2 sorted arrays of equal size
 */
public class program_35 {
    static int getMedian(int arr1[], int arr2[], int n1){
    //    int i = 0, j = 0, count, m1 = -1, m2 = -1;
        // for(count = 0; count <= n1; count++){
        //     if(i == n1){
        //        m1 = m2 ; 
        //        m2 = arr2[0];
        //        break;
        //     }else if(j == n1){
        //         m1 = m2;
        //         m2 = arr1[0];
        //         break;
        //     }

        //     if(arr1[i] <= arr2[j]){
        //         m1 = m2;
        //         m2 = arr1[i];
        //         i++;
        //     }else{
        //         m1 = m2;
        //         m2 = arr2[j];
        //         j++;
        //     }

        //     System.out.println(m1+" : "+m2);
        // }

        
        return ( arr1[(n1/2)] + arr2[(n1/2)] ) / 2;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 12, 15, 26, 38};
        int arr2[] = {2, 13, 17, 30, 45};

        if(arr1.length == arr2.length)
            System.out.println("Median is : "+getMedian(arr1, arr2, arr1.length));
        else
            System.out.println("Arrays are of unqueal size");
    }
}
/**
 * OUTPUT : 
 * 
 * Median is : 16
 * 
 */