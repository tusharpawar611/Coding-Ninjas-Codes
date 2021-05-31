// Code : Number of nodes greater than x
// Send Feedback
// Given a tree and an integer x, find and return number of Nodes which are greater than x.

public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){

		// Write your code here		
       // return numNode(root,x,0);
         if(root==null){
            return 0;
        }
        int count=0;
        if(root.data>x){
            count++;
        }
        for(int i=0;i<root.children.size();i++){
            count += numNodeGreater(root.children.get(i),x);
        }
        return count;

	}
    

	
}
