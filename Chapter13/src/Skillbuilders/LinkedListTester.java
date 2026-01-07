package Skillbuilders;

public class LinkedListTester {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.addAtFront("Youdis");
		list.addAtFront("Richard");
		list.addAtFront("Rasheed");
		list.addAtFront("Usman");
		
		
		list.addAtEnd("Crescent");
		list.addAtEnd("Blue");
		
		System.out.println(list);
		
		System.out.println("List size: " + list.size() + "Items.");
		
		list.makeEmpty();
		
		System.out.println("List size: " + list.size() + "Items.");
	}

}
