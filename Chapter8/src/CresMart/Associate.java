package CresMart;

public class Associate extends Employee {

		private double hourlyPayRate;
		
		
		public Associate(String fn, String ln, double s) {
			
			super(fn, ln);
			hourlyPayRate = s;
			
		}
		
		public double pay (double hours)
		{
			double payEarned;
			
			if(hours > 40) {
				payEarned = (hourlyPayRate * 40) + (hourlyPayRate* 1.5) * (hours - 40);
		
			}else {
				payEarned = hourlyPayRate * hours;
			}
			
			return payEarned;
		}
		
		public String toString() {
			
			return (super.toString() + ", Associate " + "Salary: " + hourlyPayRate );
		}
}
