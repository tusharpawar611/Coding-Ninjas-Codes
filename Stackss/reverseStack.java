Reverse Stack
Send Feedback
You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.

import java.util.Stack;
public class Solution {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
        reverse(input,extra);
        while(!extra.isEmpty()){
            input.push(extra.pop());
        }
        
	}
    
    public static void reverse(Stack<Integer> input, Stack<Integer> extra){
         if(input.isEmpty()){
            return;
        }
        
        int in = input.pop();
        reverse(input,extra);
        extra.push(in);
    }
}