package string;

/**
 * Write a code to check whether one string is a rotation of another
 */
public class program_5{
    static boolean areRotations(String str1, String str2){
        return (str1.length() == str2.length()) && ((str1 + str2).indexOf(str2) != -1);
    }
    public static void main(String[] args) {
        String str1 = "AABS";
        String str2 = "ABSA";

        if(areRotations(str1,str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");
    }
}
/**
 * OUTPUT
 * 
 * Strings are rotations of each other
 * 
 */