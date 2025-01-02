package com.neml.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {

	public static void main(String[] args) {

//	1.	List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
//		List<Integer> flatList = numbers.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
//		System.out.println(flatList);
//	----------------------------------------------------------------------------------------------------	
////		2. **Flattening a list of arrays**:
////			   Given a list of arrays: `List<String[]> colors = Arrays.asList(new String[] {"Red", "Green"}, new String[] {"Blue", "Yellow"});`
////			   Use `flatMap` to create a single list containing all the colors.
//		
//		List<String[]> colors = Arrays.asList(new String[] {"Red", "Green"}, new String[] {"Blue", "Yellow"});
//		
//		
//		List<String> flatColors = colors.stream()
//		        .flatMap(array -> Arrays.stream(array))
//		        .collect(Collectors.toList());
//		
//		System.out.println(flatColors);
//
		
		List<Integer> ls1 = Arrays.asList(1, 2, 3, 5, 8 ,10);
		List<Integer> ls2 = Arrays.asList(3, 4, 6, 7, 8, 9);
		
		List<Integer> ls3 = ls1.stream().filter(ls2::contains).distinct().collect(Collectors.toList());
		
		List<Integer> ls4=ls1.stream()
                .filter(ls2::contains) // Keep only elements that are in both lists
                .distinct() // Ensure uniqueness
                .collect(Collectors.toList());
		
		System.out.println(ls3);
		System.out.println(ls4);

	}

}
