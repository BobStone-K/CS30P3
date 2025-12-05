package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;




public class Roster extends JFrame{


	private JFrame frame;
	private JTextField fileNameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roster window = new Roster();
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
	public Roster() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 617, 498);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea displayArea = new JTextArea();
		displayArea.setEditable(false);
		displayArea.setBounds(23, 173, 565, 286);
		panel.add(displayArea);
		
		JLabel enterLabel = new JLabel("Enter File Name: ");
		enterLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		enterLabel.setHorizontalAlignment(SwingConstants.CENTER);
		enterLabel.setBounds(23, 65, 168, 51);
		panel.add(enterLabel);
		
		fileNameField = new JTextField();
		fileNameField.setBounds(201, 65, 252, 51);
		panel.add(fileNameField);
		fileNameField.setColumns(10);
		
		JButton enterBtn = new JButton("Enter");
		enterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder displayText  = writeFile();
				displayArea.setText(displayText.toString());
			
			}
		});
		enterBtn.setBounds(463, 65, 125, 51);
		panel.add(enterBtn);
	}

	
	
	private StringBuilder writeFile() {
		 String fileName = fileNameField.getText().trim();
	      if (fileName.isEmpty()) 
	        {
	            JOptionPane.showInputDialog( fileNameField, JOptionPane.WARNING_MESSAGE, "Please enter both file name and number of students.");
	            return null;
	        }
	     
	      String numStust = JOptionPane.showInputDialog(null, "How many students do you have");
	      int numStu = Integer.parseInt(numStust);
	      if (numStu < 0) 
	        {
	            JOptionPane.showInputDialog( fileNameField, JOptionPane.WARNING_MESSAGE, "Please enter a tangible number of students");
	            return null;
	        }
	      
	      StuName[] students = new StuName[numStu];
	      
	      StringBuilder studentData = new StringBuilder();
	      
	      for (int i = 0; i < numStu; i++) {
          JPanel inputDialog = new JPanel(new GridLayout(2, 2, 5, 5));
          
          JTextField fNameField = new JTextField();
          JTextField lNameField = new JTextField();
          
          inputDialog.add(new JLabel("First Name:"));
          inputDialog.add(fNameField);
          inputDialog.add(new JLabel("Last Name:"));
          inputDialog.add(lNameField);
          
          int result = JOptionPane.showConfirmDialog(this, inputDialog, 
              "Enter data for Student " + (i + 1), 
              JOptionPane.OK_CANCEL_OPTION);
          
          if (result != JOptionPane.OK_OPTION) {
              break; // User cancelled
          }
          
          String fName = fNameField.getText().trim();
          String lName = lNameField.getText().trim();
          
          if (fName.isEmpty() || lName.isEmpty()) {
              JOptionPane.showMessageDialog(this, 
                  "Please enter both name and score for student " + (i + 1), 
                  "Input Error", 
                  JOptionPane.WARNING_MESSAGE);
              i--; // Retry this student
              continue;
          }
         students[i] = new StuName(fName, lName);
         studentData.append(fName).append(" ").append(lName).append("\n");
}
	      try {
	    	  File dataFile = new File(fileName);
	          FileWriter out = new FileWriter(dataFile, true); // append mode
	          BufferedWriter writeFile = new BufferedWriter(out);   
	          
	          for (int i = 0; i < numStu; i++) {
	              writeFile.write(students[i].toString());
	                writeFile.newLine();
	          }
	          writeFile.close();
              out.close();
	      } catch(IOException e){
	    	  JOptionPane.showMessageDialog(this, 
	                  "File could not be created: " + e.getMessage(), 
	                  "File Error", 
	                  JOptionPane.ERROR_MESSAGE);
	      }
	      
	 
	      return studentData;
	      
	      
}
	
	
	
	
}
