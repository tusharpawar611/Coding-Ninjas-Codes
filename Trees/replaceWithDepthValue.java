// Replace node with depth
// Send Feedback
// In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.


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
    
    private static void recur(TreeNode<Integer> root, int depth) {
        root.data = depth;
        for (int i = 0 ; i < root.children.size() ; i++) {
            recur(root.children.get(i), depth+1);
        }
    }
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

		// Write your code here
		// for(int i=0;i<root.children.size();i++){
		// count += countLeafNodes(root.children.get(i));
		// }
        recur(root, 0);
	}
	
	
}
