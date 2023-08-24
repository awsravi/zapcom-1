package com.zapcom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArrayList_Method {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // Reverse the ArrayList
        Collections.reverse(arrayList);

        // Display the reversed ArrayList
        System.out.println("Reversed ArrayList: " + arrayList);
        
        
    }
        
        
    
}
