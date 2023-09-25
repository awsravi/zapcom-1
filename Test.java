package com.zapcom;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FindmaxNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 20, 12,999);

		// Find the maximum number using Streams and reduce
		Optional<Integer> maxNumber = numbers.stream().reduce(Integer::max);
		System.out.println(maxNumber);

		OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
		System.out.println(max);

		Optional<Integer> maxNumbera = numbers.stream()
                .max(Integer::compareTo);
		System.out.println(maxNumbera);
		
		int [] arr=new int[] {1,2,3,2,4,6,677,8,86,54};
		
		Integer min=Arrays.stream(arr).min().getAsInt();
		System.out.println(min);
		
		Integer max1=Arrays.stream(arr).max().getAsInt();
		System.out.println(max1);


	
	}
}
