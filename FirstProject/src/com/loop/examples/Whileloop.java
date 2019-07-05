package com.loop.examples;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =1,times=0;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name");
		name = in.nextLine();
		System.out.println("Enter the number of times to be repeated");
		times = in.nextInt();
		while(n<=times) {
			
			System.out.println(name);
			n++;
		}
		

	}

}
