package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramOfStrings {

	public static void main(String[] args) {
		
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        String[] c1 = s1.split("");
        String[] c2 = s2.split("");
        
        List<String> ls1 = Arrays.stream(c1).map(String :: toLowerCase).sorted().distinct().collect(Collectors.toList());
        List<String> ls2 = Arrays.stream(c2).map(String :: toLowerCase).sorted().distinct().collect(Collectors.toList());
        
        System.out.println(ls1);
        System.out.println(ls2);
        if(ls1.equals(ls2)) {
        	System.out.println(s1+ " & " +s2+ " are anagrams of each other");
        }else {
        	System.out.println(s1+ " & " +s2+ " are not anagrams of each other");
        }

	}

}
