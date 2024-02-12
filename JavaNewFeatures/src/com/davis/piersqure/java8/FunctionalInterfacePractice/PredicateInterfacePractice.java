package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.function.Predicate;

public class PredicateInterfacePractice {

	public static void main(String[] args) {

		String name = "Davis";

		Predicate<String> nameLength = i -> i.length() > 3;
		System.out.println(nameLength.test(name));

	}

}
