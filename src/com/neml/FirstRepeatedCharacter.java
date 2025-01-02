package com.neml;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String input = "Java articles are Awesome";
		
		char firstRepeatChar = input.toLowerCase().replace(" ", "")
				.chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i -> i.getValue() > 1)
				.map(i -> i.getKey()).findFirst().orElseThrow();
		System.out.println("First repeating char in string : "+firstRepeatChar);
		
		char firtNonRepeatChar = input.toLowerCase()
				.replace(" ", "")
				.chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),()->new LinkedHashMap<>(),Collectors.counting()))
				.entrySet()
				.stream()
				.filter(i -> i.getValue()==1)
				.map(i -> i.getKey())
				.findFirst()
				.orElseThrow();
		
		System.out.println("First non repeating char in string : "+firtNonRepeatChar);
		
		char lastRepeatChar = input.toLowerCase().replace(" ", "").chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
				.entrySet().stream()
				.filter(i -> i.getValue() > 1)
				.map(Map.Entry::getKey)
				.reduce((a,b)->b)
				.get();
		System.out.println("Last repeating char in string : "+lastRepeatChar+ " for string : "+input);
		
//		Optional<Character> lastRepeatingChar = input.toLowerCase().replace(" ", "").chars()
//                .mapToObj(i -> (char) i)
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .reduce((first, second) -> second);
		
		char lastNonRepeatChar = input.toLowerCase().replace(" ", "").chars()
				.mapToObj(i -> (char)i)
				.collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
				.entrySet().stream()
				.filter(i -> i.getValue() == 1)
				.map(i -> i.getKey())
				.reduce((a,b)->b)
				.get();
		System.out.println("Last non repeating char in string : "+lastNonRepeatChar+ " for string : "+input);
		
		
				
	}

}
//8. Given a String, find the first repeated character in it using Stream functions?