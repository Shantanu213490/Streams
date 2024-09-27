package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfWordsInString {

	public static void main(String[] args) {

		String str = "String is the sequence of characters";

		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		List<String> ls = Arrays.asList(words);
		
		Map<String,Long> CountOfWords = ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(CountOfWords);
		
		long wordCount = Arrays.stream(str.split(" ")).count();
		System.out.println("Word count: " + wordCount);
		
		Map<String, Long> wordFrequency = Arrays.stream(str.split(" "))
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Word frequency: " + wordFrequency);

	}

}
