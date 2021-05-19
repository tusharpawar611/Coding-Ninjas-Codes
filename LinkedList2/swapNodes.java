// Swap two Nodes of LL
// Send Feedback
// You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
// Note :
// Remember, the nodes themselves must be swapped and not the datas.

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

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        LinkedListNode<Integer> thead=head;
        LinkedListNode<Integer> n1=null,n2=null;
        LinkedListNode<Integer> t1=null,t2=null;
        
        int i1=0;
        while(head!=null){
            if(i1==i){
                n1=head;
                t1=head.next;
            }
            if(i1==j){
                n2=head;
                t2=head.next;
            }
            i1++;
            head=head.next;
        }
        head=thead;
        
        int index=0;
        while(head!=null){
            if(index == i-1){
                head.next=n2;
                n2.next=t1;
            }
            else if(index==j-1){
                head.next=n1;
                n1.next=t2;
            }
            index++;
            head=head.next;
        }
        
        return thead;
        
        
	}

}