package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList04 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(); // warning for not using generic data type
		ar.add("Alex"); // index [0] 
		ar.add("Michael");
		ar.add("Jennifer"); // index[2]
		ar.add("Brian");
		ar.add(45); 
		ar.add(false);
		ar.add(""); 
		ar.add(3, "Alison"); // Assign Alison to index 3, before going to line 25
		ar.add("Alfred");
		ar.add("Jeff");
		ar.add(5, 34.556); // Important re-indexing
		ar.add("Michael");
		ar.add('M'); // Here char type
		
		// New here
		// remove() --> Removes the element at the specified position in this list. Shifts any subsequent elements to the left (subtracts one from their indices).
		ar.remove(2); // Remove the index number 2 after all function till line 23
		ar.remove(9); // below index 5 will not remove before index 9 of this line
		ar.remove(5);
		
		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // In Array this is length
		System.out.println("\n All the value of ArrayList: " + ar); //ArrayList accept all data type
		
		System.out.println("^^^^^^^^^^^^^ Outcome ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(4)); // output:
		System.out.println("Single index value: " + ar.get(6)); // output:
		System.out.println("Last index value: " + ar.get(ar.size()-1));

	}

}
