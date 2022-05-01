package string;

import java.util.Stack;

/**
 * Balanced parenthesis problem
 */
public class program_16 {
    static boolean areBracketsBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);

            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;
            
            char check;
            switch(x){
                case ')' :
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}' :
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']' :
                    check = stack.pop();
                    if(check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        String expr = "([{}])";
 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");    
    }
}
/**
 * OUTPUT
 * 
 * Balanced
 * 
 */