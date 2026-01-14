package Mastery;

import Skillbuilders.LinkedList;

public class LinkedListTesterMastery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList neighbourhood = new LinkedList();
		
	neighbourhood.addAtFront("Youdis's House");
	neighbourhood.addAtEnd("Richard's Apartment");;
	neighbourhood.addAtFront("Rasheed's Apartment");
		
	System.out.println("Neighbourhood size: " + neighbourhood.size() + " buildings.");
	System.out.println(neighbourhood);
		
		
		
	neighbourhood.remove("Rasheed's Apartment");
	System.out.println("Removed Rasheed's Apartment");
	System.out.println("Neighbourhood size: " + neighbourhood.size() + " buildings.");
	System.out.println(neighbourhood);
		
		
		
		
	neighbourhood.addAtFront("Usman's House");
	neighbourhood.addAtEnd("Hamza's House");
	System.out.println("Added Usman's house at the front and Hamza's house at the end");
	System.out.println("Neighbourhood size: " + neighbourhood.size() + " buildings.");
	System.out.println(neighbourhood);
		
		
	neighbourhood.remove("Youdis's House");
	System.out.println("Removed Youdis's house");
	System.out.println("Neighbourhood size: " + neighbourhood.size() + " buildings.");
	System.out.println(neighbourhood);
		
		
	neighbourhood.makeEmpty();
	System.out.println("Removing all buildings");
	System.out.println("Neighbourhood size: " + neighbourhood.size() + " buildings.");
	}

}
