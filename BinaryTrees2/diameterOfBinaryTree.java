// Diameter Of Binary Tree
// Send Feedback
// For a given Binary of type integer, find and return the ‘Diameter’.
// Diameter of a Tree
// The diameter of a tree can be defined as the maximum distance between two leaf nodes.
// Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.


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
import java.util.*;
public class Solution {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root==null){
            return 0;
        }
        
        int op1 = height(root.left)+height(root.right);
        int op2 = diameterOfBinaryTree(root.left);
        int op3 = diameterOfBinaryTree(root.right);
        
        return Math.max(op1,Math.max(op2,op3))+1;
	}
    
    public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        
        return Math.max(lh,rh)+1;
        
    }
	
}

 