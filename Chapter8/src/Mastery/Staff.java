package Mastery;

public class Staff extends UEmployee {

	private String jobTitle;

	
	public Staff(String eN, double s, String jT)
	{
		super(eN, s);
		jobTitle = jT;
	}

	
	public String getTitle()
	{
		return(jobTitle);
	}
	
	public String toString() {
        return super.toString() + ", Job Title: " + jobTitle;
 }
}
