package com.neml;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfNum {

	public static void main(String[] args) {


		String str = "this is my world";
		System.out.println(str.trim());
		
		Map<Character, Long> countOfEachChar = str.trim().chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(countOfEachChar);
		
		
		
		
		

	}

}
//How to count occurrences of each character of a String in Java 8?