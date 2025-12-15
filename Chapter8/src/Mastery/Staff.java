package Mastery;

//making this a subclass of UEmployee
public class Staff extends UEmployee {
	//declaring variable which will store job title name
	private String jobTitle;

	//constructor method which asks for what super class needs plus job title then creates object
	public Staff(String eN, double s, String jT)
	{
		super(eN, s);
		jobTitle = jT;
	}

	//method which returns variable which stores objects job name
	public String getTitle()
	{
		return(jobTitle);
	}
	// to string function which outputs what superclass toString method does plus job title
	public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
 }
}
