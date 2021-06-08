// Replace Node With Depth
// Send Feedback
// For a given a Binary Tree of integers, replace each of its data with the depth of the tree.
// Root is at depth 0, hence the root data is updated with 0. Replicate the same further going down the in the depth of the given tree.
// The modified tree will be printed in the in-order fashion.


/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
       changeToDepth(root,0);
	}
    
    public static void changeToDepth(BinaryTreeNode<Integer> root,int dep){
        if(root==null){
            return;
        }
        root.data=dep;
        changeToDepth(root.left,dep+1);
        changeToDepth(root.right,dep+1);
    }

}