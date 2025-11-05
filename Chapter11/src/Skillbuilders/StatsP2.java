package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class StatsP2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatsP2 window = new StatsP2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StatsP2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		File dataFile;
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		Scanner input = new Scanner(System.in);
		
		String stuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScore = 0;
		int numScores = 0;
		
		
		String stuScore, studName;
		System.out.println("Enter File name: ");
		String fileName = input.nextLine();
		System.out.println("How many Students do you want: ");
		int numStudents = input.nextInt();
		
		
		
		try {
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for( int i = 0; i < numStudents; i++) {
				System.out.println("Enter student name: ");
				studName = input.nextLine();
				System.out.println("Enter test score: ");
				stuScore = input.nextLine();
				writeFile.write(studName);
				writeFile.newLine();
				writeFile.write(stuScore);
			}
			writeFile.close();
			out.close();
			
		} catch(IOException e) {
			System.out.println("Data written to file");
			System.err.println("IOException: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 622, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 606, 432);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel tLabel = new JLabel("Student Test Score Analysis");
		tLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		tLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tLabel.setBounds(190, 29, 200, 44);
		panel.add(tLabel);
		
		JTextArea resultArea = new JTextArea();
		resultArea.setBounds(103, 96, 390, 240);
		panel.add(resultArea);
		
		

		
		StringBuilder output = new StringBuilder();
		NumberFormat percent = NumberFormat.getPercentInstance();
		try
		{
			in = new FileReader(fileName);
			readFile = new BufferedReader(in);
			
			output.append("STUDENT_SCORES: \n");
			output.append("--------------------");
			
			while((stuName = readFile.readLine()) != null) {
				score = readFile.readLine();
				numScores += 1;
				scoreValue = Double.parseDouble(score);
				
				output.append(stuName + "" + percent.format(scoreValue));
				
				totalScore += scoreValue;
				
				if(scoreValue < lowScore) 
					lowScore = scoreValue;
				
				
				if(scoreValue > highScore) //dont need brakets if its only one line beneath if statement
					highScore = scoreValue;
				
			}
			avgScore = totalScore/ numScores;
			output.append("\nSTATISTICS:\n");
			output.append("--------------------");
			
			output.append("Low score = "+ percent.format(lowScore/100) + "\n");
			output.append("High score = "+ percent.format(highScore/100) + "\n");
			output.append("Average score = "+ percent.format(avgScore/100) + "\n");
			output.append("Total Students = "+ numScores + "\n");
			
			resultArea.setText(output.toString());
			
			readFile.close();
			in.close();
		}
		catch (FileNotFoundException ex){
			System.out.println("File could not be found.");
			System.err.println("FileNotFoundException: "+ ex.getMessage());
			
		}	catch (IOException ex){   
			System.out.println("Problem writing to file.");   
			System.err.println("IOException: " + ex.getMessage());  
		}
		
	
	}
}
