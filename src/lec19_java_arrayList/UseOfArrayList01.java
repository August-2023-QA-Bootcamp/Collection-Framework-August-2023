package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList01 {

	public static void main(String[] args) {
		// how we store data--------------

		// in variable
		int id = 101;
		// pring variable value
		System.out.println(id); // 101

		// in Array
		int [] ids = new int[5]; // 0 1 2 3 4
		ids[0] = 101;
		ids[1] = 107;
		ids[2] = 108;
		ids[3] = 100;
		ids[4] = 106;
		
		// print index value from array
		System.out.println(ids[4]); // 106
		// size of the array in array
		System.out.println(ids.length);

		// In AarrayList ---> creating the obj
		
		// if you call default constructor ---> initial capacity (ic) is 10, it means it can store 10 data
		// if ic is [10]--> then capacity will be increased to [{ic*(3/2)}+1]=16 for next elements added
		// Until no: 11 come, the capacity is 10
		// ArrayList is a class, warning is coming for not using generic data type
		ArrayList ar = new ArrayList(); 
		// Adding elements by add() --> Appends the specified element to the end of this list.
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
		ar.add('M'); // Here char type
		
		// Checking size of the ArrayList (not the capacity)
		// size() --> Returns the number of elements in this list.
		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // In Array this is length
		
		System.out.println("-------------- Printing single index value ---------------- ");
		// get() --> Returns the element at the specified position in this list.
		System.out.println("Single index value: " + ar.get(0)); 
		System.out.println("Single index value: " + ar.get(1)); 
		System.out.println("Single index value: " + ar.get(4)); 
		System.out.println("Single index value: " + ar.get(6)); 
		System.out.println("Single index value: " + ar.get(10)); 
		System.out.println("Single index value: " + ar.get(12)); 
		System.out.println("Last index value: " + ar.get(ar.size()-1));
		System.out.println("Second Last index value: " + ar.get(ar.size()-2));
		
		System.out.println("\n All the value of ArrayList: " + ar); //ArrayList accept all data type
		
		// To print all data, we can use any kind of loop
		// But we will use for each loop and Iterator for practice in Collections
		// Also for below, for each is not possible, as the above object contains mixed type data
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
		
		System.out.println("\n--------------------- More about Capacity  ------------------------");
		// if you call parameterized constructor ---> initial capacity will be what number you are passing in parenthesis
		ArrayList arraylist1 = new ArrayList<>(20); // Capacity is fixed and it is 20
		// Even we can pass the size of the different ArrayList object as a parameter to get the capacity
		ArrayList arraylist2 = new ArrayList<>(ar.size());
		
		// add(), get(), Iterator is important from this class
	}

}
