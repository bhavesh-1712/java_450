package string;

/**
 * Write a program to find longest palindrome in a string. (longest palindrome substring)
 */
public class program_8 {
    static int longestPalindromeSub(String str){
        int n = str.length();
        if(n < 2)
            return n;

        int maxLength = 1, start = 0;
        int low = 0, high = 0;
        
        for(int i = 0; i < n; i++){
            low = i - 1;
            high = i + 1;
            while(high < n && str.charAt(high) == str.charAt(i))
                high++;

            while(low >= 0 && str.charAt(low) == str.charAt(i))
                low--;

            while(low >= 0 && high < n && str.charAt(low) == str.charAt(high))
                low--;
                high++;
        }
        int length = high - low - 1;
        if(maxLength < length){
            maxLength = length;
            start = low + 1;
        }
        System.out.print("Longest palindrome substring is: ");
        System.out.println(str.substring(start, start + maxLength ));
        return maxLength;
    }
    public static void main(String[] args) {
         String str = "forgeeksskeegfor";
         System.out.println("Length is : "+ longestPalindromeSub(str));
    }
}
