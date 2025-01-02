package com.neml;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AvgOfElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {3, 1, 4, 1, 5, 9, 3, 4};
		
		//1
		int avgOfArr = Arrays.stream(arr).sum()/arr.length;
		System.out.println("Average of elements present in array is "+avgOfArr);
		//2
		int maxElement = Arrays.stream(arr).sorted().findFirst().orElseThrow();
		System.out.println("Maximum element of array is "+maxElement);
		
		List<Integer> firstDuplicate = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Map<Integer,Long> count = firstDuplicate.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		int first = count.keySet().stream().filter(i -> i > 1).findFirst().orElseThrow();
		System.out.println(first);
		
		int firstDuplicateElement = Arrays.stream(arr).boxed().collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).keySet().stream()
				.filter(i -> i > 1).findFirst().orElseThrow();
		System.out.println(firstDuplicateElement);

	}

}

//1.Find the average of an array of integers: Given an array of integers,
//use Java 8 Stream API to find the average of the array elements.

//2.Find the maximum element in an array of integers: Given an array of integers,
//use Java 8 Stream API to find the maximum element in the array.

//3.Find the first duplicate element in an array of integers: Given an array of integers,
//use Java 8 Stream API to find the first duplicate element in the array.