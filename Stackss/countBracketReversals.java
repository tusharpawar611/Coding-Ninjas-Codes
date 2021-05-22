// Minimum bracket Reversal
// Send Feedback
// For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
// If the expression can't be balanced, return -1.
// Example:
// Expression: {{{{
// If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

// Expression: {{{
// In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.

import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
        if(input.length()%2!=0){
            return -1;
        }
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop(); 
                }
                else{
                    st.push(input.charAt(i));
                }
            }
            else{
                    st.push(input.charAt(i));
            }
        }
        int count=0;
        while(!st.isEmpty()){
            char ch1=st.pop();
            char ch2=st.pop();
            
            if(ch1==ch2){
                count++;
            }
            else{
                count+=2;
            }
            
        }
        return count;
	}

}