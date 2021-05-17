// Given a singly linked list of integers, sort it using 'Merge Sort.'


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

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
            
        LinkedListNode<Integer> thead = head;
        
        LinkedListNode<Integer> slow=thead;
        LinkedListNode<Integer> fast=thead;
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        LinkedListNode<Integer> mid = slow.next;
        slow.next=null;
        
        LinkedListNode<Integer> p1 = mergeSort(thead);
        LinkedListNode<Integer> p2 = mergeSort(mid);
        return merge(p1,p2);
	}
    
     public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast.next != null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    
     public static LinkedListNode<Integer> merge(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null && head2==null){
            return head1;
        }
        else if(head1 == null){
            return head2;
        }
        else if(head2 == null){
            return head1;
        }
        
        
        LinkedListNode<Integer> head=null,tail=null;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                if(head==null){
                head = head1;
                    tail = head1;
                }
                else{
                    tail.next = head1;
                    tail = head1;
                }
                head1=head1.next;
                
            }
            else{
                if(head==null){
                head = head2;
                    tail = head2;
                }
                else{
                tail.next = head2;
                    tail = head2;
                }
                head2=head2.next;
            }
            
        }
        while(head1!=null){
            tail.next=head1;
            tail = head1;
            head1=head1.next;
        }
        while(head2!=null){
            tail.next=head2;
            tail = head2;
            head2=head2.next;
        }
        
        
        return head;
        
    }

}

