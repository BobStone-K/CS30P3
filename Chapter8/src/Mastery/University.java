package Mastery;

public class University {

	public static void main(String[] args) {
		
		
		Faculty fac = new Faculty("BobStone", 85000, "Physics");
		Staff stf = new Staff("Youdis", 950000, "Admission Officer");

		System.out.println("Faculty" + "\nName: " + fac.getName() + " Salary: $" + fac.getSalary() + " Department: " + fac.getDepartment());
		
		System.out.println();

		System.out.println("Staff" + " Name: " + stf.getName() + " Salary: $" + stf.getSalary() + " Job Title: " + stf.getTitle());

	}

}
