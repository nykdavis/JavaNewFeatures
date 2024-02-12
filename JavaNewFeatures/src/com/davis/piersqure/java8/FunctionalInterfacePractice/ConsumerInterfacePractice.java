package com.davis.piersqure.java8.FunctionalInterfacePractice;

import java.util.function.Consumer;

public class ConsumerInterfacePractice {

	public static void main(String[] args) {
		PeopleProfile people = new PeopleProfile();
	
		Consumer<PeopleProfile> setName = t-> t.setName("Hello Java 8");
		setName.accept(people);
		
		System.out.println(people.getName());
		

	}

}
