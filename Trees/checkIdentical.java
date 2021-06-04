// Structurally identical
// Send Feedback
// Given two Generic trees, return true if they are structurally identical i.e. they are made of nodes with the same values arranged in the same way.

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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        if(root1.data!=root2.data){
            return false;
        }
        for(int i=0;i<root1.children.size();i++){
            if(!checkIdentical(root1.children.get(i),root2.children.get(i))){
                return false;
            }
        }
        return true;
	}
	
}
