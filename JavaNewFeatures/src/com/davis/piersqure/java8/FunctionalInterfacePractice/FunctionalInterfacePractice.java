package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.function.Function;

public class FunctionalInterfacePractice {

	public static void main(String[] args) {
		
		Function<Integer, Integer> getSqure = i -> i*i;
		System.out.println(getSqure.apply(5));

	}

}
