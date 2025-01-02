package com.neml;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInList {

	public static void main(String[] args) {
	
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		Set<Integer> hs = new HashSet<>();
//		hs.addAll(myList);
//		System.out.println(hs);
		
		List<Integer> duplicateNum = myList.stream().filter(i -> !hs.add(i)).collect(Collectors.toList());
		System.out.println(duplicateNum);
		
		
		
		


	}

}
