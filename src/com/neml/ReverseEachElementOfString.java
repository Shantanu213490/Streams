package com.neml;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachElementOfString {

	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";
		
		String ls = Arrays.stream(str.split(" ")).map(i -> new StringBuffer(i).reverse()).collect(Collectors.joining(" "));
		System.out.println(ls);

	}

}
