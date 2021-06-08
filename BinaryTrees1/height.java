// Height Of Tree
// Send Feedback
// For a given Binary Tree of integers, find and return the height of the tree.

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

	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return 0;
        }
        int h1=height(root.left);
        int h2=height(root.right);
        if(h1>h2){
            return h1+1;
        }
        return h2+1;
	}

}