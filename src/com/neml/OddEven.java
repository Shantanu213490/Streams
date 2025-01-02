package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(33,11,2,3,4,5,6,7,18,19,88,54,43,65,22,67,89,07);
		
		Map<Boolean, List<Integer>> IsEven = list.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));
		
		System.out.println(IsEven);
		
		Map<String, List<Integer>> num = list.stream()
				.collect(Collectors.groupingBy(i -> i%2==0 ? "Even Numbers" : "Odd Numbers"));
		System.out.println(num);

	}

}
