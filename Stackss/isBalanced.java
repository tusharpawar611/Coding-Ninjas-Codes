// Brackets Balanced
// Send Feedback
// For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
// Example:
// Expression: (()())
// Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
// You need to return a boolean value indicating whether the expression is balanced or not.

import java.util.Stack;
public class Solution {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        int open=0;
        
        Stack<Character> st = new Stack<Character>();
        for(int i=expression.length()-1;i>=0;i--){
        	st.push(expression.charAt(i));
        }
        while(!st.isEmpty()){
        	if(st.pop()=='('){
               
            open++;
            }
            else{
            if(open==0){
                return false;
            }
            open--;
            }
        }
        
        return open==0;
    }
}