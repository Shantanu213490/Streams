package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachIntInList {

	public static void main(String[] args) {
		
//Question 2:
//Write a method that takes a list of integers as input and returns a map where the keys are the integers and the values are the frequencies of each integer in the list. However, only include integers that appear more than once in the list.
//Example input: [1, 2, 3, 2, 4, 5, 5, 6]
//Expected output: {2=2, 5=2}
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 5, 5, 6);
		
//		Map<Integer,Long> countOfNum = nums.stream().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
		
		Map<Integer, Long> countOfNum = nums.stream()
		        // Group the integers by their values and count the frequency of each integer
		        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
		        // Filter out the entries with a frequency of 1
		        .entrySet().stream()
		        .filter(e -> e.getValue() > 1)
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		System.out.println(countOfNum);
		
		

	}

}
