// Bubble Sort (Iterative) LinkedList
// Send Feedback
// Given a singly linked list of integers, sort it using 'Bubble Sort.'

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

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode<Integer> fhead=head,p1=head,p2=head;
        int leng = len(head);
       
        for(int i=leng-1;i>0;i--){
            for(int j=0;j<i && head!=null && head.next!=null;j++){
                if(head.data>head.next.data){
                    fhead=replace(fhead,j,j+1);
                }
                else{
                    head=head.next;
                }
            }
            head=fhead;
        }
      
        return fhead;
       
	}
    public static int len(LinkedListNode<Integer> head){
        int l=1;
        while(head!=null){
            head=head.next;
            l++;
        }
        return l;
    }
    
    public static LinkedListNode<Integer> replace(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(head==null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> thead=head;
        LinkedListNode<Integer> n1=null,n2=null;
        LinkedListNode<Integer> t1=null;
        
        int i1=0;
        while(head!=null && i1<=j){
            if(i1==i){
                n1=head;
                n2=head.next;
                
            }
            else if(i1==j){
                t1=head.next;
                break;
            }
            i1++;
            head=head.next;
        }
        head=thead;
        
        int index=0;
        while(head!=null){
            if(i==0){
                n2.next=n1;
                n1.next=t1;
                return n2;
            }
            if(index == i-1){
                head.next=n2;
                n2.next=n1;
                n1.next=t1;
            }
            index++;
            head=head.next;
        }
        
       
        return thead;
        
        
	}

}