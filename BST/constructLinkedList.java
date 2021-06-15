// BST to LL
// Send Feedback
// Given a BST, convert it into a sorted linked list. You have to return the head of LL.



public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if(root==null){
            return null;
        }
//         LinkedListNode<Integer> rootleft = new  LinkedListNode<Integer>(root.data);
//         LinkedListNode<Integer> rootright = new  LinkedListNode<Integer>(root.data);
        
        LinkedListNode<Integer> left = constructLinkedList(root.left);
        LinkedListNode<Integer> right = constructLinkedList(root.right);
        
        LinkedListNode<Integer> l= goToEnd(left);
        LinkedListNode<Integer> rootnode = new  LinkedListNode<Integer>(root.data);
		rootnode.next=right;
        
        if(l!=null){
        	l.next=rootnode;
        }
        else{
            left = rootnode;
        }
        
        
        
        
        return left;
	}
    
    public static LinkedListNode<Integer> goToEnd(LinkedListNode<Integer> node){
        if(node==null){
            return null;
        }
        while(node.next!=null){
        	node=node.next;
        }
        
        return node;
        
    }
    
}