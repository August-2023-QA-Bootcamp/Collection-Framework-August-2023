package lec19_java_arrayList;

import java.util.ArrayList;

public class UseOfArrayList03 {
	public static void main(String[] args) {
		ArrayList<String>ar = new ArrayList<>();
		ar.add("Nick");
		ar.add("Charles");
		ar.add("Boris");
		ar.add("Aaron");
		
		System.out.println(ar);
		
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for(String s: ar) {
			System.out.println(s);
		}
		
	}

}
