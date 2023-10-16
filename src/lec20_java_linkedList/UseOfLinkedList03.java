package lec20_java_linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class UseOfLinkedList03 {

	public static void main(String[] args) {
		// Raw --> Hetrogenious
		LinkedList link = new LinkedList();
		link.add(5);
		link.add(5.5);
		link.add("Sohag");
		link.add("Sohag"); // duplicate value is allowed
		System.out.println(link);

		System.out.println("\n--------------------------------");
		// Generic --> Integer
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(345);
		ll1.add(483);
		ll1.add(789);
		ll1.add(435);
		ll1.add(789); // duplicate value is allowed
		ll1.addFirst(308);
		ll1.addLast(310);
		ll1.set(0, 307); // replacing index 0
		ll1.remove(3); // removing index 3
		ll1.removeFirst();
		ll1.removeLast();
		System.out.println(ll1);
		
		System.out.println("\n--------------------------------");
		// similar like addAll()
		// clone() --> Returns a shallow copy of this LinkedList. (The elements themselves are not cloned.)
		LinkedList<Integer> ll2 = (LinkedList) ll1.clone();
		ll2.add(83);
		ll2.add(89);
		ll2.add(35);
		System.out.println(ll2);

		System.out.println("\n--------------------------------");
		// Generic --> String
		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("Paypal");
		ll3.add("Google");
		ll3.add("Yahoo");
		ll3.add("IBM");
		ll3.add("Facebook");
		System.out.println(ll3);
		
		// very high level, keep the code  
		System.out.println("\n--------------------------------");
		// asList() convert an Array to an ArrayList
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		numbers.forEach(System.out::println);
		// the :: operator denotes you will be invoking the println method with a parameter, which name you don't specify explicitly:
		// forEach Performs the given action for each element of the Iterable until all elements have been processed or
		// the action throws an exception.
		// Java8 Loop
		// lambda expression
	}

}
