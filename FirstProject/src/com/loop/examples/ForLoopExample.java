package com.loop.examples;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,times =0 ;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		name = in.nextLine();
		System.out.println("enter no.of times to be repeated");
		times = in.nextInt();
		
		for( n=1;n<=times;n++) {
				
			
			System.out.println(name);
			
		}

	}

}
