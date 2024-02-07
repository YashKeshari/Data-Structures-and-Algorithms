package packlinkedlist;



public class LL {
	
		 
		   Node head;
		   private int size;
		 
		   public LL () {
		       size = 0;
		   }
		 
		   
		   
		   
		   public class Node {
		       int data;
		       Node next;
		 
		       Node(int data) {
		           this.data = data;
		           this.next = null;
		           size++;
		       }
		   }
		   
		   
		   
		 
		   public void insert(int data) {
		       Node newNode = new Node(data);
		       newNode.next = null;
		       if(head==null){
		           head = newNode;
		          return;
		       }                                                             //insert
		       
		       Node temp = head;

		       while(temp.next!=null)
		           temp = temp.next;

		       temp.next = newNode;
		   }
		   
		   
		   
		   
		   
		   
		   public void addLast(int data) {
		       Node newNode = new Node(data);
		 
		       if(head == null) {
		           head = newNode;                                                    //insert at Last
		           return;
		       }
		 
		       Node lastNode = head;
		       while(lastNode.next != null) {
		           lastNode = lastNode.next;
		       }
		 
		       lastNode.next = newNode;
		   }
		   
		   
		   
		   
		   public void printList() {
		       Node currNode = head;
		 
		       while(currNode != null) {
		    	   
		           System.out.print(currNode.data+" -> ");                               // Print
		           currNode = currNode.next;
		       }
		 
		       System.out.println("null");}
		   
		   
		   
		   public void removeFirst() {
		       if(head == null) {
		           System.out.println("Empty List, nothing to delete");                 // delete at first
		           return;
		       }
		 
		       head = this.head.next;
		       size--;
		   }
		   
		   public void removeatindex(int index) {
			    if(index <0) {
			    	System.out.println("Invalid Argument");
			    }
			    if(index==0) {
			    	head=head.next;
			    	size--;
			    }else {
		        Node temp= head;
		        for (int i = 0; i < index -1; i++) {                                //remove at index
		            temp= temp.next;
		        }
		        temp.next = temp.next.next;
		        size--;
		        }
			    
		    }
		   
		   
			public void iterator(int idx)
		    {
		        Node temp = head;
		        int cnt = 0; 
		        while (temp != null)
		        {
		            if (cnt == idx)
		            	System.out.println("Element at position "+idx+" is: "+temp.data);
		            cnt++;
		            temp = temp.next;
		        }
		    }
		   
		   public void removeLast() {
		       if(head == null) {
		           System.out.println("Empty List, nothing to delete");                // delete at last
		           return;
		       }
		 
		       size--;
		       if(head.next == null) { 
		           head = null;
		           return;
		       }
		 
		       Node currNode = head;
		       Node lastNode = head.next;
		       while(lastNode.next != null) {
		           currNode = currNode.next;
		           lastNode = lastNode.next;
		       }
		       currNode.next = null;
		   }

		       
		   public int getSize() {
			   
		       return size;                                                             //Size
		   }
		   
		   public int center() {
	    	   int a = size;
	    	   Node p1 = head;
	    	   if(a%2==0) {
	    		   for(int i=0 ; i< (a/2)+1 ;i++) {
	    			   p1=p1.next;
	    		   }                                                                   //Center
	    	   }else {
	    		   for(int i=0 ; i< a/2 ;i++) {
	    			   p1=p1.next;
	    		   }
	    		   
	    	   }
	    	   return p1.data;
	       }
		   
		   
		   
		   public void addatindex(int index, int data) {
		       if(index > size || index < 0) {
		           System.out.println("Invalid Index value");
		           return;
		       }
		       size++;
		 
		       Node newNode = new Node(data);
		       if(head == null || index == 0) {                                         
		           newNode.next = head;
		           head = newNode;
		           return;                                                            //Insert At Index
		       }
		        Node currNode = head;
		       for(int i=1; i<size; i++) {
		           if(i == index) {
		               Node nextNode = currNode.next;
		               currNode.next = newNode;
		               newNode.next = nextNode;
		               break;
		           }
		           currNode = currNode.next;
		       }
		   }
		   
		   
		   
		   public void reverseList() {
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
		   
		   
		   
		   public void contains(int a) {
		       Node currNode = head;
		 
		       while(currNode != null) {
		    	   if(currNode.data == a) {
	        			System.out.println("True");                                    //Contains
	        		}
	        		currNode = currNode.next;
	        	}
	        	System.out.println("False");
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
