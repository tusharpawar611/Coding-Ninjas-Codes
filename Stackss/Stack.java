// Implement a Stack Data Structure specifically to store integer data using a Singly Linked List.



/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class Stack {

    //Define the data members
    private Node head;
    private int size;


    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return head==null;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node nhead = new Node(element);
        nhead.next = head;
        head = nhead;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        int temp=0;
        if(head!=null){
            temp = head.data;
        	head=head.next;
            size--;
        }
        else{
            return -1;
        }
        
        
        return temp;
    }

    public int top() {
        //Implement the top() function
        if(head==null){
            return -1;
        }
        return head.data;
    }
}