public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return ArrayToBST(arr,0,n-1);
		}
    	public static BinaryTreeNode<Integer> ArrayToBST(int[] arr,int s,int e){
            if(s>e){
                return null;
            }
            
            int mid = (e+s)/2;
            BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[mid]);
            node.left=ArrayToBST(arr,s,mid-1);
            node.right=ArrayToBST(arr,mid+1,e);
            
            return node;
        }
    	
	}