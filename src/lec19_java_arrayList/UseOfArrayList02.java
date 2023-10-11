package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseOfArrayList02 {

	public static void main(String[] args) {
		// We can assigned indexing, line 13, 15, .....
		// Who is assigned to index [1]?
		// But you have to assign sequentially descending order
		ArrayList list = new ArrayList();
		list.add("Atlanta");
		// add(int index, String element) --> Inserts the specified element at the specified position in this list. 
		// Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
		list.add(0, "New York"); // We assigned ''New York" in index 0
		list.add("Montana");
		list.add(2, "California"); // We assigned ''California" in index 2
		list.add(4, "Alabama"); // We assigned ''Maryland" in index 4
		
		System.out.println(list.size());
		System.out.println(list);
		
		// Use of indexOf(), Returns the index of the first occurrence of the specified element in this list, 
		// or -1 if this list does not contain the element. 
		System.out.println(list.indexOf("Montana"));
		System.out.println(list.indexOf("montana"));
		
		// set(int index, String element), replace an existing index
		// Replaces the element at the specified position in this list with the specified element.
		list.set(1, "New Jersey");
		System.out.println(list);
		
		// add(int index, String element)
		// Inserts the specified element at the specified position in this list. 
		// Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
		list.add(1, "Nevada");
		System.out.println(list);
		
		// Returns true if this list contains the specified element. 
		// More formally, returns true if and only if this list contains at least one element
		System.out.println(list.contains("Cauliflower"));
		System.out.println(list.contains("California"));
		
		// We can use if else condition too
		
		if (list.contains("California")) {
			list.set(3, "Texas");
		} else {
			System.out.println("Keep same");
		}
	
		// To print all data, we can use any kind of loop or Iterator
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}			
	}

}
