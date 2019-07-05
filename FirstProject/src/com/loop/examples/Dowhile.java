package com.loop.examples;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =1,times =0;
		String name;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter name");
		name = in.nextLine();
		System.out.println("Enter the no.of times to be repeated");
		times = in.nextInt();
		do {
			System.out.println(name);
			n++;
		}while(n<=times); {

	}

}
}

