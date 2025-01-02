package com.neml;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DuplicateCharactersInString {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(71, 71, 18, 42, 21, 67, 32, 32, 56, 95, 14, 56, 87);
		Collections.sort(listOfIntegers);
		System.out.println("Sorted List : " + listOfIntegers);

		List<Integer> evenNum = listOfIntegers.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
		System.out.println("Even Numbers : " + evenNum);
		List<Integer> oddNum = listOfIntegers.stream().filter(i -> i % 2 != 0).distinct().collect(Collectors.toList());
		System.out.println("Odd Numbers : " + oddNum);

//-----------------------------------------------------------------------------------------------------------------------------------
		String inputString = "Java Concept Of The Day";

		Map<String, Long> frequencyOfEachCharInString = Arrays.stream(inputString.replace(" ", "").split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frequency of each character in string : " + frequencyOfEachCharInString);

		Map<Character, Long> freqOfEachChar = inputString.replace(" ", "").chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frequency of each character : " + freqOfEachChar);
//-----------------------------------------------------------------------------------------------------------------------------------

		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		Map<String, Long> FreqOfEachElement = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(FreqOfEachElement);
// ----------------------------------------------------------------------------------------------------------------------------

		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

		List<Double> decimalInRev = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println("List in reverse order : " + decimalInRev);
//------------------------------------------------------------------------------------------------------------------------------

		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

		String lsWithPrefixNSuffix = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(lsWithPrefixNSuffix);
//------------------------------------------------------------------------------------------------------------------------------

		List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		int maxIntOfList = listOfIntegers1.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max number using max : " + maxIntOfList);

		int minIntOfList = listOfIntegers1.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Max number using max : " + minIntOfList);
//------------------------------------------------------------------------------------------------------------------------------

		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();

		for (int i : c)
			System.out.print(+i + " ");
//--------------------------------------------------------------------------------------------------------------------------------

		List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		List<Integer> max3Num = listOfIntegers2.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Maximum 3 numbers in list : " + max3Num);

		List<Integer> min3Num = listOfIntegers2.stream().sorted(Comparator.naturalOrder()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Minimum 3 numbers in list : " + min3Num);
//----------------------------------------------------------------------------------------------------------------------------------

		String s1 = "RaceCar";
		String s2 = "CarRace";

		Boolean result = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.toList())
				.equals(Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.toList()));
		System.out.println("Is String1 is anagram of String2 : " + result);
//----------------------------------------------------------------------------------------------------------------------------------

		List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		Integer secondLargestNum = listOfIntegers3.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElseThrow();
		System.out.println("Second largest number : " + secondLargestNum);
//-----------------------------------------------------------------------------------------------------------------------------------
		List<String> lenOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		List<String> sortStringAccToLen = lenOfString.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println("List of String according to length : " + sortStringAccToLen);

		List<String> sortStringAccToLen1 = lenOfString.stream()
				.sorted((o1, o2) -> Integer.compare(o1.length(), o2.length())).collect(Collectors.toList());
		System.out.println("List of String according to length : " + sortStringAccToLen1);

		List<String> sortStringAccToLen2 = lenOfString.stream().sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());
		System.out.println("List of String according to length : " + sortStringAccToLen2);

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

		int[] a1 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		int sumOfElementInArray1 = Arrays.stream(a1).boxed().reduce(0, Integer::sum);
		System.out.println("Sum of elements in an array : "+sumOfElementInArray1);
		int sumOfElementInArray2 = Arrays.stream(a1).sum();
		System.out.println("Sum of elements in an array : "+sumOfElementInArray2);
		
		int AvgOfElementInArray1 = Arrays.stream(a1).boxed().reduce(0, Integer::sum)/a1.length;
		System.out.println("Average of elements in an array : "+AvgOfElementInArray1);
		
		double AvgOfElementInArray2 = Arrays.stream(a1).average().orElse(0.0);
		System.out.println("Average of elements in an array : "+AvgOfElementInArray2);
		
//---------------------------------------------------------------------------------------------------------------------------------------------------------------		
		
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
        List<Integer> list3 = list1.stream().filter(i -> list2.contains(i)).collect(Collectors.toList());
        System.out.println(list3);
        List<Integer> list4 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(list4);
//---------------------------------------------------------------------------------------------------------------------------------------------------------------
		
        String str = "Java Concept Of The Day";
        
       

		Character firstNonRepeatChar = str.toLowerCase().replace(" ", "").chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), () -> new LinkedHashMap<>(), Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey()).findFirst().orElseThrow();
        
        System.out.println("First non Repeating char : "+firstNonRepeatChar);
        
        
        Character lastNonRepeatChar = str.toLowerCase().replace(" ", "").chars()
        	    .mapToObj(i -> (char) i)
        	    .collect(Collectors.groupingBy(Function.identity(), () -> new LinkedHashMap<>(), Collectors.counting()))
        	    .entrySet().stream()
        	    .filter(entry -> entry.getValue() == 1) // Filter for repeating characters
        	    .map(Map.Entry::getKey) // Get the characters
        	    .reduce((first, second) -> second) // Get the last character by reducing
        	    .orElseThrow(); // Throw an exception if repeating character is found
        
        System.out.println("Last non Repeating char : "+lastNonRepeatChar);
        
        Character firstRepeatChar = str.toLowerCase().replace(" ", "").chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), () -> new LinkedHashMap<>(), Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey()).findFirst().orElseThrow();
        
        System.out.println("First Repeating char : "+firstRepeatChar);
        
        
        Character lastRepeatChar = str.toLowerCase().replace(" ", "").chars()
        	    .mapToObj(i -> (char) i)
        	    .collect(Collectors.groupingBy(Function.identity(), () -> new LinkedHashMap<>(), Collectors.counting()))
        	    .entrySet().stream()
        	    .filter(entry -> entry.getValue() > 1) // Filter for repeating characters
        	    .map(Map.Entry::getKey) // Get the characters
        	    .reduce((first, second) -> second) // Get the last character by reducing
        	    .orElseThrow(); // Throw an exception if no repeating character is found
        
        System.out.println("Last Repeating char : "+lastRepeatChar);
        
                
        
        
        
        
        
		
	}

}
