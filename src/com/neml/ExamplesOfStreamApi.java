package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExamplesOfStreamApi {

	public static void main(String[] args) {
		
		List<Integer> evenNum = Arrays.asList(1,5,9,2,4);
		
//		Optional<Integer> SqOfEvenNum = evenNum.stream().filter(n -> n%2 == 0).findAny();
		
		boolean isEvenNumber = evenNum.stream().findAny().filter( n -> n==1).isPresent();
					
		System.out.println(isEvenNumber);

	}

}
