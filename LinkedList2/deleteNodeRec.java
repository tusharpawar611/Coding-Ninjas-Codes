// Delete node Recursively
// Send Feedback
// Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
//  Note :
// Assume that the Indexing for the linked list always starts from 0.

// No need to print the list, it has already been taken care. Only return the new head to the list.
/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head==null){
            return head;
        }
        
        if(pos==0){
            return head.next;
        }
        LinkedListNode<Integer> newhead = deleteNodeRec(head.next,pos-1);
        head.next = newhead;
        
        return head;
        
	}

}