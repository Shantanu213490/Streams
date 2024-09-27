package com.neml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfElementInList {

	public static void main(String[] args) {
		
//Question 1:
//Given a list of strings, find the longest string that appears at least twice in the list. If no such string exists, return an empty string.
//Example input: ["apple", "banana", "apple", "orange", "banana", "grape"]
//Expected output: "banana"
		
		List<String> ls = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		
		String result = ls.stream()
                .collect(Collectors.groupingByConcurrent(s -> s))
                .entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .max((e1, e2) -> Integer.compare(e1.getKey().length(), e2.getKey().length()))
                .map(Map.Entry::getKey)
                .orElse("");
		
		System.out.println(result);
		
		List<Integer> num1 = Arrays.asList(1, 2);
		List<Integer> num2 = Arrays.asList(3, 4);
		List<Integer> num3 = Arrays.asList(5, 6);
		List<List<Integer>> ls1 = Arrays.asList(num1,num2,num3);	
		
		List<Integer> nums = ls1.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
		System.out.println(nums);
		
		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 5, 2, 6 );
		
		Map<Integer, Long> getNum = numbers.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
		
		System.out.println(getNum);
		
		Long firstDuplicateNum = getNum.values().stream().max(Long :: compare).orElse(0L);
		System.out.println(firstDuplicateNum);
		

	}

}
//[1, 2, 3, 4, 5, 2, 6] Expected output: Optional[2]

//Question 4: Write a Stream API solution to flatten a list of lists into a single list.
//For example, [[1, 2], [3, 4], [5, 6]]
//should become [1, 2, 3, 4, 5, 6].