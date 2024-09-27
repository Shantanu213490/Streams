package com.neml.reduce;

import java.util.Arrays;
import java.util.List;

public class ExampleOfReduce2 {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
		
		Integer result = ls.stream().reduce(0, (a,b) -> a+b).intValue();
		System.out.println(result);
		
		
		
	}

}
//Reducing a Stream: Write a Java program that uses streams to calculate the sum of a list of integers.
//Example input: [1, 2, 3, 4, 5] 
//Example output: 15