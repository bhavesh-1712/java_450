package string;

/**
 * Rabin carp algorithm
 */
public class program_18 {
    public final static int d = 256;

    static void search(String pat, String txt, int q){
        int M = pat.length();
        int N = txt.length();
        int i, j, p = 0, t = 0, h = 1; // p = hash value of pattern, t = hash value of text

        for(i = 0; i < M - 1; i++)
            h = (h * d) % q;
        
        for(i = 0; i < M; i++){
            p = (d * p + pat.charAt(i)) % q;
            t = (d * t + txt.charAt(i)) % q;
        }

        for(i = 0; i <= N - M; i++){
            if(p == t){
                for(j = 0; j < M; j++){
                    if(txt.charAt(i + j) != pat.charAt(j))
                        break;
                }
                if(j == M)
                    System.out.println("Pattern found at index "+ i);
            }

            if(i < N - M){
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M))%q;

                if(t < 0)
                    t = (t + q);
            }
        }
    }

    public static void main(String[] args) {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";

        int q = 101;

        search(pat, txt, q);
    }
}
/**
 * OUTPUT
 * 
 * Pattern found at index 0
 * Pattern found at index 9 
 * Pattern found at index 12
 * 
 */