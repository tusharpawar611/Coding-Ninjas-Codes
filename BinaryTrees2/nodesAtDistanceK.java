// Print nodes at distance k from node
// Send Feedback
// You are given a Binary Tree of type integer, a target node, and an integer value K.
// Print the data of all nodes that have a distance K from the target node. The order in which they would be printed will not matter.
// Example:
// For a given input tree(refer to the image below):
// 1. Target Node: 5
// 2. K = 2
// alt txt

// Starting from the target node 5, the nodes at distance K are 7 4 and 1.


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

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        nodesAtDistK(root,node,k);
	}
    public static int nodesAtDistK(BinaryTreeNode<Integer> root, int node, int k) {
	    //Your code goes here
        if(root==null){
            return -1;
        }
        
        if(root.data == node){
            printDown(root,k);
            return 0;
        }
        
        int lh = nodesAtDistK(root.left,node,k);
        if(lh!=-1){
            if(lh+1==k){
                System.out.println(root.data);
            }
            else{
                printDown(root.right,k-lh-2);
            }
            return lh+1;
        }
        int rh = nodesAtDistK(root.right,node,k);
        if(rh!=-1){
            if(rh+1==k){
                System.out.println(root.data);
                
            }
            else{
                printDown(root.left,k-rh-2);
            }
            return rh+1;
        }
        
        return -1;
	}
    
    private static void printDown(BinaryTreeNode<Integer> root, int k) {
        if(root==null) {
            return ;
        }
        if(k==0) {
            System.out.println(root.data);
            return ;
        }
        printDown(root.left, k-1);
        printDown(root.right, k-1);
    }

}