package lec22_java_set;

import java.util.HashSet;
import java.util.Set;

public class Set_01_use_of_hashSet {

	public static void main(String[] args) {
		// HashSet class implements Set Interface
		Set<Integer> set1 = new HashSet<>();
		set1.add(15);
		set1.add(36);
		set1.add(36);
		set1.add(45);
		set1.add(45);
		set1.add(66);
		set1.add(84);
		set1.add(84);
		
		System.out.println("Stored Data in set1: " + set1);
		// 1) The outcome doesn't have any duplication, duplicated value are not stored
		// 2) The outcome is not ordered, not like how it is inserted
		
		System.out.println("Size of set1: " + set1.size());
		// Duplicated values are not counted even. Why?
		// Whenever we create a HashSet, it internally creates a HashMap and if we insert an element into 
		// this HashSet using add() method, it actually call put() method [From Map] on internally created HashMap object 
		// with element you have specified as it’s key and constant Object called “PRESENT” as it’s value. 
		// So we can say that a Set achieves uniqueness internally through HashMap because it can compare the inserted data with the existing Data.
		// When it finds duplicate, it can ignore that data, so no duplicate data is stored.
		
		
		// The outcome what we see, how it is ordered?
		// Ans: By hashing. what is hashing?
		// every data have a hash code, that is divided by initial capacity 16, and there is a remainder
		// from 0 to 16 and so on, those remainder are considered as a node and the data stored there.
		// for example: which have 0 remainder, that data will come first, then for remainder 1, remainder 2, remainder 3 and so on
		// now if 2 data have same remainder, then first one will be in first, then next one will be in the next node
		
		System.out.println("Hashcode of set1: " + set1.hashCode()); // This hash code is for the set1 object only
		
		System.out.println("\n--------------------------------");
		// Another Generic <Integer> type, Data added by running a loop
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(54); // previous way like line 11-18
		// The below for loop is not mandatory, just we put a loop and condition to add data inside the set2
		for (int i = 0; i<100; i+=3) {
			if(i % 2 == 0) { // If you divide a number with 2 and the remainder is 0, that is an even number
				set2.add(i);
			}
		}
		
		System.out.println("Stored Data in set2: " + set2);
		System.out.println("Size of set2: " + set2.size());
		// There is no get() method like List, why? because data doesn't have any index number like List
		
		System.out.println("\n--------------------------------");
		// using addAll(), we are insert set2, inside the set1
		set1.addAll(set2);
		System.out.println("After addAll(), Size of set1: " + set1.size());
		System.out.println("Stored Data in set1: " +set1);
		
		// Remove an Item
		System.out.println("\n--------------------------------");
		// removing a specific element --> not index wise
		set2.remove(18);
		// removing from set2, not from set1
		System.out.println("Stored Data in set2: " + set2);
		System.out.println("After remove, Size of set2: " + set2.size());
		
		// Check If an Data/Item Exists
		System.out.println("\n--------------------------------");
		if (set2.contains(89)) {
			set2.remove(89);
		} else if (!set2.contains(89)) {
			System.out.println("Set2 is unchanged as It doesnot contain 89");
		}
		
		System.out.println("\n--------------------------------");
		// removing all from set1
		set1.removeAll(set2);
		System.out.println("Stored Data in set1: " +set1);
		System.out.println("After removeAll(), Size:" + set1.size());
		
		System.out.println("\n--------------------------------");
		// address of the object
		System.out.println("Hash code for set1 object: " + set1.hashCode()); // give you hash code for set1 obj
		System.out.println("Hash code for set2 object: " + set2.hashCode()); // give you hash code for set2 obj

		System.out.println("\n--------------------------------");
		// We can use for each loop or Iterator to print all data from set1
		if (set1.isEmpty()) {
			System.out.println("No Data inside set1");
		} else if (!set1.isEmpty()) {
			for (Integer a : set1) {
				System.out.println(a);
			}
		} 
		
		System.out.println("\n-------------- Using clear() ------------------");
		if (!set1.isEmpty()) {
			set1.clear();
			System.out.println(set1);
		}	else {
			System.out.println(set1);
		}

	}

}
