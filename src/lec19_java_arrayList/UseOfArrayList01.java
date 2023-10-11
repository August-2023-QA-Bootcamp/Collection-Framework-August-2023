package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList01 {

	public static void main(String[] args) {
		// initial capacity (ic) is 10, it means it can store 10 data
		// ic is [10]--> then capacity will be increased to [{ic*(3/2)}+1]=16
		// Until no: 11 come, the capapcity is 10
		ArrayList ar = new ArrayList(); //ArrayList is a class, warning for not using generic data type
		ar.add("Alex"); // index [0] 
		ar.add("Michael"); // index [1] 
		ar.add("Jennifer");  // index [2]
		ar.add("Brian");
		ar.add(45); // different data type is allowed, here int is used
		ar.add(false);
		ar.add(""); // empty is allowed for String Type
		ar.add("Alex"); // duplicate value is allowed
		ar.add("Alfred");
		ar.add("Jeff");
		ar.add(34.556); 
		ar.add("Michael");
		ar.add('M'); // Here char type
		
		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // In Array this is length
		System.out.println("^^^^^^^^^^^^^ Printing single index value ^^^^^^^^^^^^^^^^ ");
		System.out.println("Single index value: " + ar.get(0)); // output:
		System.out.println("Single index value: " + ar.get(1)); // output:
		System.out.println("Single index value: " + ar.get(4)); // output:
		System.out.println("Single index value: " + ar.get(6)); // output:
		System.out.println("Single index value: " + ar.get(10)); // output:
		System.out.println("Single index value: " + ar.get(12)); // output:
		System.out.println("Last index value: " + ar.get(ar.size()-1));
		System.out.println("Second Last index value: " + ar.get(ar.size()-2));
		
		System.out.println("\n All the value of ArrayList: " + ar); //ArrayList accept all data type
		
		// We can use for Loop too
		// But we will use for each loop and Iterator for practice
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for loop -------------");
		for (int i = 0; i <ar.size(); i++ ) {
			System.out.println(ar.get(i));
		}
		
		// Iterator is the legacy type. Old system, first loop of Java
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = ar.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
// add(), get(), Iterator is important
	}

}
