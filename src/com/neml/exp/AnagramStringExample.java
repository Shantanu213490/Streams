package com.neml.exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStringExample {

	public static void main(String[] args) {
		
//4. Write a stream pipeline that takes a list of strings and returns a list of strings that are anagrams of each other. 
//For example, if the input list is ["listen", "silent", "enlist", "inlets"], the output should be ["listen", "silent", "enlist", "inlets"].
		
		List<String> str = Arrays.asList("listen", "silent", "enlist", "inlets");
		
		String input = "listen silent enlist inlets";
		String sorted = input.toLowerCase().chars()
	            .sorted()
	            .mapToObj(c -> String.valueOf((char) c))
	            .collect(Collectors.joining());

	        System.out.println(sorted);
	        
	    	List<String> anagrams = input.toLowerCase().chars()
	    	        .mapToObj(c -> String.valueOf((char) c))
	    	        .collect(Collectors.toList());
	    	
	    	System.out.println(anagrams);
	      
	    	


	}

}
