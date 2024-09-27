package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class lenOfStringUsingStream {

	public static void main(String[] args) {
		
//		List<String> s = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
//		//remove duplicate element in list
//		List<String> ls = s.stream().distinct().collect(Collectors.toList());
//		System.out.println(ls);
		
		//Find a list of element which starts with j
//		List<String> ls = s.stream().distinct().filter(i -> i.startsWith("J")).collect(Collectors.toList());
//		System.out.println(ls);
		
		
//		From the given list of integers, print the numbers which are multiples of 5?
//		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//		List<Integer> ls = listOfIntegers.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
//		System.out.println(ls);
		
		
//		find minimum and maximum numbers
		
//		int maxNum = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
//		int minNum = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
//		System.out.println("Maximum number from the given List is " +maxNum+ " and Minimum Number is " +minNum);
		
		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> ls = listOfIntegers.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toSet());
		
		System.out.println(ls);
			
		
		
		
	}

}
