package com.decision.examples;

import java.util.Scanner;

public class ExampleNestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int laptop = 0;
		Scanner input = new Scanner(System.in);		
	 	
		System.out.println("Price of the laptop :");
	    laptop = input.nextInt();
	
		
		if(laptop == 60000) {
		System.out.println("Buy Dell Laptop");

		}
		else
			if(laptop>60000) {
				System.out.println("Buy Hp Laptop");
			}
			else
				if (laptop < 60000)
					System.out.println("Buy Sony Laptop");
    input.close();
	}
}	

	
