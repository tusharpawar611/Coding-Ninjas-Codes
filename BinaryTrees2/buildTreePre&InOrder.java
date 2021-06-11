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

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        
        return buildE(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        
	}
    
    public static BinaryTreeNode<Integer> buildE(int[] preOrder, int[] inOrder, int preS, int preE, int inS, int inE){
        
        if(inS>inE || preS>preE){
            return null;
        }
        
        int ri = 0;
        for(int i=inS;i<=inE;i++){
            if(inOrder[i]==preOrder[preS]){
                ri = i;
                break;
            }
        }
        
        int leftinS=inS;
        int leftinE=ri-1;
        int rightinS=ri+1;
        int rightinE=inE;
        
        int leftpreS=preS+1;
        int leftpreE=leftpreS+ri-inS-1;
        int rightpreS=leftpreE+1;
        int rightpreE=preE;

        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preOrder[preS]);
        
        root.left = buildE(preOrder,inOrder,leftpreS,leftpreE,leftinS,leftinE);
        root.right = buildE(preOrder,inOrder,rightpreS,rightpreE,rightinS,rightinE);
        
        return root;
    }

}