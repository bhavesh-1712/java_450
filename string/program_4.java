package string;

/**
 * Why strings are immutable in java ?
 */
public class program_4 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1.concat(" written by James Gosling");

        System.out.println("s1 refers to "+ s1);
        System.out.println("s2 refers to "+ s2);
    }
}
/**
 * OUTPUT
 * 
 * s1 refers to Java
 * s2 refers to Java written by James Gosling
 * 
 */