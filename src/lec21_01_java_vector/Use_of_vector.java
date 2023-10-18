package lec21_01_java_vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Use_of_vector {
    // Vector is a less important topic compared to other
	public static void main(String[] args) {
		// Creating object of Vector
		// When we create object with default constructor, Capacity = 10
		Vector<Integer> v = new Vector<>();
		v.add(101);
		v.add(105);
		v.add(100);
		v.add(101);// duplicate is possible
		v.add(10);
		v.add(70);
		v.add(1010);
		v.add(18800);
		v.add(120);
		v.add(1090);
		
		System.out.println();
		
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Total Elements: " + v.size());
		System.out.println("Get first element: " + v.firstElement());
		System.out.println("Get first element: " + v.get(0));
		System.out.println(v);
		
		System.out.println("\n--------------------------------");
		// printing all element
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\n--------------------------------");
		// Another Vector
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(500);
		v1.add(200);
		v1.add(208);
		
		v.addAll(v1);
		// the capacity of the vector is 10 and it contains 10 elements. 
		// If we add one more element to it then the number of elements in the vector will be 
		// greater than capacity so during the element insert the capacity is incremented by current size + 10.
		// Vector increments by 100% capacity
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Total Elements: " + v.size());
		System.out.println(v);
		
		System.out.println("\n--------------------------------");
		v.addElement(1070); // same as add()	
		v.addElement(934); 	
		
		System.out.println("Capacity: " + v.capacity());
		System.out.println("Total Elements: " + v.size());
		System.out.println(v);
		
		System.out.println("\n--------------------------------");
		//to removeAll() you need to pass a collection
		v.removeAll(v1);
		System.out.println(v);
		
		System.out.println("\n--------------------------------");
		v.remove(1);
		v.remove(0);
		v.remove(3);
		v.remove(6);
		
		System.out.println(v);
		System.out.println("Capacity: " + v.capacity()); // Why the capacity is still 20?
		System.out.println("Total Elements: " + v.size());
		
		System.out.println("\n--------------------------------");
		//sorting the data
		Collections.sort(v);
		System.out.println(v);
		System.out.println("Lowest: " + v.get(0));
		System.out.println("Highest: " + v.get(v.size()-1));

		System.out.println("\n--------------------------------");
		v.clear();
		System.out.println(v);
	}

}
