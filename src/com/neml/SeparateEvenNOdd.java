package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SeparateEvenNOdd {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(32, 18, 67, 21, 71, 87, 56, 42, 14, 95);
		
		List<Integer> listOfDistinct = listOfIntegers.stream().distinct().collect(Collectors.toList());
		System.out.println(listOfDistinct);
//		Map<Boolean, List<Integer>> mp = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
//		System.out.println(mp);
		
		List<Integer> ascList = listOfIntegers.stream().sorted().collect(Collectors.toList());
		System.out.println(ascList);
		List<Integer> descList = listOfIntegers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(descList);
		
		Integer maxValue = listOfIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		System.out.println(maxValue);
		
		Integer minValue = listOfIntegers.stream().min(Integer :: compare).get();
		System.out.println(minValue);
				

	}

}
