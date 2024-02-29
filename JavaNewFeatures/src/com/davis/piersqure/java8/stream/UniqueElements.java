package com.davis.piersqure.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueElements {

	public static void main(String[] args) {
		List<Integer> li1 = Arrays.asList(2, 598, 6, 3, 2, 7, 3, 89, 34);
		List<Integer> li2 = Arrays.asList(2, 51, 6, 23, 2, 7, 33, 89, 31);

		// 1. Find the unique elements of li1 and li2 into a new list
		List<Integer> list = Stream.concat(li1.stream(), li2.stream()).distinct().collect(Collectors.toList());

		System.out.println(list);

		// 2. Find the unique elements of both the array and print
		Stream.concat(li1.stream(), li2.stream()).distinct().forEach(element -> System.out.print(element + " "));

		System.out.println("\n");
		// 3.common elements
		li1.stream().filter(li2::contains).forEach(element -> System.out.print(element + " "));

		System.out.println("\n");
		// 4.Determine the maximum value from li1 and li2
		System.out.println(Stream.concat(li1.stream(), li2.stream()).max((a, b) -> a.compareTo(b)).get());

		System.out.println("\n");
		// 5. Merge li1 and li2, remove duplicates, and sort the resulting list.
		Stream.concat(li1.stream(), li2.stream()).distinct().sorted().forEach(value -> System.out.print(value + " "));

		System.out.println("\n");
		// 6. Merge li1 and li2, remove duplicates, and sort the resulting list in
		// reverse order.
		Stream.concat(li1.stream(), li2.stream()).distinct().sorted((a, b) -> b.compareTo(a))
				.forEach(value -> System.out.print(value + " "));

		// Complex program
		// 7. Combine li1 and li2, filter out the even numbers, and then find the sum of
		// the squared values.
		System.out.println("\n");
		System.out.println(Stream.concat(li1.stream(), li2.stream()).filter(i -> i % 2 == 0).map(i -> i * i)
				.mapToInt(Integer::intValue).sum());

		// 8. Merge li1 and li2, and then create a map where keys are the elements and
		// values
		// are the frequency of occurrence of each element.
		System.out.println("\n");
		Map<Object, Long> map = Stream.concat(li1.stream(), li2.stream())
				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map);

		// applying same only in li1
		System.out.println("\n");
		Map<Object, Long> map1 = li1.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println(map1);

	}

}
