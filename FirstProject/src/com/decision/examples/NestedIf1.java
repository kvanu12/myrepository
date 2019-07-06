package com.decision.examples;

import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		 
		int  marksobtained =0;

		Scanner input = new Scanner(System.in);		
	 	
		System.out.println("Enter the marks obtained :");
		marksobtained = input.nextInt();
	
		
		if(marksobtained >= 60) {
			System.out.println("First class");
		}
		else
				if(marksobtained< 60 && marksobtained >= 50) {
					System.out.println("Second class");
				}
				else
					if(marksobtained< 50 && marksobtained >35) {
						System.out.println("Third class");
					}
		
					else {
						System.out.println("Failed");
					}
			
		input.close();
}
}