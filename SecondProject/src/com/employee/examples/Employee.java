package com.employee.examples;

public class Employee {

	int empno = 0;
	String empname ;
    int empsalary = 0;
	int empbonus;
		
// Parameterized Constructor
	public Employee(int empno, String empname, int empsalary) {
		
		this.empno = empno;
		this.empname = empname;
		this.empsalary=empsalary;
//		calculateBonus();
			
	
	}


// Default constructor

public Employee() {
	this.empno = 0;
	this.empname = " ";
	this.empsalary=0;
	this.empbonus = 0;
		
	
}


			
public void calculateBonus() {

	if(empsalary >50000) {
		empbonus = 5000;
		
	}else 
		empbonus =10000;


}


}







	
	






