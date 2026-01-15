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
