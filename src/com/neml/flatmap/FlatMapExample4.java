package com.neml.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample4 {

	public static void main(String[] args) {

//	1.You have a list of lists of integers, e.g., List<List<Integer>>.
//		Write a method that uses flatMap to flatten this list into a single list of integers.
//		Additionally, filter out any integers that are negative.

		List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, -3), Arrays.asList(-4, 5, 6),
				Arrays.asList(7, -8, 9));

		List<Integer> listOfLs = nestedList.stream().flatMap(i -> i.stream().filter(m -> m > 0))
				.collect(Collectors.toList());
		System.out.println("List of positive integer : " + listOfLs);

//		2.Given a list of sentences (strings), 
//		write a method that uses flatMap to extract all unique words from the sentences.
//		Ignore case and punctuation.

		List<String> sentences = Arrays.asList("Hello world!", "Hello Java 8 Streams.", "Streams are powerful.");
		
		Set<String> uniqueString = sentences.stream()
	            .flatMap(sentence -> Arrays.stream(sentence.split("\\W+"))) // Split by non-word characters
	            .map(String::toLowerCase) // Convert to lowercase
	            .filter(word -> !word.isEmpty()) // Filter out empty strings
	            .collect(Collectors.toSet()); // Collect into a Set to ensure uniqueness

	}

}
