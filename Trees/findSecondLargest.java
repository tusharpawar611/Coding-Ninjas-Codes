// Second Largest Element In Tree
// Send Feedback
// Given a generic tree, find and return the node with second largest value in given tree. Return NULL if no node with required value is present.



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
	
		
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        change(root,largest(root).data);
        return largest(root);
            
    }
    
    public static TreeNode<Integer> largest(TreeNode<Integer> root){
        
        if(root==null){
            return null;
        }
        int max = root.data;
        TreeNode<Integer> maxnode = root;
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> currnode = largest(root.children.get(i));
            if(currnode==null){
                continue;
            }
            int curr=currnode.data;
            if(max<curr){
                max = curr;
                maxnode = currnode;
            }
        }
        
        return maxnode;
    }
    
    public static void change(TreeNode<Integer> root,int n){
        if(root==null){
            return;
        }
        if(root.data==n){
            root.data=Integer.MIN_VALUE;
            
        }
        for(int i=0;i<root.children.size();i++){
            change(root.children.get(i),n);
        }
    }
       
        
        

	}
	
	

