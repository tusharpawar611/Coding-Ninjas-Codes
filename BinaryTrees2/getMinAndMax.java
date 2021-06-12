// Minimum and Maximum in the Binary Tree
// Send Feedback
// For a given a Binary Tree of type integer, find and return the minimum and the maximum data values.
// Return the output as an object of Pair class, which is already created.

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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {

	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
        Pair<Integer, Integer> ans = new  Pair<Integer, Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE);
        
        if(root==null){
            return ans;
        }
        Pair<Integer, Integer> res1 = getMinAndMax(root.left);
        Pair<Integer, Integer> res2 = getMinAndMax(root.right);
        
        ans.maximum=Math.max(root.data,Math.max(res1.maximum,res2.maximum));
        ans.minimum=Math.min(root.data,Math.min(res1.minimum,res2.minimum));
        
        return ans;
        
        
	}
	
}