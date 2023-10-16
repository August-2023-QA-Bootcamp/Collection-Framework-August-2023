package lec20_java_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class UseOfLinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		// add() --> Appends the specified element to the end of this list. 
		ll.add("Alex"); // index[0]
		ll.add("Michael"); // index [1] 
		ll.add("Jennifer");  // index [2]
		ll.add("Brian");
		ll.add("Alex"); // duplicate value is allowed
		ll.add("Alfred");
		ll.add("Jeff");
		
		// size() --> Returns the number of elements in this list.
		System.out.println("The length of the LinkedList is: " + ll.size());
		// get() --> Returns the element at the specified position in this list.
		System.out.println("Printing single index value of LinkedList: " + ll.get(0));
		System.out.println("Printing single index value of LinkedList: " + ll.get(1));
		System.out.println(ll);
		
		// New
		System.out.println("\n--------------------------------");
		// getFirst() --> Returns the first element in this list.
		System.out.println("Printing first index value of LinkedList: " + ll.getFirst());
		// getLast() --> Returns the last element in this list.
		System.out.println("Printing last index value of LinkedList: " + ll.getLast());
		
		// peek() --> Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("Peeking first index value of LinkedList: " + ll.peek()); // ver rare to use
		
		System.out.println("========= Iterator ==========");
		Iterator<String> iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n--------------------------------");
		// indexOf(Object o) --> Returns the index of the first occurrence of the specified elementin this list, or -1 if this list does not contain the element. 
		System.out.println(ll.indexOf("Alex"));
		System.out.println(ll.indexOf("Brian"));
		
		System.out.println("\n--------------------------------");
		ll.add(0, "Jimmy");
		ll.add(3, "Nancy");
		System.out.println("After using add(index, value): " + ll.get(0));
		System.out.println("After using add(index, value): " + ll.get(1));
		System.out.println("After using add(index, value): " + ll.get(3));
		System.out.println("After using add(index, value): " + ll.get(4));
		System.out.println(ll);
		
		// New
		System.out.println("========= ListIterator ==========");
		ListIterator<String> listIterator = ll.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());		
		}
		
		// New
		System.out.println("\n--------------------------------");
		// addFirst(E element) --> Inserts the specified element at the beginning of this list.
		ll.addFirst("Clinton"); // new here
		// addLast(E element) --> Appends the specified element to the end of this list.
		ll.addLast("Obama"); // new here
		
		
		// set(int index, E element) --> Replaces the element at the specified position in this list with the specified element.
		ll.set(1, "Trump");// new here, replacing the value from second
		
		// remove(int index) --> Removes the element at the specified position in this list. Shifts anysubsequent elements to the left 
		ll.remove(3);  //removing third index
		
		System.out.println("Printing first index value of LinkedList: " + ll.get(0));
		System.out.println("Printing last index value of LinkedList: " + ll.get(ll.size()-1)); // last index
		System.out.println("Printing index value of LinkedList: " + ll.get(1));
		System.out.println("Printing index value of LinkedList: " + ll.get(2));
		System.out.println("Printing index value of LinkedList: " + ll.get(3));
		System.out.println("Printing index value of LinkedList: " + ll.get(4));
		System.out.println(ll);
		
		System.out.println("\n--------------------------------");
		// contains(Object o) --> Returns true if this list contains the specified element.
		System.out.println(ll.contains("Obama"));
		
		// New
		System.out.println("\n--------------------------------");
		// removeFirst() --> Removes and returns the first element from this list.
		ll.removeFirst();
		
		// removeLast() --> Removes and returns the last element from this list.
		ll.removeLast();
		System.out.println("Printing first index value of LinkedList: " + ll.get(0));
		System.out.println("Printing second index value of LinkedList: " + ll.get(1));
		System.out.println("Printing last index value of LinkedList: " + ll.get(ll.size()-1));
		System.out.println("Printing second last index value of LinkedList: " + ll.get(ll.size()-2));
		
		
		
		

	}

}
