// Triplet sum
// Send Feedback
// You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
// Note :
// Given array/list can contain duplicate elements.

import java.util.*;
public class Solution {	

	 public static int tripletSum(int[] arr, int num) {
        Arrays.sort(arr);
        int n = arr.length;
        
        int numTriplets = 0;
        
        for (int i=0; i<n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            
            int start = i + 1;
            int stop = n - 1;
             
             while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                   if (arr[start] == arr[stop]) {
                       int totalCount = (stop - start) + 1;
                       numPairs += (totalCount * (totalCount - 1) / 2);
                       break;
                   }
                    
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    
            		numPairs += (totalElementFromStart * totalElementFromEnd);
                    
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }    
}

//vvvvvvvvvvvvvvvvvvv DIDNT WORK vvvvvvvvvvvvvvvvvvvvvv

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






       


       

-------------------------

import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        HashMap <Integer, Integer> map = new HashMap();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int i=0;
        while(i<arr.length-1){
            int l = i+map.get(arr[i]);
            int r = arr.length-1;
            int x = arr[i];
            
            while(l<r){
                if(x+arr[l]+arr[r]== num){
                    count=count+map.get(arr[l])+map.get(arr[r])+map.get(arr[i]);
                    l+=map.get(arr[l]);
                    r-=map.get(arr[r]);
                }
                else if(num>arr[l]+arr[r]+x){
                    l+=map.get(arr[l]);
                }
                else{
                    r-=map.get(arr[r]);
                }
            }
            i=i+map.get(arr[i]);
            
        }
        
        return count;
        
    }
}





//--------------------------


import java.util.*;
public class Solution {	

	public static int tripletSum(int[] arr, int num) {
		//Your code goes here
        Arrays.sort(arr);
        int count=0;
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        //System.out.println("test2");
        int ans[] = new int[map.size()];
		int j=0;
        for (Integer name : map.keySet()){
            ans[j]=name;
            j++;
        }
        //System.out.println(ans.length);
        int i=0;
        while(i<ans.length-1){
            int l = i+1;
            int r = ans.length-1;
            int x = ans[i];
            //System.out.println("test4");
            while(l<r){
                if(x+ans[l]+ans[r]== num){
                    count=count+map.get(ans[l])+map.get(ans[r])+map.get(ans[i]);
                    if(x+ans[l+1]+ans[r]== num){
                        count=count+map.get(ans[l+1])+map.get(ans[r])+map.get(ans[i]);
                    }
                    if(x+ans[l]+ans[r-1]== num){
                        count=count+map.get(ans[l])+map.get(ans[r-1])+map.get(ans[i]);
                    }
                    l++;
                    r--;
                }
                else if(num>ans[l]+ans[r]+x){
                    l++;
                }
                else{
                    r--;
                }
            }
            i++;
            //System.out.println("test5");
        }
        
        return count;
        
    }
}