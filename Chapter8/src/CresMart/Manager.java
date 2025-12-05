package CresMart;

public class Manager extends Employee {

	private double yearlySalary;
	
	public Manager(String fn, String ln, double s) {
		
		super(fn, ln);
		yearlySalary = s;
		
	}
	
	public double pay (double weeks)
	{
		double payEarned;
		
		payEarned = (yearlySalary/52) * weeks;
		
		return payEarned;
	}
	
	public String toString() {
		
		return (super.toString() + ", Manger " + "Salary: " + yearlySalary );
	}
}
