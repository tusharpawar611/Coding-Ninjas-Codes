
public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        int ar[] = new int[d];
        for(int i=0;i<d;i++){
            ar[i]=arr[i];
        }
        
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        int x = arr.length-d;
        for(int i=x;i<arr.length;i++){
            arr[i]=ar[i-x];
        }
    }

}