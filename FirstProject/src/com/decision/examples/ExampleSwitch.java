package com.decision.examples;

import java.util.Scanner;

public class ExampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int phone = 0;
		
		Scanner input = new Scanner(System.in);		
	 	
		System.out.println("Price of the phone : ");
	    phone = input.nextInt();
	
		
		switch(phone) {
			
		case 50000 :
			System.out.println("Phone is oneplus");
			break;
			
			
		case 60000:
			System.out.println("Phone is iphone");
			break;
			
		default:
			System.out.println("Phone is oppo");
		}
		input.close();
		
		

	}

}
