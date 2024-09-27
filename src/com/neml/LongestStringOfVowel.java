package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringOfVowel {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "elephant", "aardvark");
		
		String longestString = fruits.stream().filter(i -> i.startsWith("a") || i.startsWith("e") || i.startsWith("i")
				|| i.startsWith("o") || i.startsWith("u")).max(Comparator.comparing(String :: length)).orElse("");
		
		System.out.println(longestString);

	}

}
//Question 1: Given a list of strings, use Java 8 Stream API to find the longest string that starts with a vowel.
//If there are multiple longest strings, return the first one.
//Example input: ["apple", "banana", "orange", "elephant", "aardvark"] 
//Expected output: "elephant"