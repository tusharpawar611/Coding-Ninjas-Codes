// Delete alternate nodes
// Send Feedback
// Given a Singly Linked List of integers, delete all the alternate nodes in the list.
/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class Solution {

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
       // Node<Integer> thead=head;
        while(head!=null && head.next!=null){
             head.next = head.next.next;
        	head=head.next;
        }
    }
}