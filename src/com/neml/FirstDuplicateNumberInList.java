package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstDuplicateNumberInList {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 2, 5, 6);
		
//		Map<Integer ,Long> CountOfduplicateNum = nums.stream().collect(Collectors.groupingBy(Integer :: intValue,Collectors.counting()));	
//		Long duplicateNum = CountOfduplicateNum.values().stream().max(Long :: compare).orElse(0L);
//		System.out.println(duplicateNum);
		
		nums.stream()
        .collect(Collectors.toMap(Function.identity(), e -> 1, (a, b) -> a + 1))
        .entrySet().stream()
        .filter(e -> e.getValue() > 1)
        .findFirst()
        .ifPresent(e -> System.out.println("First duplicate element: " + e.getKey()));
		
	}

}
//Question 4: Write a Java 8 Stream API program to find the first duplicate element in a list of integers.
//Example input: [1, 2, 3, 4, 2, 5, 6] 
//Expected output: 2