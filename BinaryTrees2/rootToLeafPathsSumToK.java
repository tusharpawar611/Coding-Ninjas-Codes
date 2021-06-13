// Path Sum Root to Leaf
// Send Feedback
// For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
// Example:
// alt txt

// If you see in the above-depicted picture of Binary Tree, we see that there are a total of two paths, starting from the root and ending at the leaves which sum up to a value of K = 13.

// The paths are:
// a. 2 3 4 4
// b. 2 3 8

// One thing to note here is, there is another path in the right sub-tree in reference to the root, which sums up to 13 but since it doesn't end at the leaf, we discard it.
// The path is: 2 9 2(not a leaf)


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

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		//Your code goes here
        rootToLeafPaths(root,k,"",0);
	}
    
    public static void rootToLeafPaths(BinaryTreeNode<Integer> root, int k, String s,int sm) {
		//Your code goes here
        if(root==null){
            return;
        }
        String st = s+root.data+" ";
        int sum = sm+root.data;
        if(sum>k){
            return;
        }
        else if(sum==k && root.left==null && root.right==null){
            System.out.println(st);
        }
        else{
            rootToLeafPaths(root.left,k,st,sum);
            rootToLeafPaths(root.right,k,st,sum);
        }
	}

}