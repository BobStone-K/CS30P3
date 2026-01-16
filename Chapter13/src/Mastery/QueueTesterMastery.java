/*

Program: QueueTesterMastery.java          Last Date of this Revision: January 15, 2026

Purpose: An application that tests the queue data structure class

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 30
 

*/


package Mastery;

import Skillbuilders.Queue2;

public class QueueTesterMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue2 nightClubLine = new Queue2(5);
		
		System.out.println("Adding \"Lebron\", "
				+ "\"Gretta\", and \"Lamine\" to Nightclub line.");
		
		nightClubLine.enqueue("Lebron");
		nightClubLine.enqueue("Gretta");
		nightClubLine.enqueue("Lamine");
		
		System.out.println("Front of Nightclub line: "+ nightClubLine.front());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
		System.out.println("Remove an element from Nightclub line: "+ nightClubLine.dequeue());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
	
		System.out.println("Adding Tiger Woods");
		nightClubLine.enqueue("Tiger Woods");
		
		System.out.println("Front of Nightclub line: "+ nightClubLine.front());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
		
		System.out.println("Adding \"Justin\" and \"Dwayne\" ");
		nightClubLine.enqueue("Justin");
		nightClubLine.enqueue("Dwayne");
		System.out.println("Front of Nightclub line: "+ nightClubLine.front());
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
		
		
		System.out.println("Removing \"Lamine\", "
				+ "\"Tiger Woods\", \"Justin\", and \"Dwayne\" to Nightclub line.");
		
		nightClubLine.makeEmpty();
		System.out.println("Size of Nightclub line: "+ nightClubLine.size());
		
	}
	
	

}
/* Screen Dump

Adding "Lebron", "Gretta", and "Lamine" to Nightclub line.
Front of Nightclub line: Lebron
Size of Nightclub line: 3
Remove an element from Nightclub line: Lebron
Size of Nightclub line: 2
Adding Tiger Woods
Front of Nightclub line: Gretta
Size of Nightclub line: 3
Adding "Justin" and "Dwayne" 
Front of Nightclub line: Gretta
Size of Nightclub line: 5
Removing "Lamine", "Tiger Woods", "Justin", and "Dwayne" to Nightclub line.
Size of Nightclub line: 0

 
 */