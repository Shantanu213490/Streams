package com.neml.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample3 {

	public static void main(String[] args) {

//		1. Flatten a list of lists into a single list
//Given a list of lists of integers, use flatMap to create a single list of integers.
		
		List<List<Integer>> lists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));
		
		List<Integer> ls = lists.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println("1.list of lists of integers --> "+ls);
		
//		2. Convert a stream of arrays into a stream of individual elements
//		Given a stream of arrays of strings, use flatMap to create a stream of individual strings.
		
		Stream<String[]> stream = Arrays
				.stream(new String[][] { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } });
		
		Stream<String> flatStream = stream.flatMap(Arrays::stream);
		
		flatStream.forEach(System.out::println);
		

	}

}
