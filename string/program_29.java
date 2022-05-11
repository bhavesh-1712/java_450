package string;

import java.util.HashMap;

/**
 * Find the first repeated word in string
 */
public class program_29 {
    static String findFirstRepeated(String s){
       
        String token[] = s.split(" ");
        
        HashMap<String, Integer> setOfWords = new HashMap<String, Integer>();
     
        for (int i=0; i<token.length; i++) {
            if (setOfWords.containsKey(token[i]))           
                setOfWords.put(token[i], setOfWords.get(token[i]) + 1);
            else
                setOfWords.put(token[i], 1);   
        }
     
        for (int i=0; i<token.length; i++) {
            int count = setOfWords.get(token[i]);
            if (count > 1) {
                return token[i];
            }
        }
     
        return "NoRepetition";
    }
    
    public static void main(String args[]){
        String s = "Ravi had been saying that he had been there";
        String firstWord = findFirstRepeated(s);
        if (!firstWord.equals("NoRepetition"))
            System.out.println("First repeated word :: " + firstWord);
        else
            System.out.println("No Repetitionn");
    }
}
/**
 * OUTPUT
 * 
 * First repeated word :: had
 * 
 */