package com.neml.exp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestFrequencyString {

	public static void main(String[] args) {
		
//Question 1: Given a list of strings, find the longest string that appears at least twice in the list. If no such string exists, return an empty string.
//Example input: ["hello", "world", "hello", "java", "java", "streams"] 
//Expected output: "hello"
		
		List<String> str = Arrays.asList("hello", "world", "hello", "java", "java", "streams");
		
		String str1 = str.stream()
                .collect(Collectors.groupingByConcurrent(String::toString, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .max((e1, e2) -> e1.getKey().length() - e2.getKey().length())
                .map(Map.Entry::getKey)
                .orElse("");
				System.out.println(str1);
	
		
	}

}
