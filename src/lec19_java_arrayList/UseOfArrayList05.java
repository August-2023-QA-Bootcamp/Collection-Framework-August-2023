package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList05 {

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
		
		ar.remove(2); // Remove the index number 2 after all function till line 23
		ar.remove(9); // below index 5 will not remove before index 9 of this line
		ar.remove(5);
		
		System.out.println("The size of the ArrayList is: " + ar.size() + "\n"); // In Array this is length
		System.out.println("\n All the value of ArrayList: " + ar); //ArrayList accept all data type
		
		// Iterator is the legacy type. Old system, first loop of Java
		// Practice 34-38 by typing, interview question
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = ar.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//NEW
		// generic comes in java 1.5 -> by defining the data type, but without generic from 1.2
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Mohammad");
		ar1.add("Tofael");
		ar1.add("Kabir");
		ar1.add("");
		ar1.add("Sharkar");
		ar1.add("44"); // can it take integer? 
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(String s1: ar1) {
			System.out.println(s1);
		}
		
		// Using char type
		// char: The char data type is a single 16-bit Unicode character. 
		// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)
		ArrayList<Character>ar2 = new ArrayList<>();
		ar2.add('A');
		ar2.add('B');
		ar2.add('C');
		ar2.add(' '); // Working as empty Character, one space is only allowed
		ar2.add('E');
		
		
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(char s2: ar2) {
			System.out.println(s2);
		}
		
		// FYI
		System.out.println(' ' + 3 + 4); // Single space value is 32
		
		
		// Using Integer type
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		ar3.add(483);
		ar3.add(484);
		ar3.add(485);
		
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator2 = ar3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		

	}

}
