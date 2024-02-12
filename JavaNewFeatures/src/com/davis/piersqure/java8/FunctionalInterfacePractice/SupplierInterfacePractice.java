package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.function.Supplier;

public class SupplierInterfacePractice {

	public static void main(String[] args) {
		Supplier<Double> getRandom = ()->Math.random();
		
		System.out.println(getRandom.get());

	}

}
