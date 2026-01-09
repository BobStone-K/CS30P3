package Skillbuilders;

public class Stack2Tester {

	public static void main(String[] args) {
		
		Stack2 s1 = new Stack2(3);
		s1.push("Red");
		s1.push("Green");
		s1.push("Yellow");
		System.out.println("Top of s1: "+ s1.top());
		System.out.println("s1 size: " + s1.size());
		s1.pop();
		System.out.println("Top of s1: "+ s1.top());
		System.out.println("s1 size: " + s1.size());

	}

}
