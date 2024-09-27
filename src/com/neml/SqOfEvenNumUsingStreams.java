package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class SqOfEvenNumUsingStreams {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(3,9,2,7,4,8);

//		square of even number
//		 List<Integer> result = num.stream()
//				 .filter(i -> i % 2==0)
//				 .map(i -> i*i).collect(Collectors.toList());
//		 
//		 System.out.println(result);
	
//		sum of squares of all odd numbers
		OptionalDouble result = num.stream()
				.filter(i -> i%2 != 0).mapToDouble(i -> i*i)
				.average();	
		System.out.println(result);
		
//		List<String> string = Arrays.asList("neml","spring","java","neml","kafka","dbeaver","redis","kafka");
		
//		List<String> result = string.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		
//		List<String> result = string.stream().distinct().collect(Collectors.toList());

		
//		System.out.println(result);
	}

}
