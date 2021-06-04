// Node having sum of children and node is max
// Send Feedback
// Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate



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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root==null){
            return null;
        }
        int rootsum = sum(root);
        TreeNode<Integer> max = null;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<root.children.size();i++){
            
            TreeNode<Integer> maxnode = maxSumNode(root.children.get(i));
            int currmax=sum(maxnode);
            if(maxsum<currmax){
                maxsum = currmax;
                max = maxnode;
            }
        }
        
       	if(rootsum>maxsum){
            return root;
        }
        return max;
        
       
        
	}
    
    public static int sum(TreeNode<Integer> root){
        
        if(root==null){
            return 0;
        }
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
        	 sum+=root.children.get(i).data;
        }
        
        return sum;
    }
	
		
}
