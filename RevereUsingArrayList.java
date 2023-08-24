package com.zapcom;

import java.util.ArrayList;
import java.util.List;

public class RevereUsingArrayList {

	public static void main(String[] args) {
		// Create an ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");

		// Display the original ArrayList
		System.out.println("Original ArrayList: " + arrayList);

		// Reverse the ArrayList without using inbuilt methods
		int size = arrayList.size();
		for (int i = 0; i <size/2; i++) {
			String temp = arrayList.get(i);
			arrayList.set(i, arrayList.get(size - 1 - i));
			arrayList.set(size - 1 - i, temp);
		}

		// Display the reversed ArrayList
		System.out.println("Reversed ArrayList: " + arrayList);
	}
}
