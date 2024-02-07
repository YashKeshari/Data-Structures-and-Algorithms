package packqueue;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;





public class queueDS {

	
	
		   static class Node {
		       int data;
		       Node next;
		       Node(int data) {
		           this.data = data;
		           next = null;
		       }
		   }
		   
		   
		 
		   public static class Queue {
		       static Node head = null;
		       static Node tail = null;
		       static int s=0;
		       
		       
		       
		 
		       public static boolean isEmpty() {
		           return head == null && tail == null;                   //Is empty or not?
		           
		       }
		 
		       
		       
		       
		       public static void enqueue(int data) {
		           Node newNode = new Node(data);
		           if(isEmpty()) {
		               tail = head = newNode;
		           } else {                                               //Enqueue
		               tail.next = newNode;
		               tail = newNode;
		           }
		       }
		       
		       
		       
		 
		       public static int dequeue() {
		           if(isEmpty()) {
		               System.out.println("empty queue");
		               return -1;
		           }                                                      //Dequeue
		           int front = head.data;
		           //single node
		           if(head == tail) {
		               tail = null;
		           }
		           head = head.next;
		           return front;
		       }
		 
		       public static int peek() {
		           if(isEmpty()) {
		               System.out.println("empty queue");                 //Peek
		               return -1;
		           }
		          
		           return head.data;
		       }
		       
		       
		       
		       
		       public static void print() {
		       Node p = head;
		    	   while(p!=null) {                                       //Print
		           System.out.println(p.data + " ");
		           p = p.next;
		       }
		       }
		       
		       
		       
		       public static void contains(int a) {
		        	
		        	Node temp = head;
		        	while(temp!=null) {
		        		if(temp.data == a) {
		        			System.out.println("True");                  //Contains
		        			return;
		        		}
		        		temp = temp.next;
		        	}
		        	System.out.println("False");
		        	
		        }
		       
		       
		      
		       
		       public static int size() {
		        	
	        	   
			         Node p = head;
			    	   while(p!=null) {                             //Size
			           s=s+1;
			           p = p.next;
			           }
			    	   return s;
			       }
		       
		       
		       public static int center() {
		    	   int a = size();
		    	   Node p = head;
		    	   if(a%2==0) {
		    		   for(int i=0 ; i< (a/2)+1 ;i++) {
		    			   p=p.next;
		    		   }                                                //Center
		    	   }else {
		    		   for(int i=0 ; i< a/2 ;i++) {
		    			   p=p.next;
		    		   }
		    		   
		    	   }
		    	   return p.data;
		       }
		       
		       
		       public void reverse() {
			       if(head == null || head.next == null) {
			           return;
			       }
			 
			       Node prevNode = head;
			       Node currNode = head.next;                                              //Reverse
			       while(currNode != null) {
			           Node nextNode = currNode.next;
			           currNode.next = prevNode;
			           prevNode = currNode;
			           currNode = nextNode;
			       }
			       head.next = null;
			       head = prevNode;
			   }
		       
		       
		       public void sorting() 
			   {
				   
				   int c=0;
				   if(head!=null) {
					   Node temp= head;
					   while(temp!=tail) {
						   temp = temp.next;
						   c++;
					   }
					   
				   }
				   for(int i =0; i<c ; i++)
				   {
					   Node temp= head;
					   Node temp1 = temp.next;
					   int d;
					   for(int j=0 ; j<c-i-1 ; j++) 
					   {
						   if(temp.data > temp1.data) 
						   {                                                              //sorting
							   d=temp.data;
							   temp.data = temp1.data;
							   temp1.data =d;
						   }
						   temp = temp1;
						   temp1 = temp1.next;
						   
					   }
				   }
			   }
		       
		       
		       
		  
		   }

	
	
}
