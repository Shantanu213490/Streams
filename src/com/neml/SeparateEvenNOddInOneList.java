package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeparateEvenNOddInOneList {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(33,11,2,3,4,5,6,7,18,19,88,54,43,65,22,67,89,07,33,11);
		
		Map<String, List<Integer>> evenOdd = list.stream().collect(Collectors.groupingBy(i->i%2 ==0?"Even":"Odd",Collectors.toList()));
		
		System.out.println(evenOdd);
		
		Map<Boolean, List<Integer>> evenOdd1 = list.stream().collect(Collectors.partitioningBy(i -> i%2 == 0));
		System.out.println(evenOdd1);
		
//		 Collections.sort(list,Collections.reverseOrder());
		 
		 System.out.println(list.stream().distinct().collect(Collectors.toList()));
		 
//		 Set<Integer> set = new HashSet<>();
		
		 Map<Integer, Long> nonrep = list.stream()
	                .collect(Collectors.groupingBy(Function.identity(), 
	                        () -> new LinkedHashMap<>(), 
	                        Collectors.counting()));

	        // Step 2: Finding the first non-repetitive element
	        Optional<Entry<Integer, Long>> nonRep = nonrep.entrySet().stream()
	                .filter(entry -> entry.getValue() == 1)
	                .findFirst();

				 
		 System.out.println(nonRep);
		 
		 String str = "asdfsadfrasdfa";
		 
		 Character ch  =str.chars().mapToObj(i -> (char)i)
		 	.collect(Collectors.groupingBy(Function.identity(), ()-> new LinkedHashMap<>(), Collectors.counting()))
		 	.entrySet()
		 	.stream()
		 	.filter(entry -> entry.getValue() == 1)
            .findFirst().get().getKey();
		
		
		System.out.print(ch);
		
		 int[] a = new int[]{2,3,4,5,3,2,88,65,5,6,7,18,19,88,54,43,65,22};
		 
		 List<Integer> disList = Arrays.stream(a).boxed().distinct().collect(Collectors.toList());
		 System.out.println("Distinct List of Arrays : "+disList);
		 
		 String inputString = "Java Concept Of The Day java DAy Java";
		 
			Map<Character, Long> frequencyOfChar = inputString.replaceAll(" ", "").toLowerCase().chars().mapToObj(i -> (char) i)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
			System.out.println("Frequency of Each Character : "+frequencyOfChar);
			
			List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
			
			List<Double> listOfDecimal = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			
			System.out.println("listOFDecimal in Descen : "+listOfDecimal);
			
			  List<String> listOfStrings = Arrays.asList("Face", "Twitte", "YouTubefgjfj", "WhatsApphfghh", "LinkedInvdgsghdhhhh");
			  
			  String prefixNSuffix = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
			  System.out.println(prefixNSuffix);
			  
			  List<Integer> list3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
			  
			  List<Integer> maxThree = list3.stream().sorted().limit(3).collect(Collectors.toList());
			  System.out.println("Three max number :" +maxThree);
			  
			  int max = list3.stream().max(Comparator.naturalOrder()).get();
			  System.out.println("Max Number is "+max);
			  
			  int min = list3.stream().max(Comparator.reverseOrder()).get();
			  System.out.println("Min Number is "+min);
			  
			  Integer maxSort = list3.stream().sorted(Comparator.reverseOrder()).findFirst().get();
			  System.out.println(maxSort);
			  
			  int[] b = new int[] {4, 2, 7, 1};
		      int[] c = new int[] {8, 3, 9, 5};
		      
		      int[] d = IntStream.concat(Arrays.stream(b), Arrays.stream(c)).sorted().distinct().toArray();
		      
		      for(int i:d) {
		      System.out.print(i+ " ");
		      }
		      
		      List<Integer> arrList = IntStream.concat(Arrays.stream(b), Arrays.stream(c))
		    		  .boxed()
		    		  .sorted()
		    		  .distinct().collect(Collectors.toList());
		      
		      System.out.println(arrList);
		      
		      String s1 = "RaceCar";
		      String s2 = "CarRace";

		      List<String> st1 = Stream.of(s1.toLowerCase().split("")).sorted().collect(Collectors.toList());
		      List<String> st2 = Stream.of(s2.toLowerCase().split("")).sorted().collect(Collectors.toList());
		    
		      System.out.println("st1" +st1);
		      if(st1.equals(st2)) {
		    	  System.out.println("s1 and s2 are anagrams");
		      }else {
		    	  System.out.println("s1 and s2 are not anagrams");
		      }

		      List<Character> lsOfChar = s1.toLowerCase().chars().mapToObj(i -> (char)i).sorted().distinct().collect(Collectors.toList());
		      
		      List<Character> lsOfChar1 = s2.toLowerCase().chars().mapToObj(i -> (char)i).sorted().distinct().collect(Collectors.toList());
		      
		      if(lsOfChar.equals(lsOfChar1)){
		    	  System.out.println("lsOfChar and lsOfChar1 are anagrams");
		      }else {
		    	  System.out.println("lsOfChar and lsOfChar1 are not anagrams");
		      }
		      
		      int i = 15623;
		      Integer sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		      System.out.println("Sum : "+sum);
		      
		      Integer sum1 = Stream.of(String.valueOf(i).split("")).mapToInt(Integer :: parseInt).sum();
		    		  
		      String s = "FsgsgsgxsfhdshsdheaT22453N";
		      List<String> charOfString = Stream.of(s.split("")).collect(Collectors.toList());
		      System.out.println(charOfString);
		      
		      List<String> listOfString = Arrays.asList("Java", "Python", "C#","HTMD", "HTML", "Kotlin", "C++", "COBOL", "C");
		      
		      List<String> sortOfString = listOfString.stream().sorted(Comparator.comparing(String :: length)).collect(Collectors.toList());
		      System.out.println(sortOfString);
		      
		      
		      int[] av = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		     
		      int sumOfArr = Arrays.stream(av).sum();
		      System.out.println(sumOfArr);
		      
		      Double avgOfArr = Arrays.stream(av).boxed().collect(Collectors.averagingInt(x -> x));
		      System.out.println(avgOfArr);
		      
		      List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		      List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
		      
		      List<Integer> list5 = list1.stream().filter(y -> list2.contains(y)).collect(Collectors.toList());
		      System.out.println("List of common elements in two list are "+list5);
		      
		      String str0 = "Javafbddgsfgnfgjf";
		      
		      String revStr = Stream.of(str0).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining());
		      System.out.println("Reverse String : "+revStr);
		      
		      Integer sumOf10NaturalNum = IntStream.range(2, 10).sum();
		      System.out.println(sumOf10NaturalNum);
		      
		      char[] chArr = {'a','b','c','d','e'};
		      
		      String com = Stream.of(chArr).map(t -> new StringBuffer().append(t)).collect(Collectors.joining());
		      System.out.println(com);
		      
		      
		      
		      
		      
		      
}

}
