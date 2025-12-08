package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Assignment {

	private JFrame frame;
	private JTextField fileNameField;
	FileReader in;
	BufferedReader readFile;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment window = new Assignment();
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
	public Assignment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 
	private void initialize() {
	
	        
		frame = new JFrame();
		frame.setBounds(100, 100, 568, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fileNameField = new JTextField();
		fileNameField.setBounds(118, 11, 303, 39);
		frame.getContentPane().add(fileNameField);
		fileNameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter File Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 98, 39);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea disArea = new JTextArea();
		disArea.setForeground(new Color(255, 255, 255));
		disArea.setBackground(new Color(110, 110, 110));
		disArea.setBounds(10, 61, 532, 321);
		frame.getContentPane().add(disArea);
		
		JButton loadButton = new JButton("Load Instruction");
		loadButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		loadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "C:\\Users\\38262004\\git\\CS30P3\\Chapter11\\src\\Skillbuilders\\" + fileNameField.getText().trim();
				if(filePath.isEmpty()) {
					disArea.setText("Please enter your file name");
				}
				File dataFile = new File(filePath);
				if(!dataFile.exists()) {
					disArea.setText("Please enter a proper file path");
				}
				try {
					in = new FileReader(filePath);
					readFile = new BufferedReader(in);
					 StringBuilder output = new StringBuilder();

					 String line;
					 while((line = readFile.readLine()) != null) {
						 output.append(line +"\n");
					 }
				disArea.setText(output.toString());	 
				} catch(IOException ex) {
						 System.err.print("Error: " + ex.getMessage() + " while reading file");
					 }
			}
		});
		loadButton.setBounds(431, 11, 111, 39);
		frame.getContentPane().add(loadButton);
		
		
}
	
	}






