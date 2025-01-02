package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		
		List<String> startsWith1 = myList.stream().map(i -> i+"").filter(i -> i.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(startsWith1);

	}

}
// Given a list of integers, find out all the numbers starting with 1 using Stream functions?