package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfArrayList02 {

	public static void main(String[] args) {
		// We can assigned indexing, line 13, 15, .....
		// Who is assigned to index [1]?
		// But you have to assign sequentially descending order
		ArrayList list = new ArrayList();
		list.add("Atlanta");
		list.add(0, "New York"); // We assigned ''New York" in index 0
		list.add("Montana");
		list.add(2, "California"); // We assigned ''California" in index 2
		list.add(4, "Maryland"); // We assigned ''Maryland" in index 4
		
		System.out.println(list);
		
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using Iterator -------------");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
