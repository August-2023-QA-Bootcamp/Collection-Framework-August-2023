package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseOfArrayList03 {

	public static void main(String[] args) {
		// We can have Heterogeneous data or we can make it Generic [A specific data type]
		// Below, ar1 is a Heterogeneous type object
		ArrayList ar1 = new ArrayList();
		ar1.add("Alex");
		ar1.add("Michael"); // Here String type
		ar1.add("Jennifer");
		ar1.add("Brian");
		ar1.add(45); // Here int type
		ar1.add(false); // Here boolean type
		ar1.add(""); 
		ar1.add(3, "Alison");
		ar1.add("Alfred");
		ar1.add("Jeff");
		ar1.add(5, 34.556);
		ar1.add('M'); // Here char type
		
		System.out.println("The size of the ArrayList is: " + ar1.size());
		System.out.println("All the value of ArrayList: " + ar1);

		// New: Using String type
		// generic comes in java 1.5 -> by defining the data type, but without generic from 1.2
		// Below ar2 is a Generic type object
		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Nick");
		ar2.add("Charles");
		ar2.add("Boris");
		ar2.add("Aaron");
		ar2.add("");
		ar2.add("Sharkar");
		ar2.add("44"); // can it take integer? 
		ar2.set(5, "Kennedy");
		ar2.add(6, "Joe");
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(String s: ar2) {
			System.out.println(s);
		}
		
		// Using char type
		// char: The char data type is a single 16-bit Unicode character. 
		// It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive)
		// Below ar3 is a Generic type object
		ArrayList<Character>ar3 = new ArrayList<>();
		ar3.add('A');
		ar3.add('B');
		ar3.add('C');
		ar3.add(' '); // Working as empty Character, one space is only allowed
		ar3.add('E');		
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(Character c: ar3) {
			System.out.println(c);
		}
		
		// FYI: High level
		System.out.println(' ' + 3 + 4); // Single space value is 32 from ASCII table		
		
		// Using Integer type
		// Below ar4 is a Generic type object
		ArrayList<Integer> ar4 = new ArrayList<Integer>();
		ar4.add(483);
		ar4.add(484);
		ar4.add(485);
		ar4.set(1, 488);	
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(Integer i: ar4) {
			System.out.println(i);
		}
		
	}

}
