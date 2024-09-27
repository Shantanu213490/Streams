package com.neml.exp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalindromeExample {

	public static void main(String[] args) {
		
//Question 10: Write a method that takes a list of strings and returns a list of strings that are palindromes. If no palindromes are found, return an empty list.
//Example input: ["madam", "hello", "radar", "java"] Expected output: ["madam", "radar"]
		
		List<String> palindrome = Arrays.asList("madam", "hello", "radar", "java");
		
		List<String> ls = palindrome.stream().map(i -> new StringBuilder(i).reverse().toString()).collect(Collectors.toList());
		
		List<String> filter = palindrome.stream().filter(i -> ls.contains(i)).collect(Collectors.toList());
		
		System.out.println(filter);
//------------------------------------------------------------------------------------------------------------------------------------------------		
		List<String> str2 = palindrome.stream().filter(i -> i.equals(new StringBuilder(i).reverse().toString())).collect(Collectors.toList());
		
		System.out.println(str2);
	}

}
