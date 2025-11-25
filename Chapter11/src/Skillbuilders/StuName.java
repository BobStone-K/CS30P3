package Skillbuilders;

public class StuName {
private String firstName, lastName;
	
	//Constructor method
	
	public StuName(String fn, String ln)
	{
		firstName = fn;
		lastName = ln;
		
	}
	
	
	public String toString()
	{
		return(firstName+ " " + lastName);
	}
}
