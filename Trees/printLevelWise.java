// Code : Print Level Wise
// Send Feedback
// Given a generic tree, print the input tree in level wise order. That is, print the elements at same level in one line (separated by space). Print different levels in differnet lines.

import java.util.LinkedList;
import java.util.Queue;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        
        
		q.add(root);
        for(int i=0;i<root.children.size();i++){
                    q.add(root.children.get(i));
                }
		System.out.println(root.data);
        q.remove();
        int nodecount = 0;
        
        while(true){
            nodecount = q.size();
            if(nodecount==0){
                break;
            }
            	String s="";
            while(nodecount>0) {
                
			
				TreeNode<Integer> frontNode = q.peek();
                s = s+frontNode.data + " ";
                q.remove();
                
                
                for(int i=0;i<frontNode.children.size();i++){
                    q.add(frontNode.children.get(i));
                }
                nodecount--;
                
                
       
				
		}
				System.out.println(s);
            
            
        }
		
        
        
      

	}
		
}
