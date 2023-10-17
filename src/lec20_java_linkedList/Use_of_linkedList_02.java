package lec20_java_linkedList;

import java.util.LinkedList;

public class Use_of_linkedList_02 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Alex");
		ll.add("Michael"); 
		ll.add("Jennifer");
		ll.add("Brian");		
		System.out.println(ll);
		
		// clear() --> Removes all of the elements from this list.The list will be empty after this call returns.
		ll.clear();
		System.out.println(ll);
		
		System.out.println("\n--------------------------------");
		ll.add("Alex");
		ll.add("Alfred");
		ll.add("Jeff");
		System.out.println(ll);
		
		// removeAll(Collection<?> c) --> Removes all of this collection's elements that are also contained in thespecified collection (optional operation). 
		// but clear() method is faster
		ll.removeAll(ll); // This is not working in ArrayList
		System.out.println(ll);
		
		System.out.println("\n--------------------------------");
		ll.add(0, "Jimmy");
		ll.add("Nancy");
		ll.addFirst("Clinton"); // it will replace index 0
		ll.addLast("Obama");
		ll.add("Michael");
		ll.add("Jennifer");
		System.out.println(ll);
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Adam");
		ll2.add("Bob");
		ll2.add("Cindy"); 
		ll2.add("David");
		System.out.println(ll2);
		// addAll(Collection c) --> Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specifiedcollection's iterator. 
		ll.addAll(ll2);
		System.out.println("In ll2 after using addAll():" + ll);
	}

}
