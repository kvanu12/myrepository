package com.employee.examples;

public class EmployeeBenefits extends Employee {
	
	float Ta ;
	float Da ;
	float grosssalary ;
	float Pf ;
	float Hra ;

	
	
	//Default constructor
	public EmployeeBenefits() {
		
		
		this.Ta =0;
		this.Da =0;
		this.grosssalary =0;
		this.Hra =0 ;
		this.Pf  =0  ;
		
	}
	public void EmployeBenefit(float Ta, float Da, float grosssalary, float Pf, float Hra) {
		
		this.Ta = Ta;
		this.Da = Da;
		this.grosssalary =  grosssalary;
		this.Pf = Pf;
		this.Hra = Hra;
		
		
		
	}
	 public void calculateTa(int taPercent) {
		 
		 System.out.println("Ta is :");
		
		System.out.println( Ta =  (empsalary) * taPercent/100);
		
	}
	
	 public void calculateDa(int dapercent) {
		 
		 System.out.println("Da is :");
		 System.out.println( Da= (empsalary) * dapercent/100);
		 
	 }
	 public void calculategrosssalary() {
		 System.out.println("Grosssalary is:");
		 System.out.println(grosssalary =  (((empsalary)+Ta+Da+Hra)-Pf));
	 }
	 
	 public void calculateHra(int hrapercent) {
		 System.out.println("Hra is :");
		 System.out.println( Hra = (empsalary) * hrapercent/100);
		 	 
	 }
	 public void calculatePf(int pfpercent) {
		 System.out.println("Pf is :");
		 System.out.println	(Pf = (empsalary) * pfpercent/100);
	 }
	public void display() {
		System.out.println("Emp name is :"+empname);
		System.out.println("emp salary is "+empsalary);
		System.out.println("Emp Gross salary is : "+ grosssalary);
		
		
	}

	 
}

