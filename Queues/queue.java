// Queue Using LL
// Send Feedback
// Implement a Queue Data Structure specifically to store integer data using a Singly Linked List.

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

public class Queue {
	
	//Define the data members
        private Node start,end;
    	int size;
	

	public Queue() {
		//Implement the Constructor
        start=null;
        end=null;
            size=0;
        
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        
        Node n = new Node(data);
       
        if(end!=null ){
            end.next = n;
        	end=n;
        	
        }
        else{
            start=n;
            end=n;
        }
        size++;
        
    }


    public int dequeue() {
    	//Implement the dequeue() function
        
      	
        if(start!=null){
            
            Node temp = start;
        	start=start.next;
        
            if(start==null){
                end=null;
            }
            size--;
        return temp.data;
        }
            return -1;
        
    }


    public int front() {
    	//Implement the front() function
        if(start!=null){
        	return start.data;
        }
        return -1;
    }
}
