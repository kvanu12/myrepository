package com.collections.examples;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> num = new TreeSet<String>();
		
		num.add("hello");
		num.add("HEyy");
		num.add("Hello");
		num.add("momos");
		System.out.println(num);
		num.remove("hello");
		System.out.println(num);
	}

}
