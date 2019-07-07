package com.employee.examples;

import java.util.Scanner;

public class Emp {

		


	public static void main(String[] args ) {
		// Program to input and display employee details
		
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no.of employees");
		length = input.nextInt();
		
		Employee e[]=new Employee[10];
		for(int counter =0; counter<=length;counter++) {
		
		
//		System.out.println("Enter employee no" );
	//	int empno = input.nextInt();
		
		System.out.println("Enter employee name " +counter);
	    input.nextLine();
		String empname = input.nextLine();
		
		System.out.println("Enter employee salary" + counter);
		int empsalary = input.nextInt();
		
		e[counter]= new Employee(counter+1, empname, empsalary);
				

		e[counter].calculateBonus();
		}
					System.out.println("Emp No"+"      "+ "Name" + "             "+ "Salary"+ "             "+ "Bonus");

		for(int i =0; i<=length;i++) {
					System.out.println(e[i].empno+"           "  +   String.format("%-6s",e[i].empname) + "           "+ e[i].empsalary+ "              "+  e[i].empbonus);
		}
			
		
		input.close();
		

	
				
		
	}
}


		

