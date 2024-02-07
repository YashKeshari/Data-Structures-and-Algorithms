package packmain;
import java.util.*;
import packlinkedlist.LL;
import packpriorityqueue.priorityqueueDS;
import packqueue.queueDS.Queue;
import packstack.stackDS.Stack;






public class MainApplication {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		LL list = new LL();  
		Stack s1 = new Stack();
		Queue q = new Queue();
		priorityqueueDS q1 = new priorityqueueDS(10);	 
        
        
        
        
        System.out.println("\nEnter the data Structure\n 1.List \n 2.Stack \n 3.Queue\n 4.PQueue");
        String str= sc.nextLine(); 
        
        
        
        
        if(str.equalsIgnoreCase("List"))
        {
        	int choice;
        	System.out.println("Enter the Operation number:\n 1.Insert \n 2.InsertatIndex \n 3.Delete\n 4.DeleteatIndex\n 5.Center\n 6.Sort\n 7.Reverse\n 8.Size\n 0.Print\n");
    		Scanner s = new Scanner(System.in);
        	while(true){
        		System.out.println("Enter a choice from 0-9");
        		choice = s.nextInt();
        		
        		switch (choice) {
                case 1:
                	System.out.println("Enter the number: \n");
                	int a = s.nextInt();
                    list.addFirst(a);
                    break;
                case 2:
                	System.out.println("Enter the index and then number: \n");
                	int i =s.nextInt();
                	int n = s.nextInt();
                	list.addatindex(i,n);
                	break;
                case 3:
                    list.removeFirst();
                    break;
                case 4:
                	System.out.println("Enter the index number: \n");
                	int r1 = s.nextInt();
                	list.removeatindex(r1);
                    break;
                case 5:
                    System.out.println(list.center());
                   
                    break;
                case 6:
                    list.sorting();
                    break;
                case 7:
                    list.reverseList();
                    break;
                case 8:
                    System.out.println(list.getSize());
                    break;
                case 0:
                	
                    list.printList();
                    break;
                case 9:
                	System.out.println("Enter the index: \n");
                	int r2 = s.nextInt();
                	list.iterator(r2);
                	
               default:
                    System.out.println("Incorrect Choice\n");
                }
        		
        	}
        }
        
   
        
        if(str.equalsIgnoreCase("Stack"))
        {
        	int choice;
        	System.out.println("Enter the Operation number:\n 1.Push \n 2.Pop \n 3.Peek \n 4.Contains\n 5.Size\n 6.Center\n 7.Sort\n 8.Reverse\n 9.Print\n ");
    		Scanner s = new Scanner(System.in);
        	while(true) {
        		
        		System.out.println("Enter a choice as per operations from 1-9");
        		choice = s.nextInt();
        		switch (choice) {
                case 1:
                	System.out.println("Enter the number to push : \n");
                	int a = s.nextInt();
                    s1.push(a);
                    break;
                case 2:
                	
                 	int a1 =s1.pop();
                 	System.out.println("Poped element : " + a1 +"\n");
                	break;
                case 3:
                    int a2 =s1.peek();
                    System.out.println("Peeked element : " + a2 +"\n");
                    break;
                case 4:
                	System.out.println("Enter the number to search : \n");
                	int r1 = s.nextInt();
                	s1.contains(r1);
                    break;
                case 5:
                    
                    System.out.println("Size of Stack : " + s1.size());
                     break;
                case 6:
                    int r3 = s1.center();
                    System.out.println("Center Element : " + r3);
                    break;
                case 7:
                	System.out.println("Sorted Stack : \n");
                	s1.sorting();
                    
                    break;
                case 8:
                	System.out.println("Reversed Stack : \n");
                	s1.reverse();
                    
                    break;
                case 9:
                	System.out.println("Current Stack : \n");
                    s1.print();
                    break;
               default:
                    System.out.println("Incorrect Choice\n");
                }
        	}
        }
        
       

        
        
        
        if(str.equalsIgnoreCase("Queue"))
        {
        	int choice;
        	System.out.println("Enter the Operation number:\n 1.Enqueue \n 2.Dequeue \n 3.Peek \n 4.Contains\n 5.Size\n 6.Center\n 7.Sort\n 8.Reverse\n 9.Print\n ");
    		Scanner s = new Scanner(System.in);
        	while(true) {
        		
        		System.out.println("Enter a choice as per operations from 0-9");
        		choice = s.nextInt();
        		switch (choice) {
                case 1:
                	System.out.println("Enter the number to Enqueue : \n");
                	int a = s.nextInt();
                    q.enqueue(a);
                    break;
                case 2:
                 	int a1 =q.dequeue();
                 	System.out.println("Element removed :" + a1);
                 	break;
                case 3:
                    int a2 =q.peek();
                    System.out.println("Peeked element : " + a2 +"\n");
                    break;
                case 4:
                	System.out.println("Enter the number to search : \n");
                	int r1 = s.nextInt();
                	q.contains(r1);
                    break;
                case 5:
                    
                    System.out.println(q.size());
                     break;
                case 6:
                    
                    System.out.println(q.center());
                    break;
                case 7:
                	System.out.println("Sorted Queue :\n");
                	q.sorting();
                	q.print();
                    
                    break;
                case 8:
                	System.out.println("Reversed Queue :\n");
                	q.reverse();
                	q.print();
                    
                    break;
                case 9:
                    q.print();
                    break;
               default:
                    System.out.println("Incorrect Choice\n");
                }
        	}
        }
        
        

        
        
        if(str.equalsIgnoreCase("Pqueue"))
        {
        	int choice;
        	System.out.println("Enter the Operation number:\n 1.Enqueue \n 2.Dequeue \n 3.Peek \n 4.Contains\n 5.Size\n 6.Reverse\n 7.Center\n 8.Print\n ");
    		Scanner s = new Scanner(System.in);
        	while(true) {
        		System.out.println("Enter a choice as per operations from 1-8");
        		choice = s.nextInt();
        	
        		switch (choice) {
                case 1:
                	System.out.println("Enter the number to Enqueue : \n");
                	int a = s.nextInt();
                    q1.insert(a);
                    break;
                case 2:
                	
                	q1.remove();
                 	
                	break;
                case 3:
                    
                    System.out.println("Peeked element : " + q1.peekMax() +"\n");
                    break;
                case 4:
                	System.out.println("Enter the number to search : \n");
                	int r1 = s.nextInt();
                	q1.contains(r1);
                    break;
                case 5:
                    
                    System.out.println(q1.size());
                     break;
                case 6:
                    q1.reverse();
                    break;
                case 7:
                	int a1=q1.center();
                	System.out.println("Center Element :" + a1 );
                    
                    break;
                case 8:
                	q1.print();
                    
                    break;
                
               default:
                    System.out.println("Incorrect Choice\n");
                }
        	}
        }
        

        
        
        
        
        
        
        
        
        
	}

}
