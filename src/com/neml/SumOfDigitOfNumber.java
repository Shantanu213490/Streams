package com.neml;

import java.util.Arrays;
import java.util.List;

public class SumOfDigitOfNumber {

	public static void main(String[] args) {

		int i = 15623;

		String s = i + "";
		String[] s1 = s.split("");

		int sum1 = s.chars().map(c -> c - '0').sum(); // 1.
		System.out.println(sum1);

		List<String> ls = Arrays.asList(s1);

		int sum2 = ls.stream().mapToInt(Integer::parseInt).sum(); // 2.
		System.out.println(sum2);

	}

}
