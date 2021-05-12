public class Solution {

	public static int arrayEquilibriumIndex(int[] arr){  
		//Your code goes here
        if(arr.length<=1){
            return -1;
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        int j =1;
        
        for( j=1;j<arr.length;j++){
            if(arr[j-1]==arr[arr.length-1]-arr[j]){
                break;
            }
            
        }
        if(j>=arr.length) return -1;
        return j;
	}
}