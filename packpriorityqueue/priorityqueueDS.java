package packpriorityqueue;


public class priorityqueueDS {
	
	private static int maxSize;
	private static int[] queArray;
	private static int nItems;
	
	public priorityqueueDS(int s)                                               // constructor
	{
	maxSize = s;
	queArray = new int[maxSize];
	nItems = 0;
	}
	
	
	
	public void insert(int item)                                            // insert item
	{
	int j;
	if(nItems==0)                                                            // if no items,
	queArray[nItems++] = item;                                               // insert at 0
	else                                                                     // if items,
	{
	for(j=nItems-1; j>=0; j--)                                               // start at end,
	{
	if( item > queArray[j] )                                                 // if new item larger,
	queArray[j+1] = queArray[j];                                             // shift upward
	

	else                                                                     // if smaller,
	break;                                                                   // done shifting
	}                                                                        // end for
	queArray[j+1] = item;                                                    // insert it
	nItems++;
	}                                                                        // end else (nItems > 0)
	}                                                                        // end insert()
	
	
	
	
	
	
	public long remove()                                            // remove minimum item
	{ return queArray[--nItems]; }
	
	public long peekMin()                                           // peek at minimum item
	{ return queArray[nItems-1]; }
	
	public long peekMax() {
		return queArray[0];
	}

	public boolean isEmpty()                                        // true if queue is empty
	{ return (nItems==0); }
	
	public boolean isFull()                                         // true if queue is full
	{ return (nItems == maxSize); }
	
	
	
	
	public int size() {                                             //Size
		return nItems;
	}
	
	public void contains(int a) {
		for (int i=0; i <= maxSize ; i++ ) {
			if (queArray[i] == a) {
				System.out.println("True");                         //Contains
				return;
			}
			
		}
		System.out.println("False");
		
	}
	
	
	public void print() {
		for (int i=0; i < maxSize ; i++ ) {
			
				System.out.println(queArray[i]);                    //Print     
		}
	}
	
	
	public int center() {
 	   int a = size();
 	   int p=0;
 	   
 	   if(a%2==0) {
 		   for(int i=0 ; i< (a/2)+1 ;i++) {
 			   p= queArray[i];
 		   }                                                        //Center
 	   }else {
 		   for(int i=0 ; i< a/2 ;i++) {
 			   p= queArray[i];
 		   }
 		   
 	   }
 	   return p;
    }
	
	public void reverse() {
		int temp;
        int n = size();
        for (int i = 0; i < n/2; i++) 
        {
            temp = queArray[i];
             
            queArray[i] = queArray[n-1-i];                          //reverse
             
            queArray[n-1-i] = temp;
        }
	 	  
	    }
	
	
	
	public void sorting() {
		int n = size();
		
	
		for (int i = 0; i < n; i++)   
		{  
		for (int j = i + 1; j < n; j++)   
		{  
		int tmp = 0;                                                //sorting
		if (queArray[i] > queArray[j])   
		{  
		tmp = queArray[i];  
		queArray[i] = queArray[j];  
		queArray[j] = tmp;  
		
		}  
		}  
	 	  
	    }
	    }
	
	
}
	
	
	
	
	
	
	
	
	
	

