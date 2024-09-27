package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentWords {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("hello world", "hello java", "java is fun", "fun with java");
		
		List<String> ls = str.stream()
	        .flatMap(s -> Arrays.stream(s.split("\\s+")))
	        .collect(Collectors.toList());
		
		List<String> top3Words = str.stream()
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
		
		System.out.println(ls);
		System.out.println(top3Words);
		
		        
		
		
	
		

	}

}
//1. Find the top 3 most frequent words in a list of strings
//Given a list of strings, use the Stream API to find the top 3 most frequent words.
//Assume words are separated by spaces and ignore case.

//Example input: ["hello world", "hello java", "java is fun", "fun with java"]
//Expected output: ["java", "hello", "fun"]