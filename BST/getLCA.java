public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T> right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	
	
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root==null){
            return -1;
        }
        
      if(root.data==a || root.data==b){
          return root.data;
      }
        return getL(root,a,b);
	}
    
    public static int getL(BinaryTreeNode<Integer> root, int a, int b){
          if(root==null){
            return -1;
        }
        
        if(root.data==a){
            if(searchDown(root,b)){
                return root.data;
            }
            return 0;
        }
      
		int l = getL(root.left,a,b);
        
            if(l>0){
                return l;
            }
            else if(l==0){
                if(searchDown(root.right,b)){
                    return root.data;
                }
                else{
                    return 0;
                }
            }
        
		int r = getL(root.right,a,b);
        
            if(r>0){
                return r;
            }
            else if(r==0){
                if(searchDown(root.left,b)){
                    return root.data;
                }
                else{
                    return 0;
                }
            }
        
        return -1;
    }
    public static Boolean searchDown(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        return searchDown(root.left,x) || searchDown(root.right,x);
    }
}