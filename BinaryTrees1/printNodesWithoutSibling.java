// Nodes without sibling
// Send Feedback
// For a given Binary Tree of type integer, print all the nodes without any siblings.

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

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
        int count =0;
        if(root.left!=null && root.right==null){
            System.out.print(root.left.data+" ");
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");
        }
        
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}

}