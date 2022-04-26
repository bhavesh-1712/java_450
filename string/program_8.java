package string;

/**
 * Write a program to find longest palindrome in a string. (longest palindrome
 * substring)
 */
public class program_8 {
    
    static void printSubStr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
        System.out.println();
    }

    static int longestPalindromeSub(String str) {
        int n = str.length();

        int maxLength = 1, start = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int flag = 1;

                // Check palindrome
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;

                // Palindrome
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        System.out.print("Longest palindrome subString is : ");
        printSubStr(str, start, start + maxLength - 1);

        // return length of LPS
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        System.out.println("Length is : " + longestPalindromeSub(str));
    }
}
/**
 * OUTPUT
 * 
 * Longest palindrome subString is : geeksskeeg
 * Length is : 10
 * 
 */