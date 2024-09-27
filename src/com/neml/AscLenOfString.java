package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AscLenOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

		List<String> ascLen = strings.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println(ascLen);
	}

}

//2 . Sort a list of strings based on their length: Use Java 8 Streams
//to sort a list of strings in ascending order of their lengths.