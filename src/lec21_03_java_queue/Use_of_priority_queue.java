package lec21_03_java_queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Use_of_priority_queue {
// THis is not important at all
	public static void main(String[] args) {
		Queue<String>queue = new PriorityQueue<>();
		// The sequence of element you added doesn't matter rather Priority come from ASCII table
		queue.add("NY");
		queue.add("NJ");
		queue.add("MA");
		queue.add("CA");
		queue.add("MD");
		queue.add("TX"); 
		queue.add("NV"); 
		queue.add("GA"); 
		queue.add("AL"); 
		queue.add("WA"); 
		queue.add("HI"); 
		queue.add("FL"); 
		queue.add("LO"); 
		
		// follow ASCII VALUE FOR PRIORITY
		// Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
		//  Removes and Returns true if this collection contained the specified element
		System.out.println(queue.remove("TX"));
		System.out.println(queue.remove("AB"));
		
		System.out.println(queue);
		
		// Retrieve but not remove
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		
		// iterating the queue elements:
		System.out.println("\n^^^^^^^^^^^^^ Printing all the element of PriorityQueue (1) ^^^^^^^^^^^^^^^^ ");
		Iterator<String> it1 = queue.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	
	}

}
