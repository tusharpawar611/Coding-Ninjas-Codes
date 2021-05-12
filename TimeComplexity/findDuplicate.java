import java.util.ArrayList;
public class Solution {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
        int n = arr.length-2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        int res = sum - n*(n+1)/2;
        return res;
        
        
       
	}
}