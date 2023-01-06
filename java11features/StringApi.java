package com.java11features;

import java.util.List;
import java.util.stream.Collectors;

public class StringApi {

	public static void main(String[] args) {
		
		String a = "  hello \n"
					+"   welcome \n"
					+"bye";
		
		a.lines().forEach(System.out::println);
		List<String> res = a.lines().collect(Collectors.toList());
		System.out.println(res);
		System.out.println(a.stripLeading());
		System.out.println(a);
		System.out.println(a.trim());
		
		String b="welcome";
		System.out.println("-".repeat(10));

	}

}
