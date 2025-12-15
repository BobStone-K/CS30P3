package Mastery;

public abstract class UEmployee {
	//declaring employee name and salary variables
	String employeeName;
	double salary;
	
	//constructor method which initializes the variables declared up top 
	public UEmployee(String n, Double s) {
		employeeName = n;
		salary = s;
	}
	
	//method which retrieves the employees name
	public String getName()
	{
		return(employeeName);
	}


	//method which retrieves the employees salary
	public double getSalary()
	{
		return(salary);
	}

	//toString method which returns everything about employee object
	public String toString()
	{
		return("Employee name: " + employeeName + ", Salary: " + salary);
	}
}
