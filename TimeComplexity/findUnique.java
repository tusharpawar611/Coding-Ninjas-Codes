import java.util.ArrayList;
public class Solution {

	public static int findUnique(int[] arr) {
		//Your code goes here
        ArrayList<Integer> arrli = new ArrayList<Integer>(arr.length/2);
        for(int i=0;i<arr.length;i++){
            if(arrli.contains(arr[i])){
                arrli.remove(arrli.indexOf(arr[i]));
            }
            else{
                arrli.add(arr[i]);
            }
        }
        
        return arrli.get(0);
	}
}