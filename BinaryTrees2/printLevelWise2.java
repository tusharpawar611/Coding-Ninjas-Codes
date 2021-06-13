// Level order traversal
// Send Feedback
// For a given a Binary Tree of type integer, print it in a level order fashion where each level will be printed on a new line. Elements on every level will be printed in a linear fashion and a single space will separate them.

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
         if(root==null){
            return;
        }
        
        Queue<BinaryTreeNode<Integer>> que = new LinkedList<BinaryTreeNode<Integer>>();
        que.add(root);
        // System.out.print(root.data);
        // q.remove();
        int nodecount=0;
        while(true){
            nodecount=que.size();
            String s="";
            if(nodecount==0){
                break;
            }
            
            while(nodecount>0){
                BinaryTreeNode<Integer> curr = que.peek();
                System.out.print(curr.data+" ");
                que.remove();
                if(curr.left!=null){
                    que.add(curr.left);
                }
                if(curr.right!=null){
                    que.add(curr.right);
                }
                nodecount--;
            }
                System.out.println();
            
        }
        
	}
	
}