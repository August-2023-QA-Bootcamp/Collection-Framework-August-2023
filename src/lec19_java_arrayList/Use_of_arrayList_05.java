package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
// for coding challenge
public class Use_of_arrayList_05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Herry");
		list.add("Ivaan");
		list.add("Deep");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			if (str.equals("Herry")) {
				itr.remove(); // Use of remove method of Iterator
				System.out.println(list);
			}
		}
		

		for (String s : list) {
			System.out.println(s);
			list.remove(2);
		}
		//  java.util.ConcurrentModificationException
		// because we can't do modification inside for each loop
		// But inside for loop OK, see below
		
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			list.remove(3);
		}
		*/

	}
}
