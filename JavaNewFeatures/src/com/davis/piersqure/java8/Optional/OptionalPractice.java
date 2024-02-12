package com.davis.piersqure.java8.Optional;

import java.util.Optional;

public class OptionalPractice {

	public static void main(String[] args) {
		String email = null;
		Optional<String> optString = Optional.ofNullable(email);
		
		if(optString.isPresent()) {
			System.out.println(email);
		} else {
			System.out.println("default@gmail.com");
		}

		
		String name = null;
		Optional<String> optName = Optional.ofNullable(name);
		
		String optionalName = optName.orElseThrow(()-> new RuntimeException("Name not found Exception."));
		System.out.println("optionalName :"+optionalName);
		
	}

}
