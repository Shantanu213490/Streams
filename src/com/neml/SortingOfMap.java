package com.neml;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfMap {

	public static void main(String[] args) {

		List<String> ls1 = Arrays.asList("accreditationDate", "adddistrict", "asCity", "asPincode", "asState",
				"caAddress", "caAlternateTel", "caCity", "caContrPersonName", "caDesignation", "caDistrict",
				"caEmailId", "caFax", "caMobileNo", "caPincode", "caState", "caTel", "districtCode", "doFax",
				"dodistrictCode", "dostate", "geoLocation", "latitude", "locationCode", "longitude", "pincode",
				"roAddress", "roAlternateTel", "roTelex", "stateCode", "tanNo", "userId", "whCapacity", "whCode",
				"whIsUMPInt", "whName", "wspCode");

		List<String> sortedLs = ls1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedLs);

	}

}
