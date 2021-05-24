// Dequeue
// Send Feedback
// You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
// You don't need to double the capacity.
// You need to implement the following functions -

/******************
 * Following is the main function we are using internally.
 * Refer this for completing the Dequeue class
 *
 
  public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Dequeue dq = new Dequeue(10);

		while(true){
			int choice = s.nextInt(),input;
			switch (choice) {
			case 1:
				input = s.nextInt();
				dq.insertFront(input);
				break;
			case 2:
				input = s.nextInt();
				dq.insertRear(input);
				break;
			case 3:
				dq.deleteFront();
				break;
			case 4:
				dq.deleteRear();
				break;
			case 5:
				System.out.println(dq.getFront());
				break;
			case 6:
				System.out.println(dq.getRear());
				break;
			default:
				return ;
			}  
		}
	} 
 ******************/

public class Dequeue {
    // Complete this class
      private int start,end;
    private int[] dq;
    	int si;
	

	public Dequeue(int size) {
		//Implement the Constructor
        dq = new int[size];
        start=-1;
        end=-1;
        si=size;
        
	}
    public Dequeue() {
		//Implement the Constructor
        dq = new int[10];
        start=-1;
        end=-1;
        si=10;
        
	}
    
    public void insertRear(int data){
        if(start==-1 && end==-1){
            start=0;
            end=0;
            dq[end]=data;
            return;
        }
       if((end+1)%si==start){
            System.out.println("-1");

            return;
       }
        	end =(end+1)%si;
           dq[end]=data;
        
       
    }
    public void insertFront(int data){
        if(start==-1 && end==-1){
            start=0;
            end=0;
            dq[start]=data;
            return;
        }
        if((end+1)%si==start){
             System.out.println("-1");

            return;
        }
        if(start==0){
            start=si-1;
        }
        else{
            start = start-1;
        }
        dq[start]=data;
       
      
    }
    
    public void deleteFront(){
        if(start==-1 && end==-1){
            System.out.println("-1");
            return ;
        }
        if(start==end){
            start=-1;
            end=-1;
            return;
        }
        start=(start+1)%si;
    }
    
     public void deleteRear(){  
        if(start==-1 && end==-1){
             System.out.println("-1");
            return;
        }
         if(start==end){
            start=-1;
            end=-1;
            return;
        }
         if(end==0){
             end=si-1;
         }
         else{
             end--;
         }
    }
    public int getFront(){
        if(start==-1 && end==-1){
           
            return -1;
        }
        return dq[start];
    }
    public int getRear(){
         if(start==-1 && end==-1){
           
            return -1;
        }
        return dq[end];
    }
    
}