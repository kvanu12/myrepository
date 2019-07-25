package com.employee.examples;

import java.util.Scanner;

public class Emp1 {

	



	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of employee" );
		String empname = input.nextLine();
		System.out.println("Enter the employee salary");
		int empsalary = input.nextInt();
		EmployeeBenefits  e = new EmployeeBenefits( );
		e.empname = empname;
		e.empsalary = empsalary;
		int taPercent = 0;
		System.out.println("Enter the percentage for TA:");
		taPercent = input.nextInt();
		e.calculateTa(taPercent);
		int dapercent = 0;
		System.out.println("Enter percentage for Da :");
		dapercent = input.nextInt();
		e.calculateDa(dapercent);
		int hrapercent = 0;
		System.out.println("Enter the percentage for Hra :");
		hrapercent = input.nextInt();
		e.calculateHra(hrapercent);
		int pfpercent = 0;
		System.out.println("Enter the percentage for Pf :");
		pfpercent = input.nextInt();
		e.calculatePf(pfpercent);
		e.calculategrosssalary();
		e.display();
		input.close();
		 
	}
}

