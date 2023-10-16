package lec19_java_arrayList;

import java.util.ArrayList;

public class UseOfArrayList04 {

	public static void main(String[] args) {
		StudyGroup s1 = new StudyGroup("Joe", 80, "Biden");
		StudyGroup s2 = new StudyGroup("Kamala", 54, "Harris");
		StudyGroup s3 = new StudyGroup("Donald", 78, "Trump");
		StudyGroup s4 = new StudyGroup("George", 75, "Bush");
		
		ArrayList<StudyGroup>ar = new ArrayList<>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		// print by using for each loop/enhanced for loop/advanced for loop
		System.out.println("\n------------- Accessing the elements of the specified arrayList by using for each loop -------------");
		for (StudyGroup sg : ar) { //sg is a container, where to put the value from the below loop
			System.out.println(sg.fname + " " + sg.lname + " " + sg.age);
		}
		
		
		
		

	}

}
