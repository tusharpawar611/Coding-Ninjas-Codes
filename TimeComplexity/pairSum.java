import java.util.ArrayList;
public class Solution {	

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int c : list){
                if(c==(num-arr[i])){
                count++;
            }
            }
            
            list.add(arr[i]);
            
        }
        
        return count;
	}
}