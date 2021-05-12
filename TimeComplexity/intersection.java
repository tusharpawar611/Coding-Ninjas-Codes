import java.util.Arrays;
import java.util.HashMap;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
         Arrays.sort(arr1);
         Arrays.sort(arr2);
        HashMap <Integer, Integer> map = new HashMap();
        for(int i=0; i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        
        for(int j=0 ; j<arr2.length;j++){
            if(map.containsKey(arr2[j]) && map.get(arr2[j])!=0){
                System.out.print(arr2[j]+" ");
                map.put(arr2[j],map.get(arr2[j])-1);
            }
        }
    }

    
   
}

	
    
   