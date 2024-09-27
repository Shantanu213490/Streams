package com.neml.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(23, 42, 34, 89, 13, 82);

		Integer sumOfEven = nums.stream().filter(i -> i % 2 == 0).reduce(0, (a, b) -> a + b).intValue();  //1.
                                                                                                                
		int sum = nums.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();                //2.

		System.out.println(sumOfEven);
		System.out.println(sum);
		
		Double avgOfNum1 = nums.stream().collect(Collectors.averagingDouble(Integer :: intValue));
		System.out.println("Average of List : "+avgOfNum1);
		
		double sumOfNum = nums.stream().reduce(0, (a,b)->a+b).intValue();
		
		double avgNum2 = sumOfNum/nums.size();
		
		System.out.println(avgNum2);
		
		double avgOfNum3 = nums.stream().mapToDouble(Integer :: doubleValue).average().orElse(0D);
		System.out.println(avgOfNum3);

	}

}
//1.Find the sum of all even numbers in a list of integers:
//Use Java 8 Streams to find the sum of all even numbers in a list of integers.

//2.Find the average of all numbers in a list of integers: 
//Use Java 8 Streams to find the average of all numbers in a list of integers.