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
import java.util.LinkedList;
import java.util.Queue;
public class Solution {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Queue<BinaryTreeNode<Integer>> que = new LinkedList<BinaryTreeNode<Integer>>();
		
        que.add(root);
        
        while(!que.isEmpty()){
            BinaryTreeNode<Integer> curr = que.remove();
            int l=0,r=0;
            if(curr.left!=null){
                l=curr.left.data;
                que.add(curr.left);
            }else{
                l=-1;
            }
            if(curr.right!=null){
                r=curr.right.data;
                que.add(curr.right);
            }else{
                r=-1;
            }
            
        	System.out.println(curr.data+":L:"+l+",R:"+r);
            
        }
	}
	
}