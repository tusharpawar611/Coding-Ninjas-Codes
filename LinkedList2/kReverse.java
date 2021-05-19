// kReverse
// Send Feedback
// Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
//  'k' is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
// Example :
// Given this linked list: 1 -> 2 -> 3 -> 4 -> 5

// For k = 2, you should return: 2 -> 1 -> 4 -> 3 -> 5

// For k = 3, you should return: 3 -> 2 -> 1 -> 5 -> 4

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

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
        if(k==0){
            return head;
        }
        LinkedListNode<Integer> thead=null;
        LinkedListNode<Integer> prevhead=null,nexthead=head, prevtail = null;
        
        
        while(nexthead!=null){
            head = nexthead;
            
            for(int i=0; i<k && nexthead!=null ; i++) {
                nexthead=nexthead.next;
            }
            
            prevhead = reverse(head,k);
            if( thead == null ){
	       	    thead = prevhead;
            } else {
                prevtail.next = prevhead;
            }
            
            prevtail = head;
        }
        
        
        return thead;
        
	}
     static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head, int k){
         
        if(k==1 || head == null || head.next==null){
            return head;
        }
         
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> small = reverse(head.next,k-1);
        tail.next=head;
        head.next=null;
        return small;
     }

}