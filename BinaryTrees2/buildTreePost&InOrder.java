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

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        
        return buildE(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
    public static BinaryTreeNode<Integer> buildE(int[] postOrder, int[] inOrder, int postS, int postE, int inS, int inE){
        
        if(inS>inE || postS>postE){
            return null;
        }
        
        int ri = 0;
        for(int i=inS;i<=inE;i++){
            if(inOrder[i]==postOrder[postE]){
                ri = i;
                break;
            }
        }
        
        int leftinS=inS;
        int leftinE=ri-1;
        int rightinS=ri+1;
        int rightinE=inE;
        
        int leftpostS=postS;
        int leftpostE=postS + leftinE-leftinS;
        int rightpostS=leftpostE+1;
        int rightpostE=postE-1;

        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(postOrder[postE]);
        
        root.left = buildE(postOrder,inOrder,leftpostS,leftpostE,leftinS,leftinE);
        root.right = buildE(postOrder,inOrder,rightpostS,rightpostE,rightinS,rightinE);
        
        return root;
    }

}