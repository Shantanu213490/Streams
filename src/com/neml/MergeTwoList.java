package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8);

		List<Integer> list3 = Stream.concat(list1.stream(), list2.stream()).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println(list3);

	}

}
//Merge two lists of integers into a single sorted list: 
//Use Java 8 Streams to merge two lists of integers into a single sorted list.