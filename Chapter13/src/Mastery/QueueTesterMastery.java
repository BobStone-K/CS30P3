package Mastery;

import Skillbuilders.Queue2;

public class QueueTesterMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 nightClubLine = new Queue2(3);
		
		System.out.println("Adding \"Lebron\", "
				+ "\"Gretta\", and \"Lamine\" to Nightclub line.");
		
		nightClubLine.enqueue("Lebron");
		nightClubLine.enqueue("Gretta");
		nightClubLine.enqueue("Lamine");
		
		System.out.println("Front of Nightclub line: "+ nightClubLine.front());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
		System.out.println("Remove an element from Nightclub line: "+ nightClubLine.dequeue());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
	}

}
