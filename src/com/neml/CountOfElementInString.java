package com.neml;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfElementInString {

	public static void main(String[] args) {
		
		String inputString = "Java Concept Of The Day";
		
		Map<Character, Long> countOfElement = inputString.toLowerCase()
				.chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countOfElement);
		
		Integer num = 32832432;
		Map<Character, Long> countOfNumber = num.toString()
				.chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(countOfNumber);
		
		int[] nums = {3, 69, 2, 51, 78, 23, 401};
		Map<Character, Long> count = Arrays.stream(nums)
				.mapToObj(String::valueOf)
	            .reduce("", (a, b) -> a.concat(b)) //.collect(Collectors.joining()) // Use joining() instead of reduce()
		        .chars()
		        .mapToObj(i -> (char) i)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(count);
		

		
	}

}
