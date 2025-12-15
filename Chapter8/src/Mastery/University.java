/*
Program: University.java          Last Date of this Revision: December 14, 2025

Purpose: Tests the UEmployee, Faculty, and Staff classes by creating
         their objects and testing their methods.

Author: Youdis Acharya  
School: CHHS
Course: Computer Programming 30 

*/
package Mastery;

public class University {

	public static void main(String[] args) {
		
		//creating faculty and staff objects by supplying correct information into parameters
		Faculty fac = new Faculty("BobStone", 85000, "Physics");
		Faculty fac2 = new Faculty("Richard", 95000, "Engineering");
		
		Staff stf = new Staff("Youdis", 950000, "Admission Officer");
		Staff stf2 = new Staff("Rasheed", 1350000, "Dean");

		//Outputting all the info about first faculty object to test all of its method
		System.out.println("Faculty Members: ");
		System.out.println("Employee Name: " + fac.getName() + ", Salary: $" + fac.getSalary() + ", Department: " + fac.getDepartment());
		//Printing toString method on the second faculty object
				System.out.println(fac2);
		System.out.println();
		//Outputting all the info about the staff object to test all of its method
		System.out.println("Staff Members: ");
		System.out.println("Employee Name: " + stf.getName() + ", Salary: $" + stf.getSalary() + ", Job Title: " + stf.getTitle());
		//Printing toString method on the second faculty object
		System.out.println(stf2);

	}

}

/* Screen Dump
Faculty Members: 
Employee Name: BobStone, Salary: $85000.0, Department: Physics
Employee name: Richard, Salary: 95000.0, Department: Engineering

Staff Members: 
Employee Name: Youdis, Salary: $950000.0, Job Title: Admission Officer
Employee name: Rasheed, Salary: 1350000.0, Job Title: Dean

*/
