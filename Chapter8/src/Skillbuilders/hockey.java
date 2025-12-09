package Skillbuilders;

public class hockey {

	public static void main(String[] args) {
		Puck p1 = new Puck(1.0);
		Puck p2 = new Puck(5.2);
		Puck p3 = new Puck(4.4);
		Puck p4 = new Puck(5.2);
		
		
		//tests
		System.out.println("Puck 1:\n" + p1.toString() + "\n");
		System.out.println("Puck 2:\n" + p2.toString() + "\n");
		System.out.println("Puck 3:\n" + p3.toString() + "\n");
		
		//checks if they are equal
		if (p2.equals(p4))
		{
			System.out.println("Puck 2 is equal to Puck 4\n");
		}
		else
		{
			System.out.println("Puck 2 is not equal to Puck 4\n");
		}
		
		//puck part 2
		if (p1.compareTo(p2) == 0) {
			 System.out.println("Objects are equal.");
			 } else if (p1.compareTo(p2) < 0) {
			 System.out.println("puck 1 is smaller than puck 2.");
			 } else {
			 System.out.println("puck 1 is larger than puck 2.");
			 }

	}

}
