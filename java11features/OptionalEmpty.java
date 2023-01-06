package com.java11features;

import java.util.Optional;

public class OptionalEmpty {
	
	public static void main(String[] args) {
		Optional<String> o = Optional.of("asdf");
		//o=o.empty();						//jdk 8
		System.out.println(o.isEmpty()); 	// jdk 11
		System.out.println(o.isPresent());
		
	}
}
