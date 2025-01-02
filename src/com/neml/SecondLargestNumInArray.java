package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		
		int[] arr = {45, 12, 56, 15, 24, 75, 31, 89};
		
		Integer secLargestElement = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		System.out.println("Second largest element of the array is "+secLargestElement);
		
		int sumOfElementsInArr = Arrays.stream(arr).sum();
		System.out.println("Sum of all the elements of array is "+sumOfElementsInArr);
		
		double avgOfElementsinArr = Arrays.stream(arr).average().getAsDouble();
		System.out.println("Average of elements present in array is "+avgOfElementsinArr);
		
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		
		List<String> stringAccToLen = listOfStrings.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
		
		System.out.println("List of string according to ascending order of their length : "+stringAccToLen);
	}

}
