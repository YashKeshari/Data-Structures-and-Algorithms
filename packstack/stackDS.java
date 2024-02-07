package packstack;

import packlinkedlist.LL.Node;

public class stackDS {
	
	
	
	 private static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            next = null;
	        }
	    }
	 
	 

	    public static class Stack {
	        public static Node head = null;
	        
	        
	        
	        
	        
	        
	        public  void push(int data) {
	            Node newNode = new Node(data);

	            if(head == null) {
	                head = newNode;
	                return;                                                 // Push
	            }
	            newNode.next = head;
	            head = newNode;
	        }

	        
	        
	        
	        public static boolean isEmpty() {
	            return head == null;                                       //Stack is empty or not
	        }
	        
	        
	        

	        public static int pop() {
	            if(isEmpty()) {
	                return -1;
	            }                                                          // pop
	            Node top = head;
	            head = head.next;
	            return top.data;
	        }

	        
	        
	        
	        public static int peek() {
	            if(isEmpty()) {
	                return -1;                                         // peek
	            }
	            Node top = head;
	            return top.data;
	        }
	        
	        
	        public static void print() {
	        	
			       Node p = head;
			    	   while(p !=null) {                              //Print
			           System.out.println(p.data + " ");
			           p = p.next;
			           }
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
	        
	        public static void contains(int a) {
	        	
	        	Node temp = head;
	        	while(temp!=null) {
	        		if(temp.data == a) {
	        			System.out.println("True");    
	        			return;                                     //Contains
	        		}
	        		temp = temp.next;
	        	}
	        	System.out.println("False");
	        	
	        }
	        
	        
	        
	        public static int size() {
	        	
	        	   int s=0;
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
	        
	        public void sorting() 
			   {
				   
				   int c=0;
				   if(head!=null) {
					   Node temp= head;
					   while(temp!=null) {
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
