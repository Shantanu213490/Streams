package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxStringOfContainsSubString {

	public static void main(String[] args) {
		
		List<String> sbs = Arrays.asList("hello world hello", "world cup", "java programming", "hello");
		
		String str = sbs.stream().filter(i -> i.contains("world")).max(Comparator.comparing(String :: length)).orElse("No string contains the substring");
		System.out.println(str);

	}

}
//Question 1: Given a list of strings, use Java 8 Stream API to find the longest string that contains a specific substring.
//If there are multiple strings with the same maximum length, return the first one.
//
//Example: Input: ["hello world", "world cup", "java programming", "hello"],
//substring: "world"
//Output: "hello world"