package basic;

import java.util.Scanner;
import java.util.Stack;

/**
 * Check string is Balanced or Unbalanced
 */
public class AFoutTest2 {
    // static boolean checkBalanced(String str){
    //     int i = 0 , j = str.length() - 1;
    //     while(i < j){
    //         // System.out.println(str.charAt(i) == str.charAt(j));
    //         // if((int)str.charAt(i) != (int)str.charAt(j))
    //             // return false;
    //         if(str.charAt(i) == '[' && str.charAt(j) != ']'){
    //             return false;
    //         }

    //         if(str.charAt(i) == '{' && str.charAt(j) != '}'){
    //             return false;
    //         }

    //         if(str.charAt(i) == '(' && str.charAt(j) != ')'){
    //             return false;
    //         }
            
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }

    static boolean checkBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);

            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }

            if(stack.isEmpty())
                return false;
            
            char check;

            switch(x){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '{' || check == '(')
                        return false;
                    break;
            }
        }

        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        if(checkBalanced(str))
            System.out.println("Balanced string");
        else
            System.out.println("Unbalanced string");
        sc.close();
    }
}
/**
 * 
 * OUTPUT
 * 
 Input1: [ { ( ) } ]
Output1: Balanced string
Input2: [()}]
Output2: Unbalanced string

 */