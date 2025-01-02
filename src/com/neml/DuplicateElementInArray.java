package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.sound.midi.Instrument;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		 int[] a = new int[]{2,3,4,5,6,7,18,19,88,54,43,65,22};
		 
		 int[] b = Arrays.stream(a).distinct().toArray();
		 
		Map<Integer,Long> mp = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(mp);
		
		 List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		 
		 List<Double> revOrder = decimalList.stream().sorted(Comparator.naturalOrder())
				 .collect(Collectors.toList());
		 System.out.println(revOrder);
		 
		 Double max1 = decimalList.stream().max(Comparator.naturalOrder()).get();
		 Double max2 = decimalList.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
		 System.out.println(max1);
		 System.out.println(max2);
		
		 
		 Double min1 = decimalList.stream().min(Comparator.naturalOrder()).get();
		 Double min2 = decimalList.stream().sorted().findFirst().orElseThrow();
		 System.out.println(min1);
		 System.out.println(min2);
		 
		 int[] ab = new int[] {4, 2, 7, 1};
	     int[] ba = new int[] {8, 3, 9, 5};
		 
	     int[] ca = IntStream.concat(Arrays.stream(ab), Arrays.stream(ba)).sorted().distinct().toArray();
	     for(int fetch : ca) {
	    	 System.out.print(" "+fetch);
	     }
	     
	     List<Integer> list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	     
	     List<Integer> max3ls = list.stream().sorted().limit(3).collect(Collectors.toList());
	     System.out.println(max3ls);
	     List<Integer> min3Ls = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	     System.out.println(min3Ls);
	     
	        String s1 = "RaceCar";
	        String s2 = "CarRace";
	    
			List<String> st1 = Stream.of(s1.toLowerCase().replaceAll(" ", "").split("")).sorted()
					.collect(Collectors.toList());
	        
	        List<String> st2 = Stream.of(s2.toLowerCase().replaceAll(" ", "").split("")).sorted()
	        		.collect(Collectors.toList());
	        
	        
	        System.out.println(st1.equals(st2));
	        
	        
	        Boolean isTwoStringsAreAnagram = Stream.of(s1.toLowerCase()).sorted().collect(Collectors.toList())
	        		.equals(Stream.of(s2.toLowerCase()).sorted().collect(Collectors.toList()));
	        
	        System.out.println("isTwoStringsAreAnagram : "+isTwoStringsAreAnagram);
	        
	        
	        int i = 15623;
	        
	        int sum1 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
	        System.out.println(sum1);
	        
	        int sum2 = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
	        System.out.println(sum2);
	        
	        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#","HTMD", "HTML", "Kotlin", "C++", "COBOL", "C");
	        
	        List<String> sortingString = listOfStrings.stream().sorted(Comparator.comparing(String :: length))
	        		.collect(Collectors.toList());
	        System.out.println(sortingString);
	        
	        int num = 4567;
	        
	        int sum3 = Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
	        System.out.println(sum3);
	        
	        int sum4 = Stream.of(String.valueOf(num).split("")).mapToInt(Integer :: parseInt).sum();
	        System.out.println(sum4);
	        
	        int[] sa = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
	        
	        int sumOfInt1 = Arrays.stream(sa).sum();
	        System.out.println(sumOfInt1);
	        
	        int sumOfInt2 = Arrays.stream(sa).reduce(0, (a1,b1) -> a1+b1);
	        System.out.println(sumOfInt2);
	        
	        double avgOfInt1 = Arrays.stream(sa).average().orElseThrow();
	        System.out.println(avgOfInt1);
	        
	        double avgOfInt2 = Arrays.stream(sa).reduce(0, (a2,b2)->a2+b2)/sa.length;
	        System.out.println(avgOfInt2);
	        
	        
	        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	        
	        List<Integer> list3 = list1.stream().filter(i1 -> list2.contains(i1)).collect(Collectors.toList());
	        System.out.println(list3);
	        
	        String str = "Java Concept Of The Day";
	        
			String str2 = Stream.of(str.split("")).map(y -> new StringBuilder(y).reverse())
					.collect(Collectors.joining(""));
			System.out.println(str2);
			
			String collect = Stream.of(str.split(" ")).map(x -> new StringBuffer(x).reverse())
					.collect(Collectors.joining(" "));
			
			System.out.println(collect);
			
			String str3 = Arrays.stream(str.split(" ")).map(t -> new StringBuilder(t).reverse())
					.collect(Collectors.joining(" "));
			
			System.out.println(str3);
			
			int sumInRange = IntStream.range(3, 10).sum();
			System.out.println(sumInRange);
			
			int[] array = new int[] {5, 1, 7, 3, 9, 6};
			
			int[] arr5 = IntStream.rangeClosed(1, array.length).map(i5 -> array[array.length-i5]).toArray();
			
			int[] revArr = IntStream.rangeClosed(1, array.length).map(t1 -> array[array.length-t1]).toArray();
			
			 
			for(int rev:revArr) {
				System.out.print(rev+" ");
			}
			
			List<Integer> ls = IntStream.rangeClosed(1, 11).filter(p -> p%2 != 0).boxed().collect(Collectors.toList());
			System.out.println(ls);
			
			List<String> list5 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
					"Pencil");
			
			Entry<String, Long> mostFrequency = list5.stream()
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			System.out.println(mostFrequency);
			
			String strt = "TOTAMATOT";
			
			List<String> list7 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
			
			List<String> numLs = list7.stream().filter(st -> st.startsWith("1") || st.startsWith("2")
					|| st.startsWith("3") || st.startsWith("4") || st.startsWith("5")||st.startsWith("6")
					||st.startsWith("7")||st.startsWith("8") || st.startsWith("9") || st.startsWith("0"))
					.collect(Collectors.toList());
			
			System.out.println(numLs);
					
			List<Integer> listd = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
			
			Set<Integer> hset = new HashSet<>();
			
			List<Integer> dupLs = listd.stream().filter(i1 -> !hset.add(i1)).collect(Collectors.toList());
			System.out.println(dupLs);
			
			 String inputString11 = "Java Concept Of The Day";
			 
			 List<Character> ch2 = inputString11.toLowerCase().replaceAll(" ", "")
					 .chars()
					 .mapToObj(i9 -> (char)i9)
					 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					 .entrySet()
					 .stream()
					 .filter(i9 -> i9.getValue() > 1)
					 .map(i9 -> i9.getKey())
					 .collect(Collectors.toList());
			 
			 System.out.println(ch2);
			 
			 Character firstRepeatedChar = inputString11.toLowerCase().replaceAll(" ", "")
					 .chars().mapToObj(count -> (char)count)
					 .collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(count -> count.getValue() > 1)
					 .map(count -> count.getKey())
					 .findFirst()
					 .orElseThrow();
			 System.out.println("firstRepeatedChar : " +firstRepeatedChar);
			 
			 Optional<Character> LastRepeatedChar = inputString11
					 .chars().mapToObj(count -> (char)count)
					 .collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(count -> count.getValue() > 1)
					 .reduce((first, second) -> second)
					 .map(count -> count.getKey());
					
			 System.out.println("LastRepeatedChar : " +LastRepeatedChar);
			 
			 Optional<Character> lastRepeatedChar2 = inputString11.chars()
			            .mapToObj(c -> (char) c) // Convert int stream to Character stream
			            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count occurrences
			            .entrySet().stream() // Create a stream of the entries
			            .filter(entry -> entry.getValue() > 1) // Filter repeated characters
			            .reduce((first, second) -> second) // Get the last one
			            .map(entry -> entry.getKey()); // Extract the character
			 
			 
			 Character firstNonRepeatedChar = inputString11.toLowerCase().replaceAll(" ", "")
					 .chars().mapToObj(count -> (char)count)
					 .collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(count -> count.getValue() == 1)
					 .map(count -> count.getKey())
					 .findFirst()
					 .orElseThrow();
			 System.out.println("firstNonRepeatedChar : "+firstNonRepeatedChar);
			 
			 Character lastNonRepeatedChar = inputString11.toLowerCase().replaceAll(" ", "")
					 .chars().mapToObj(count -> (char)count)
					 .collect(Collectors.groupingBy(Function.identity(),() -> new LinkedHashMap<>(),Collectors.counting()))
					 .entrySet().stream()
					 .filter(count -> count.getValue() == 1)
					 .map(count -> count.getKey())
					 .reduce((c1,c2) -> c2)
					 .get();
			 System.out.println("lastNonRepeatedChar : "+lastNonRepeatedChar);
			 
			 
			 Optional<Character> lastNonRepeatedChar2 = inputString11.chars()
			            .mapToObj(c -> (char) c) // Convert int stream to Character stream
			            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Count occurrences
			            .entrySet().stream() // Create a stream of the entries
			            .filter(entry -> entry.getValue() == 1) // Filter non-repeating characters
			            .reduce((first, second) -> second) // Get the last one
			            .map(entry -> entry.getKey());
			 
			 System.out.println("lastNonRepeatedChar2 : "+lastNonRepeatedChar2);
			 
			 
			
			 
			 System.out.println("LastRepeatedChar : " +lastRepeatedChar2);
					
					 
			
			
			
			
					
	        
		 
		 
		 
		 
	}

}
