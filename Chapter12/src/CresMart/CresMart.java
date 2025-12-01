package CresMart;
import java.text.*;
public class CresMart {

	
	public static void payEmployee(Employee emp, double payArg) {
			
			NumberFormat money = NumberFormat.getCurrencyInstance();
			double pay;
			
			System.out.println(emp);
			
			pay = emp.pay(payArg);
			
			System.out.println(money.format(pay));
		}
	
	
	public static void main(String[] args) {
		Manager emp1 = new Manager("Ricardo", "Hamza", 150000);
		
		Associate emp2 = new Associate("Richie", "Uzman", 13.5);
		
		String action;
		int empNum;
		double payArg;
		
	}
}
