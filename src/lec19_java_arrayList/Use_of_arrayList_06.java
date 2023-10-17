package lec19_java_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Use_of_arrayList_06 {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println("Please enter int type number");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {			
			ar.add(sc.nextInt());
		}
		sc.close();
		System.out.println("Here is your result: " + ar);
	}
}