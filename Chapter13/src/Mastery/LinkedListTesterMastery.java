/*

Program: LinkedList.java          Last Date of this Revision: January 15, 2026

Purpose: An application that tests the linked list data structure class

Author: Youdis Acharya, 
School: CHHS
Course: Computer Science 30
 

*/

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
/* Screen Dump

Neighbourhood size: 3 buildings.
Rasheed's Apartment
Youdis's House
Richard's Apartment

Removed Rasheed's Apartment
Neighbourhood size: 2 buildings.
Youdis's House
Richard's Apartment

Added Usman's house at the front and Hamza's house at the end
Neighbourhood size: 4 buildings.
Usman's House
Youdis's House
Richard's Apartment
Hamza's House

Removed Youdis's house
Neighbourhood size: 3 buildings.
Usman's House
Richard's Apartment
Hamza's House

Removing all buildings
Neighbourhood size: 0 buildings.

 
 */