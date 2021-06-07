// Nodes Greater Than X
// Send Feedback
// For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.


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

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		//Your code goes here
        if(root==null){
            return 0;
        }
        int count = 0;
        if(root.data>x){
            count++;
        }
        count += countNodesGreaterThanX(root.left,x);
        count += countNodesGreaterThanX(root.right,x);
        return count;
	}

}