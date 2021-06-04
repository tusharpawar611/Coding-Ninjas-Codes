// Next larger element
// Send Feedback
// Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.


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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
        if(root==null){
            return null;
        }
         TreeNode<Integer> res = null;
         int app =Integer.MAX_VALUE;
    	for(int i=0;i<root.children.size();i++){
          TreeNode<Integer> greater = findNextLargerNode(root.children.get(i),n);
            if(greater==null){
                continue;
            }
          int curr = greater.data;
          if(app>curr){
              app = curr;
              res = greater;
          }
        }
        if(root.data>n && root.data < app){
            return root;
        }
        
        return res;

	}
	
}
