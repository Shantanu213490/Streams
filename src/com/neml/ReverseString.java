package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";

		Stream<String> st = Stream.of(str).map(i -> new StringBuffer(i).reverse().toString());
		st.forEach(System.out::println);
		
		// Or, using Stream API
        String reversedUsingStream = Arrays.stream(str.split(""))
                .reduce("" ,(first, second) -> second + "" + first); // Reverse the order of words
        System.out.println(reversedUsingStream);
	}

}
