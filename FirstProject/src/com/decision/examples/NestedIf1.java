package com.decision.examples;

public class NestedIf1 {

	public static void main(String[] args) {
		 
		int  marksobtained;
		marksobtained = 40;
		
		if(marksobtained > 70) {
			System.out.println("First class");
			
			if(marksobtained>60 && marksobtained == 60) {
				System.out.println("Second class");
				
				if(marksobtained> 50) {
				System.out.println("Third class");
			}
		}
	}else {
				System.out.println("Failed");
			}
			
		
}
}