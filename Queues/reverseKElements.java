import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
		//Your code goes here
        int kk =input.size()-k,t=0;
        
        reverse(input,k);
        for (int i = 0; i < kk; i++) {
            input.add(input.peek());
            input.remove();
        }
        
        //9 0  2  92 23 11 12 16 14 4  3  7 
       //12 14 16 9  7  0  2  92 3  23 11 4 
    	//0 2  4  92 23 7 14  11 16 12 3  9 
        return input;
            
        }
        
	
    
    public static Queue<Integer> reverse(Queue<Integer> input, int k){
         if(input.size()==0 || k==0){
             return input;
         }
        int temp = input.poll();
        reverseKElements(input,k-1);
        input.add(temp);   
        
        return input;
            
        
    }

}