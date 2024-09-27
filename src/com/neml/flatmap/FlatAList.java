package com.neml.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatAList {

	public static void main(String[] args) {
		
		List<Integer> ls1 = Arrays.asList(1, 2);
		List<Integer> ls2 = Arrays.asList(3, 4);
		List<Integer> ls3 = Arrays.asList(5, 6);
		List<List<Integer>> lsOfList = new ArrayList<>();
		
		lsOfList.add(ls1);
		lsOfList.add(ls2);
		lsOfList.add(ls3);
		System.out.println(lsOfList);
		
		List<Integer> flatResult = lsOfList.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(flatResult);

	}

}
//Flat Mapping a Stream: Write a Java program that uses streams to flatten a list of lists of integers into a single list of integers.
//Example input: [[1, 2], [3, 4], [5, 6]] 
//Example output: [1, 2, 3, 4, 5, 6]