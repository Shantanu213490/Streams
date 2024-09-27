package com.neml;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] nums = { 10,15,8,49,25,98,98,32,15};
		boolean result = containsDuplicate(nums);
		System.out.println(result);
		
	}

	public static boolean containsDuplicate(int[] nums) {

		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>(list);
		if (set.size() == list.size()) {
			return false;
		}
		return true;
	}

}
