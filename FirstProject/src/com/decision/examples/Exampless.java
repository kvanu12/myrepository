package com.decision.examples;

import java.util.Scanner;

public class Exampless {

	public static void main(String[] args) {
		
		
		int car,insurance;
			
		Scanner input = new Scanner(System.in);		
		 	
			System.out.println("Price of the car");
		car = input.nextInt();
		
		if(car<= 500000) {
			
			insurance = 20000;
			
		}else {
			
			insurance =35000;
		}
		
		System.out.println("Insurance of car is "+insurance);
		input.close();
	
		
	}

		
}
			