package Skillbuilders;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating 2 boxes using rectangle class with first method and overloaded method
		Rectangle box = new Rectangle();
		Rectangle box2 = new Rectangle(5, 7);
		Rectangle box3 = new Rectangle(5,7);
		//set new length and width for first box
		box.setLength(8);
		box.setWidth(9);
		//outputs length, width, area, and perimeter for both boxes
		System.out.println("box length is " + box.getLength());
		System.out.println("box width is " + box.getWidth());
		System.out.println("box2 length is " + box2.getLength());
		System.out.println("box2 width is " + box2.getWidth());
		System.out.println("box area is " + box.area());
		System.out.println("box perimeter is " + box.perimeter());
		System.out.println("box2 area is " + box2.area());
		System.out.println("box2 perimeter is " + box2.perimeter());
		//outputs formula for area of an rectangle
		Rectangle.displayAreaFormula();
		//outputs the length and width of both boxes
		System.out.println(box);
		System.out.println(box2);
		//Testing equals method
		System.out.println("Does box 2 equal box 3: " + box2.equals(box3));
		//Testing compareTo method
		System.out.println("Compare box 1 to box 3: " + box.compareTo(box3)); // -1 (3 < 4)
		
		//Testing comparableArea method
		System.out.println("Compare box 2 to box 1: " + box2.compareTo(box));
	}
	

}
