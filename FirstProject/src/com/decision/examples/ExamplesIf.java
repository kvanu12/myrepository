package com.decision.examples;

import java.util.Scanner;

public class ExamplesIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int fossil = 0;
	Scanner input = new Scanner(System.in);		
 	
	System.out.println("Enter Price of the watch: ");
    fossil = input.nextInt();

	
	if( fossil<10000) {
		System.out.println("Buy watch fossil");
		
	}else {
		System.out.println("Buy Swatch ");
	}
    input.close();
	}

}
