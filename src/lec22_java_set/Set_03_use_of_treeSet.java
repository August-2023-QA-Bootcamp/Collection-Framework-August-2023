package lec22_java_set;

import java.util.TreeSet;

public class Set_03_use_of_treeSet {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Jaiden");
		treeSet.add("Jaiden");
		treeSet.add("Albert");
		treeSet.add("Luis");
		treeSet.add("Luis");
		treeSet.add("Charlie");
		treeSet.add("Douglas");
		// treeSet.add(null); // null is not allowed is TreeSet

		System.out.println(treeSet.size());
		System.out.println("TreeSet: " + treeSet);
		System.out.println("First Sorted Element: " + treeSet.first());
		System.out.println("Last Sorted Element: " + treeSet.last());
		System.out.println("Higher Sorted Element: " + treeSet.higher("Douglas"));
		System.out.println("Lower Sorted Element: " + treeSet.lower("Charlie"));

	}

}
