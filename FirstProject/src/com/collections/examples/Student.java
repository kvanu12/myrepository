package com.collections.examples;

public class Student {
	
		int rollno;
		String name;
		int marksInEnglish;
		int marksInSocial;
		int marksInPhy;
		int total;
		
		// Constructor
		// Only pass those parameters which you want to assign. Not the ones which you want to calculate
		/**
		 * @param rollno
		 * @param name
		 * @param marksInEnglish
		 * @param marksInSocial
		 * @param marksInPhy
		 */
		public Student(int rollno, String name, int marksInEnglish, int marksInSocial, int marksInPhy) {
			this.rollno = rollno;
			this.name = name;
			this.marksInEnglish = marksInEnglish;
			this.marksInSocial = marksInSocial;
			this.marksInPhy = marksInPhy;
			// This method is called here to calculate total from marks but it is not recommended in a constructor
			calculateTotal();
		}
		
		// Method to calculate total from Marks
		public void calculateTotal()
		{
			total = marksInEnglish + marksInSocial + marksInPhy;
			
		}
		
}
