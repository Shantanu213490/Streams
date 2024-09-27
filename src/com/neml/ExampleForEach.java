package com.neml;

import java.util.Arrays;
import java.util.List;



public class ExampleForEach {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("orange","Green","Red","Black","Yellow","Blue","White","Pink","Brown");

		names.forEach( n -> System.out.println(n));			
	}

}
