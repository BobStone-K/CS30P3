package Skillbuilders;

public class Rectangle {
	private double length, width;
	//creating two constructor method one overloaded with parameters other without
	public Rectangle(){
		length = 1;
		width = 1;
	}
	//has to enter length and width and parameters
	public Rectangle(double l, double w){
		length = l;
		width = w;
	}
	//returns length of rectangle
	public double getLength() {
		return(length);
	}
	//returns width of rectangle
	public double getWidth() {
		return(width);
	}
	//setting new length for rectangle by entering a parameter for new length
	public void setLength(double l) {
		length = l;
	}
	//setting new width for rectangle by entering a parameter for new length
	public void setWidth(double w) {
		width = w;
	}
	//returns area of circle with current length and width
	public double area() {
		return(length * width);
	}
	//returns perimeter of rectangle with current length and width
	public double perimeter() {
		return(2 * (length + width));
	}
	public static void displayAreaFormula(){
		System.out.println("The formula for a rectangle is a = L * W");
	}
	//checking if length and width of rectangle is equal to another rectangle of the same class

	
	
	public boolean equals(Object r)
	{
		Rectangle testRec = (Rectangle)r;
	      if (r instanceof Rectangle) {
	            Rectangle other = (Rectangle)r;
	            return this.length == testRec.length && this.width == testRec.width;
	        }
	        return false;
	}
	
	//method to output current length and width of rectangle
	public String toString() {
		String rectangleString = "Rectangle has length of " + length + " and width is" + width;
		return(rectangleString);
	}
}
