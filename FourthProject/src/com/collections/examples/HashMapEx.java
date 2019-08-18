package com.collections.examples;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> em = new HashMap<Integer, String>(); 
		
		em.put(199, "Sartaj");
		em.put(155, "Bunty");
		em.put(10, "Gaitonde");
		em.put(1, "Aham Brhamasmi");
		
		System.out.println( "Size is" + em.size());
		//System.out.println(em.get(102));
		
		for(Integer i: em.keySet())
		{
			System.out.println(em.get(i));
		}
	}

}
