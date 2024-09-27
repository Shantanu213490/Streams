package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		
		List<String> ls = Arrays.asList("Tom","Alex","Hartley","thomas");
		
		Map<Integer, List<String>> getStrLen = ls.stream().collect(Collectors.groupingBy(String::length));

		getStrLen.forEach((length, stringList) ->
         System.out.println("Strings with length " + length + ": " + stringList));
	}

}
