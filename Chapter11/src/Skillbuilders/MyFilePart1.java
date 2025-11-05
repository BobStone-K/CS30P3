package Skillbuilders;

import java.io.File;
import java.util.Scanner;

public class MyFilePart1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fileName;
		
		//Obtain file names;;
		System.out.println("Enter file name: ");
		fileName = input.nextLine();
		
		//Determine is file exists
		File textFile = new File(fileName);
		if(textFile.exists()) {
			System.out.println("File does exist");
		} else {
			System.out.println("File does not exist");
		}
				
	}

}
