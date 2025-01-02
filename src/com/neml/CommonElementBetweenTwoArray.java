package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementBetweenTwoArray {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		List<Integer> list3 = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(list3);

		List<Integer> list4 = list1.stream().filter(i -> list2.contains(i)).collect(Collectors.toList());

		System.out.println(list4);

	}

}
