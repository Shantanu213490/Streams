package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UpperCharacters {

	public static void main(String[] args) {
		
		List<Character> ls = Arrays.asList('a','b','c','d','e');
		
		List<Character> characters = ls.stream()
		        .map(Character::toUpperCase)
		        .collect(Collectors.toList());
		
		System.out.println(characters);

	}

}
