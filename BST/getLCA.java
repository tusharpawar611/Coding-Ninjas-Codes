public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */


	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		getLCA(root.left,a,b);
		getLCA(root.right,a,b);
	}
    public static Boolean searchDown(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        return searchDown(root.left) || searchDown(root.right);
    }
}