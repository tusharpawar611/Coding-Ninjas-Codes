import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int sum = num-arr[i];
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int j=i+1;j<arr.length;j++){
                if(map.containsKey(sum-arr[j])){
                    count++;
                }
                if(map.containsKey(arr[j])){
                    map.put(arr[j],map.get(arr[j])+1);
                }
                else{
                    map.put(arr[j],1);
                }
               
            }
        }
        
        return count;
        
    }
}





import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<arr.length-2;i++){
            int sum = num-arr[i];
            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int j=i+1;j<arr.length;j++){
                if(map.containsKey(sum-arr[j])){
                    count++;
                }
                if(map.containsKey(arr[j])){
                    map.put(arr[j],map.get(arr[j])+1);
                }
                else{
                    map.put(arr[j],1);
                }
               
            }
        }
        
        return count;
        
    }
}

       

import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        HashMap <Integer, Integer> map = new HashMap();
        for(int i=0; i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int l = i+1;
            int r = arr.length-1;
            int x = arr[i];
            
            while(l<r){
                if(x+arr[l]+arr[r]== num){
                    count++;
                    if(arr[l]==arr[l+1]){
                        count++;
                    }
                        if(arr[r]==arr[r-1]){
                    	count++;
                        }
                    
                    l++;
                    r--;
                }
                else if(num>arr[l]+arr[r]+x){
                    l++;
                }
                else{
                    r--;
                }
            }
            
        }
        
        return count;
        
    }
}
       

-------------------------

import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        HashMap <Integer, Integer> map = new HashMap();
        for(int i=0; i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int l = i+1;
            int r = arr.length-1;
            int x = arr[i];
            
            while(l<r){
                if(x+arr[l]+arr[r]== num){
                    count++;
                    if(arr[l]==arr[l+1]){
                        count++;
                    }
                        if(arr[r]==arr[r-1]){
                    	count++;
                        }
                    
                    l++;
                    r--;
                }
                else if(num>arr[l]+arr[r]+x){
                    l++;
                }
                else{
                    r--;
                }
            }
            
        }
        
        return count;
        
    }
}
       

