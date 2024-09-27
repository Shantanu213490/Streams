package com.neml.exp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueElementInList {

	public static void main(String[] args) {

//Question 5: Given a list of integers, find the first integer that appears only once in the list. If no such integer exists, return -1.
//Example input: [1, 2, 3, 2, 4, 1, 3]
//Expected output: 4

		List<Integer> nums = Arrays.asList(1, 2, 3, 2, 4, 1, 3);
		Map<Integer, Long> map = nums.stream().collect(Collectors.groupingByConcurrent(i -> i, Collectors.counting()));
		System.out.println(map);

		Integer num = nums.stream().filter(i -> map.get(i) == 1).findFirst().orElse(-1);
		System.out.println(num);

	}

}
