// Even after Odd LinkedList
// Send Feedback
// For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.

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

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> h1=null,h2=null,t1=null,t2=null;
       
        while(head!=null){
            if(head.data%2==0){
                if(h2==null){
                    h2=head;
                    t2=head;
                }
                else{
                    t2.next=head;
                    t2=t2.next;
                }
            }
            else{
                if(h1==null){
                    h1=head;
                    t1=head;
                }
                else{
                    t1.next=head;
                    t1=t1.next;
                }
            }
            head=head.next;
        }
        if(t1==null){
            return h2;
        }
        if(h2!=null){
            t2.next=null;
        }
        t1.next=h2;
        
        return h1;
	}
}