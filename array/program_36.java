package array;

/**
 * Median of 2 sorted arrays of different size
 */
public class program_36 {
    static int getMedian(int arr1[], int arr2[], int n1, int n2){
        int i = 0, j = 0, count, m1 = -1, m2 = -2;

        if((n1 + n2) % 2 == 1){
            for(count = 0; count <= (n1 + n2) / 2; count++){

                if(i != n1 && j != n2){
                    m1 = (arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];
                }else if(i < n1){
                    m1 = arr1[i++];
                }else{
                    m1 = arr2[j++];
                }
            }

            return m1;
        }else{
            for(count = 0; count <= (n1 + n2) / 2; count++){
                m2 = m1;
                if(i != n1 && j != n2){
                    m1 = (arr1[i] > arr2[j]) ? arr2[j++] : arr1[i++];
                }else if(i < n1){
                    m1 = arr1[i++];
                }else{
                    m1 = arr2[j++];
                }
            }
            
            return (m1 + m2) / 2;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 900 };
        int arr2[] = { 5, 8, 10, 20 };

        System.out.println("Median is : "+getMedian(arr1, arr2, arr1.length, arr2.length));
    }
}
/**
 * OUTPUT
 * 
 * Median is : 10
 * 
 */