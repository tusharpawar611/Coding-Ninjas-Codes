// Delete every N nodes
// Send Feedback
// You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
// To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.

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
	
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		//Your code goes here
        if(M==0) {
	            return null;
	        }
        LinkedListNode<Integer> thead=head;
        LinkedListNode<Integer> tail1=head,tail2=head;
        
        int mc=1,nc=0;
        while(head!=null){
            while(mc<M && tail1!=null){
                head=head.next;
                tail1 = head;
                mc++;
            }
           
            while(nc<=N && head!=null){
                head=head.next;
                tail2=head;
                nc++;
            }
            
            if(tail1!=null){
                tail1.next=tail2;
            }
            head=tail2;
            
            mc=1;
            nc=0;
            
        }
        
            return thead;
        
	}
   
}