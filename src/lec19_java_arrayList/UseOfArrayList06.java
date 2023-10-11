package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList06 {

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
		ar.add('M'); // Here char type
		System.out.println(ar.size()); // In Array this is length
		System.out.println(ar); //ArrayList accept all data type
		
		// Use of addAll()
		ArrayList <String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		// New
		// How can we get the content of one ArrayList inside Another
		// addAll() --> Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
		// ar object from line 9
		ar.addAll(arrayList);
		// applied addAll() in ar[]-->now ar object have the content of the arrrayList object
		System.out.println(ar.size());
		System.out.println("After using addAll method the new Array List: \n" + ar);
		
		// use of removeAll() method
		// removeAll() --> Removes from this list all of its elements that are contained in the specified collection.
		ar.removeAll(arrayList);
		System.out.println(ar.size());
		System.out.println("After using removeAll method the new Array List: \n" + ar);
		
		// use of retainAll()--only keeps common value between two ArrayList obj
		ArrayList<String> ar9 = new ArrayList(); // creating new ArrayList
		ar9.add("Alex"); // -------this is common
		ar9.add("Brian");
		ar9.add("alfred"); // Case sensitive
		ar9.add("Jennifer"); 
		// applying retainAll() below, which will keep the common from the list
		// Retains only the elements in this list that are contained in the specified collection. In other words, removes from this list all of its elements that are not contained in the specified collection.
		ar.retainAll(ar9);
		
		System.out.println(ar.size());
		System.out.println("After using retainAll method the new Array List: \n" + ar);
		
	}

}
