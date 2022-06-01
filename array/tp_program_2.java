package array;

/**
 * Second largest element in an array without sorting
 */
public class tp_program_2 {
    public static void main(String[] args) {
        int x[] = {4, 6, 7, 3, 10, 9};

        int first, second;

        first = second = x[0];

        for(int i = 1; i < x.length; i++){
            if(first < x[i]){
                second = first;
                first = x[i];
            }else if(x[i] > second && x[i] != first){
                second = x[i];
            }
        }

        System.out.print(second);
    }
}
