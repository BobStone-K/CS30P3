/*

Program: StackTesterMastery.java          Last Date of this Revision: January 15, 2026

Purpose: An application that tests the stack data structure class

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 30
 

*/




package Mastery;

import Skillbuilders.Stack2;

public class StackTesterMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack2 gameTower = new Stack2(4);
		System.out.println("Adding Call of Duty, The Division, and Spiderman");
		gameTower.push("Call of Duty");
		gameTower.push("The Division");
		gameTower.push("Spiderman");
		System.out.println("Top of game tower: "+ gameTower.top());
		System.out.println("game tower size: " + gameTower.size());
		gameTower.pop();
		System.out.println("Top of game tower: "+ gameTower.top());
		System.out.println("game tower size: " + gameTower.size());
		System.out.println("Adding Dragonball");
		gameTower.push("Dragonball");
		System.out.println("Top of game tower: "+ gameTower.top());
		System.out.println("game tower size: " + gameTower.size());
		System.out.println("Emptying Stack");
		gameTower.makeEmpty();
		System.out.println("game tower size: " + gameTower.size());
	}

}

/* Screen Dump

Adding Call of Duty, The Division, and Spiderman
Top of game tower: Spiderman
game tower size: 3
Top of game tower: The Division
game tower size: 2
Adding Dragonball
Top of game tower: Dragonball
game tower size: 3
Emptying Stack
game tower size: 0

 
 */