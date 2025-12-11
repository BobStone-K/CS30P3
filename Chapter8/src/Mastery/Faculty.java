package Mastery;


//making this class a subclass of UEmployee
public class Faculty extends UEmployee {
	//declaring variable which will store faculty objects department name
	private String dName;
	// constructor method which creates Faculty object
	public Faculty(String eN, double s, String dN)
	{
		//Initialized variables inherited from super class
		super(eN, s);
		//Initializing variable specific to this subclass
		dName = dN;
	}

	//method to retrieve department name of Faculty object
	public String getDepartment()
	{
		return(dName);
	}
	

	
	public String toString() {
	        return super.toString() + ", Department: " + dName;
	 }
}
