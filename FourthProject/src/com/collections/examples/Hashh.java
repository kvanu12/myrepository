package com.collections.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashh {

	public static void main(String[] args) {
		String [] things = {"Apples" , "marrie", "marrie", "bobb", "Hello", "bobb"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s", set);

	}

}
