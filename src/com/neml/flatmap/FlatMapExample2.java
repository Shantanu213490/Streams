package com.neml.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

	public static void main(String[] args) {
		
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
		List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
		
		List<List<String>> list1 = new ArrayList<List<String>>();
		list1.add(productlist1);
		list1.add(productlist2);
		list1.add(productlist3);
		list1.add(productlist4);

		List<List<List<String>>> listOfls = new ArrayList<List<List<String>>>();
		listOfls.add(list1);
		
		List<String> listOfls1 = listOfls.stream().flatMap(i -> i.stream().flatMap(m -> m.stream())).distinct().sorted()
				.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(listOfls1);
		

	}

}
