// Code : Sum of nodes
// Send Feedback
// Given a generic tree, count and return the sum of all nodes present in the given tree.



public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static int sumOfAllNode(TreeNode<Integer> root){
		if(root==null){
            return 0;
        }
        int sum = root.data;
        for(int i=0;i<root.children.size();i++){
            sum = sum+sumOfAllNode(root.children.get(i));
        }
        return sum;
	}
}