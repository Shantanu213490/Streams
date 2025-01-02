package com.neml;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementInList {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		System.out.println(myList);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> ls = myList.stream().filter(i -> !set.add(i)).collect(Collectors.toList());
		Integer getSecondDuplicate = ls.stream().skip(1).findFirst().orElseThrow();
		
		System.out.println(ls);
		System.out.println(getSecondDuplicate);
		
		Set<Integer> dup = new HashSet<>();
		
		Integer elem = myList.stream().filter(i -> !dup.add(i)).findFirst().orElseThrow();
		System.out.println(elem);
	}

}
