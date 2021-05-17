// You have been given two sorted(in ascending order) singly linked lists of integers.
// Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
// Note :
// Try solving this in O(1) auxiliary space.

// No need to print the list, it has already been taken care.

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
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
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