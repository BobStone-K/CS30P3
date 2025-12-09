package Skillbuilders;

public class Puck extends Disk implements Comparable {
	double MIN_STD_WEIGHT = 5;
	double MAX_STD_WEIGHT = 5.5;
	double MIN_YTH_WEIGHT = 4;
	double MAX_YTH_WEIGHT = 4.5;
	
	private double weight;
	private boolean standard;
	
	public Puck(double w) {
		
		super(1.5, 3);
		weight = w;
		if(weight >= MIN_STD_WEIGHT && weight <= MAX_STD_WEIGHT)
		{
			standard = true;
			
			
		}
		else
		{
			standard = false;
			
		}
	
	}
	
	public String getDivision()
	{
		String div;
		
		if(standard)
			div = "Puck is standard";
		else
			div = "Puck is youth";
		
		return div;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public boolean equals(Object c)
	{
		Puck testObj = (Puck)c;
		
		if(testObj.getDivision() == getDivision())
		{
			return (true);
		}
		else
		{
			return (false);
		}
	}
	
	
	public int compareTo(Object p)
	{
		Puck testPuck = (Puck)p;
		
		if(testPuck.getWeight() > weight)
		{
			return(-1);
		}
		else if(testPuck.getWeight() == weight)
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
	
	
	public String toString()
	{
		String puckString;
		
		puckString = "The puck has weight "
				+ getWeight() 
				+ " and division "
				+ getDivision() + ".";
		
		return puckString;
	}

}
