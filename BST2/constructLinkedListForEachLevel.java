import java.util.*;

public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root==null){
            return null;
        }
        ArrayList<LinkedListNode<Integer>> result = new ArrayList<LinkedListNode<Integer>>();
		ArrayList<BinaryTreeNode<Integer>> queue = new ArrayList<BinaryTreeNode<Integer>>();
		
		queue.add(root);
		
		while(!queue.isEmpty()){
			ArrayList<BinaryTreeNode<Integer>> tempQueue = new ArrayList<BinaryTreeNode<Integer>>();
			
			for(BinaryTreeNode<Integer> tmp: queue){
				tempQueue.add(tmp);
			}
			
			queue.removeAll(queue);
			LinkedListNode<Integer> thead=null;
            LinkedListNode<Integer> head=null;
			for(BinaryTreeNode<Integer> n: tempQueue){
				if(n.left!=null){
					queue.add(n.left);
				}
				if(n.right!=null){
					queue.add(n.right);
				}
                
				if(thead==null){
					thead = new LinkedListNode<Integer>(n.data);
                    head = thead;
                }
                else{
                    head.next = new LinkedListNode<Integer>(n.data);
                    head=head.next;
                    
                }
                
			}
			result.add(thead);
		}
		return result;		
	}

}

//

