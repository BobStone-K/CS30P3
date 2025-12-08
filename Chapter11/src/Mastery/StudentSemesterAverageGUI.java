package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.text.DecimalFormat;
public class StudentSemesterAverageGUI extends JFrame{

	private JFrame frame;
	private JTextField studentNameField;
	private JTextField gradeLevelField;
	private JTextField semesterNumberField;
	private JTextField grade1Field;
	private JTextField grade2Field;
	private JTextField grade3Field;
	private JTextField grade4Field;
	//constant for which file to save to
	private static final String FILE_NAME = "StudentGrades.txt";
	private File dataFile = new File(FILE_NAME);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverageGUI window = new StudentSemesterAverageGUI();
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
	public StudentSemesterAverageGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//creating formatter that can be used by anything within the function
		DecimalFormat decimalFormatter = new DecimalFormat("0.#");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		

		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 527, 534);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea displayArea = new JTextArea();
		displayArea.setBounds(0, 290, 527, 194);
		panel.add(displayArea);
		
		JLabel studentNameLabel = new JLabel("Student Name:");
		studentNameLabel.setBounds(10, 11, 219, 24);
		panel.add(studentNameLabel);
		
		studentNameField = new JTextField();
		studentNameField.setBounds(239, 11, 278, 24);
		panel.add(studentNameField);
		studentNameField.setColumns(10);
		
		JLabel gradeLevelLabel = new JLabel("Grade Level:");
		gradeLevelLabel.setBounds(10, 46, 219, 24);
		panel.add(gradeLevelLabel);
		
		gradeLevelField = new JTextField();
		gradeLevelField.setColumns(10);
		gradeLevelField.setBounds(239, 46, 278, 24);
		panel.add(gradeLevelField);
		
		JLabel semesterNumberLabel = new JLabel("Semester Number:");
		semesterNumberLabel.setBounds(10, 81, 219, 24);
		panel.add(semesterNumberLabel);
		
		semesterNumberField = new JTextField();
		semesterNumberField.setColumns(10);
		semesterNumberField.setBounds(239, 81, 278, 24);
		panel.add(semesterNumberField);
		
		JLabel grade1Label = new JLabel("Grade 1:");
		grade1Label.setBounds(10, 116, 219, 24);
		panel.add(grade1Label);
		
		grade1Field = new JTextField();
		grade1Field.setColumns(10);
		grade1Field.setBounds(239, 116, 278, 24);
		panel.add(grade1Field);
		
		JLabel grade2Label = new JLabel("Grade 2: ");
		grade2Label.setBounds(10, 151, 219, 24);
		panel.add(grade2Label);
		
		grade2Field = new JTextField();
		grade2Field.setColumns(10);
		grade2Field.setBounds(239, 151, 278, 24);
		panel.add(grade2Field);
		
		JLabel grade3Label = new JLabel("Grade 3:");
		grade3Label.setBounds(10, 186, 219, 24);
		panel.add(grade3Label);
		
		grade3Field = new JTextField();
		grade3Field.setColumns(10);
		grade3Field.setBounds(239, 186, 278, 24);
		panel.add(grade3Field);
		
		JLabel grade4Label = new JLabel("Grade 4:");
		grade4Label.setBounds(10, 219, 219, 24);
		panel.add(grade4Label);
		
		grade4Field = new JTextField();
		grade4Field.setColumns(10);
		grade4Field.setBounds(239, 219, 278, 24);
		panel.add(grade4Field);
		
		JLabel average = new JLabel("Average:");
		average.setBounds(10, 255, 219, 24);
		panel.add(average);
		
		JButton saveFileBtn = new JButton("Save To File");
		saveFileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//getting all the values user inputs
				String stuName = studentNameField.getText().trim();
				String gradelvl = gradeLevelField.getText().trim();
				String semNum = semesterNumberField.getText().trim();
				String g1 = grade1Field.getText().trim();
				String g2 = grade2Field.getText().trim();
				String g3 = grade3Field.getText().trim();
				String g4 = grade4Field.getText().trim();
				//making sure no text fields are empty and prompting user if they are to make sure all are full
				if (stuName.isEmpty() ||gradelvl.isEmpty() || semNum.isEmpty() || g1.isEmpty() || g2.isEmpty() 
						|| g3.isEmpty()|| g4.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "1 or More Fields are Empty, Please enter a value",
								"Input Error", JOptionPane.WARNING_MESSAGE);
					} else {
						try {
							//setting user's average
							double avgGrade = ((Double.parseDouble(g1)) + (Double.parseDouble(g2)) + 
											(Double.parseDouble(g3)) + (Double.parseDouble(g4))) / 4;
							average.setText("Average: " + decimalFormatter.format(avgGrade));		
							
							;
							//file writing tools
								StringBuilder output = new StringBuilder();
					          FileWriter out = new FileWriter(dataFile, true); // append mode
					          BufferedWriter writeFile = new BufferedWriter(out); 
					          
					          	//adding all text for one line in string builder
					          	output.append("Name: ").append(stuName);
								output.append(" Grade Level: ");
								output.append(gradelvl).append(" Semester: ");
								output.append(semNum);
								output.append(" Grades: ");
								output.append(decimalFormatter.format(Double.parseDouble(g1))).append("%, ");
								output.append(decimalFormatter.format(Double.parseDouble(g2))).append("%, ");
								output.append(decimalFormatter.format(Double.parseDouble(g3))).append("%, ");
								output.append(decimalFormatter.format(Double.parseDouble(g4))).append("%, ");
								output.append(" Average: ").append(decimalFormatter.format(avgGrade)).append("%");
								//adding everything needed for one line in string builder to file via file writer
								writeFile.write(output.toString());
								writeFile.newLine();
								//closing filer writer
								writeFile.close();
								out.close();
								
								//confirmation pop up
								JOptionPane.showMessageDialog(null, "Data saved to file " + FILE_NAME,
										"Message", JOptionPane.INFORMATION_MESSAGE);
						} catch (IOException ex) {
							 JOptionPane.showMessageDialog(null, 
					                  "Could not be saved to file: \n" + ex.getMessage(), 
					                  "File Error", 
					                  JOptionPane.ERROR_MESSAGE);
								
					}
					}
				
		}});
		saveFileBtn.setBounds(61, 495, 138, 23);
		panel.add(saveFileBtn);
		
		JButton viewContentBtn = new JButton("View File Content");
		viewContentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayArea.setText(null);
				
				try 
				{
					// Initializing file reader tools
					FileReader in = new FileReader(dataFile);
					BufferedReader readFile = new BufferedReader(in);
					String line;
					StringBuilder output = new StringBuilder();
					
					//reads file and makes a new line whenever there is text
					while ((line = readFile.readLine()) != null)
					{
						output.append(line).append("\n");
					}
					readFile.close();
					in.close();

					displayArea.setText(output.toString());
				}
				
				//error messages 
				catch (FileNotFoundException err)
				{
					JOptionPane.showMessageDialog(null, "File could not be found\n" + err.getMessage(),
							"File Error", JOptionPane.ERROR_MESSAGE);
				}
				catch (IOException err)
				{
					JOptionPane.showMessageDialog(null, "Error reading file: \n" + err.getMessage(),
							"File Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		viewContentBtn.setBounds(355, 495, 138, 23);
		panel.add(viewContentBtn);
		
		JButton clearBtn = new JButton("Clear File Content");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clearing the file
				
				try {
					//using fileOutputStream to wipe data from file
					FileOutputStream fos = new FileOutputStream(dataFile);
					//letting user know file has been cleared
					JOptionPane.showMessageDialog(null, "Data cleared from file " + FILE_NAME,
							"Message", JOptionPane.INFORMATION_MESSAGE);

					displayArea.setText("Data has been cleared from file " + FILE_NAME);
				} catch (FileNotFoundException err) {
					// catching error
					err.printStackTrace();
				}
				
				
			}
		});
		clearBtn.setBounds(209, 495, 138, 23);
		panel.add(clearBtn);
	}
}
