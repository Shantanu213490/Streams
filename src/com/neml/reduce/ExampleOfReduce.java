package com.neml.reduce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleOfReduce {

	public static void main(String[] args) {

//Given a list of integers, use the reduce function to calculate the sum of all integers in the list.
//Example input: [1, 2, 3, 4, 5] Expected output: 15

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);

		Integer sum = num.stream().reduce(0, Integer::sum).intValue();
		System.out.println("Sum of elements in list : " + sum);

//calculate the product of all integers in the list.
//Example input : [1, 2, 3, 4, 5] Expected output: 120

		Integer product = num.stream().reduce(1, (a, b) -> a * b).intValue();
		System.out.println("Product of elements in list : " + product);

//Given a list of integers, use the reduce function to find the maximum value in the list.
//Example input: [1, 2, 3, 4, 5] Expected output: 5

		Integer max = num.stream().reduce(0, Integer::max);
		System.out.println("the maximum value in the list : " + max);

//Given a list of integers, use the reduce function to accumulate the values in the list, starting from an initial value of 10.
//Example input: [1, 2, 3, 4, 5] Expected output: 25 (10 + 1 + 2 + 3 + 4 + 5)
		
		Integer accumulateSum = num.stream().reduce(10, (a, b) -> a + b).intValue();
		System.out.println("accumulate Sum of elements in list : " + accumulateSum);

//-------------------------------------------------------------------------------------------

//Given a list of strings, use the reduce function to concatenate all strings in the list into a single string.
//Example input: ["Hello", " ", "World"] Expected output: "Hello World"

//		List<String> ls = Arrays.asList("Hello", " ", "World");
//		
//		String str = ls.stream().reduce("", (a,b) -> a+b);
//		System.out.println("concatenate all strings --> " +str);
		
//Given a list of strings, use the reduce function with a custom accumulator to concatenate all strings in the list, separated by a comma.
//Example input: ["Apple", "Banana", "Cherry"] Expected output: "Apple,Banana,Cherry"
		
		List<String> ls = Arrays.asList("Apple", "Banana", "Cherry");
		
//		String str1 = ls.stream().collect(Collectors.joining(","));
//		String str1 = ls.stream().reduce("", (a,b)-> {
//			
//			if(a.isEmpty()) {
//				return b;
//			}else {
//				return a+","+b;
//			}
//			
//		});
//		System.out.println(str1);
		
		

//---------------------------------------------------------------------------------------------
		
//		7. Handle Empty Stream
//		Given an empty stream, use the reduce function to return a default value.
//		Example input: [] Expected output: "No values"
		
		List<String> emptyList = new ArrayList<>();
		String result = emptyList.stream().reduce((a, b) -> a + ", " + b)
                .orElse("No values");
		
		System.out.println(result);
	
		
		
		
//------------------------------------------------------------------------------------------------
		
//		8. Reduce with Multiple Operations
//
//		Given a list of numbers, use the reduce function to calculate the sum of squares of all numbers in the list.
//
//		Example input: [1, 2, 3, 4, 5] Expected output: 55 (1^2 + 2^2 + 3^2 + 4^2 + 5^2)
		
		Integer MultOfTwo = num.stream().reduce(0,(a,b) -> a + b * b);
		
		
		System.out.println(MultOfTwo);
		
		

	}

}
