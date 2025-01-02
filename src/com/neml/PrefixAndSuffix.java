package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrefixAndSuffix {
	
	public static void main(String[] args) {
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		
		String prefixAndSuffix = listOfStrings.stream().collect(Collectors.joining(", ","[","]"));
		System.out.println(prefixAndSuffix);
	}

}
