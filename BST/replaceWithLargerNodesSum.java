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
        int rootdata=root.data+rightsum(root.right);

		int lsum = replaceWithLargerNodesSum(root.left);
        rootdata+=
		int rsum = replaceWithLargerNodesSum(root.right);
	}
    
    public static void replaceLeft(BinaryTreeNode<Integer> root, int data) {
		// Write your code here
        if(root==null){
            return;
        }
        int rootdata=root.data+rightsum(root.right)+data;
		root.data = rootdata;
		int lsum = replaceLeft(root.left,rootdata);
        
	}
    
    public static int rightSum(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int sum=root.data;
        sum+=rightSum(root.left);
        sum+=rightSum(root.right);
        
        return sum;
    }
}