package com.neml;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FrequencyOfNumber {

	static class NumberCount {
        int number;
        long count;

        NumberCount(int number, long count) {
            this.number = number;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 2, 5, 2, 6, 2);

     /*   NumberCount numberWithMaxCount = numbers.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry -> new NumberCount(entry.getKey(), entry.getValue()))
                .max((nc1, nc2) -> Long.compare(nc1.count, nc2.count))
                .orElse(new NumberCount(0, 0));
        */

      Entry<Integer, Long> entry = numbers.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Entry::getValue,Comparator.reverseOrder()))
                .limit(1).findAny().get();
                

        System.out.println("Number with Max Count: " + entry.getKey());
        System.out.println("Max Count: " + entry.getValue());
    }
}
