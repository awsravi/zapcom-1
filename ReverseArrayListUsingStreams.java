package com.zapcom;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayListUsingStreams {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Reverse the ArrayList using Streams
        List<String> reversedArrayList = IntStream.range(0, arrayList.size())
                .mapToObj(i -> arrayList.get(arrayList.size() - 1 - i))
                .collect(Collectors.toList());

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + reversedArrayList);
    }
}
