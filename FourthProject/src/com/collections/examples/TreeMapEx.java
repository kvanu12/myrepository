package com.collections.examples;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> employees = new  TreeMap<Integer, String>();
		
		employees.put(12, "Arjun");
		employees.put(122, "Fraha");
		employees.put(10, "Malik");
		employees.put(1, "Chod");
		
		//System.out.println(employees.get(122));
		
		for(Integer i : employees.keySet())
		{
			System.out.println(employees.get(i));
		}
	}

}
