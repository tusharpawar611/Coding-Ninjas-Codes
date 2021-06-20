// Replace with Sum of greater nodes
// Send Feedback
// Given a binary search tree, you have to replace each node's data with the sum of all nodes which are greater or equal than it. You need to include the current node's data also.
// That is, if in given BST there is a node with data 5, you need to replace it with sum of its data (i.e. 5) and all nodes whose data is greater than or equal to 5.
// Note: You don't need to return or print, just change the data of each node.

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
        replace(root,0);
	}
    
    public static int replace(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
        if(root==null){
            return 0;
        }
		int greaterSum = replace(root.right,sum);
        int temp = root.data;
        root.data += greaterSum+sum;
        int leftSum = replace(root.left,root.data);
        return temp + greaterSum + leftSum;
        
	}

}