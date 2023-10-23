package lec22_java_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_05_hashSet_linkedHashSet_treeSet {
	public static void main(String[] args) {
		/*
		 * A Set is a generic set of values with no duplicate elements. Set is a parent
		 * interface of all set classes like TreeSet, HashSet, etc. means: TreeSet, HashSet etc implements Set
		 * 
		 * A HashSet is a set where the elements are not sorted or ordered. It is faster
		 * than a TreeSet.
		 * 
		 * A TreeSet is a set where the elements are sorted. ascending to descending order
		 *  
		 * The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
		 * When the iteration order is needed to be maintained this class is used. 
		 * 
		 * When iterating through a HashSet the order is unpredictable, 
		 * while a LinkedHashSet lets us iterate through the elements in the order in which they were inserted. 
		 * 
		 * When cycling through LinkedHashSet using an iterator, 
		 * the elements will be returned in the order in which they were inserted.
		 */
	
		System.out.println("\n----------------- Generic <String> type -----------------------");
		// HashSet class implements Set Interface
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Bradley");
		hashSet.add("Katie");
		hashSet.add("Brad");
		hashSet.add("Amy");
		hashSet.add("Ryan");
		hashSet.add("Jamie");
		hashSet.add("Kevin");
		hashSet.add("David");
		System.out.println("HashSet = " + hashSet);
		
		// TreeSet class implements Set Interface
		Set<String> treelinkedHasSet1 = new TreeSet<>(hashSet);
		System.out.println("TreeSet = " + treelinkedHasSet1);
		// We can see Treeset is sorted alphabetically [ascending order]
		
		// LinkedHashSet class implements Set Interface
		Set<String> linkedHasSet1 = new LinkedHashSet<>();
		// See the insertion order
		linkedHasSet1.add("Bradley");
		linkedHasSet1.add("Katie");
		linkedHasSet1.add("Brad");
		linkedHasSet1.add("Amy");
		linkedHasSet1.add("Amy"); // Duplicated
		linkedHasSet1.add("Ryan");
		linkedHasSet1.add("Jamie");
		linkedHasSet1.add("Kevin");
		linkedHasSet1.add("David");
		
		System.out.println("LinkedHashSet = " + linkedHasSet1);
		
		// TreeSet class implements Set Interface
		Set<String> treeSet = new TreeSet<>(linkedHasSet1);
		System.out.println("TreeSet = " + treeSet);
		
		
		System.out.println("\n----------------- Generic <Integer> type -----------------------");
		// Another example of HashSet, LinkedHashSet and TreeSet
		
		// This is an Array, container also can stay after array name
		int a[] = { 77, 23, 4, 66, 99, 112, 45, 56, 39, 89 }; 
		
		Set<Integer> set = new HashSet<Integer>();
		try {
			for (int i = 0; i < 5; i++) {
				set.add(a[i]); // Getting data from Array
			}
			System.out.println("HashSet is not Sorted:  " + set);
			
			TreeSet<Integer> ts = new TreeSet<Integer>(set);
			System.out.println("TreeSet is Sorted:  " + ts);			
		} catch (Exception e) {
		}
		
		Set<Integer> linkedHasSet2 = new LinkedHashSet<Integer>();
		try {
			for (int i = 3; i < 8; i++) {
				linkedHasSet2.add(a[i]); // Getting data from Array
			}
			System.out.println("LinkedHashSet is in inserted ordered:  " + linkedHasSet2);
			
			TreeSet<Integer> ts = new TreeSet<Integer>(linkedHasSet2);
			System.out.println("TreeSet is Sorted:  " + ts);
		} catch (Exception e) {
		}
		
	}

}
