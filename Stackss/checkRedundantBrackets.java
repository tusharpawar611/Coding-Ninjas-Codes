// Check redundant brackets
// Send Feedback
// For a given expression in the form of a string, find if there exist any redundant brackets or not. It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
// A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
// Example:
// Expression: (a+b)+c
// Since there are no needless brackets, hence, the output must be 'false'.

// Expression: ((a+b))
// The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.

import java.util.Stack;
public class Solution {

	public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
        Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++) {

		 	if(expression.charAt(i)==')') {
				int count =0;
				while(stack.peek()!='(' ) {
					count++;
					stack.pop();
				}
				stack.pop();
				if(count==0||count==1)
					return true;
			}
			else {
				stack.push(expression.charAt(i));
			}

		}
		return false;
	}
}