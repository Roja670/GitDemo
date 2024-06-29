package introduction;

import java.util.ArrayList;

public class corejavaConcepts {

	public static void main(String[] args) {
		int Mynum = 5;
		String website = "Google";
		char letter = 'r';
		double dec = 5.00;
		boolean myCard = true;

		System.out.println(Mynum + "is the value stored in the mynum variable");
		System.out.println(website);
		//Array can store multiple values in a single variable.

		// Arrays
		// new will create memory for those many values what we are going to store in
		// this variable.
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		int[] arr2 = { 1, 2, 3, 4, 5 };
		System.out.println(arr2[2]);

		// for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		String[] name = { "roja", "lin", "nanda" };
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		// Enhanced array
		for (String s : name) {
			System.out.println(s);
		}

		int[] arr3 = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 12 };
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] % 2 == 0) {
				System.out.println(i);
				break; // if you want to exit the loop
			} else {
				System.out.println(arr3[i] + "is not multiple of 2");
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("website");
		a.add("selenium");
		a.add("python");
		a.add("java");
		System.out.println(a.get(2));

		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(1));
		}
		System.out.println("-------------------");

		for (String val : a) {
			System.out.println(val);
		}
		// item is presenet arraylist

		System.out.println(a.contains("selenium"));

	}

}
