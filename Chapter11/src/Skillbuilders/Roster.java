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
				writeFile();
			
			}
		});
		enterBtn.setBounds(463, 65, 125, 51);
		panel.add(enterBtn);
	}

	
	
	private void writeFile() {
		 String fileName = fileNameField.getText().trim();
	      if (fileName.isEmpty()) 
	        {
	            JOptionPane.showInputDialog( fileNameField, JOptionPane.WARNING_MESSAGE, "Please enter both file name and number of students.");
	            return;
	        }
	      	
	      String numStust = JOptionPane.showInputDialog(null, "How many students do you have");
	      int numStu = Integer.parseInt(numStust);
	      if (numStu < 0) 
	        {
	            JOptionPane.showInputDialog( fileNameField, JOptionPane.WARNING_MESSAGE, "Please enter a tangible number of students");
	            return;
	        }
	      
	      StuName[] students = {};
	      
	      for (int i = 0; i < numStu; i++) 
          {
              JPanel inputDialog = new JPanel(new GridLayout(2, 2, 5, 5));
              
              JTextField nameField = new JTextField();
              JTextField scoreField = new JTextField();
              
              inputDialog.add(new JLabel("Student First Name:"));
              inputDialog.add(nameField);
              inputDialog.add(new JLabel("Student Last Name:"));
              inputDialog.add(scoreField);
              
              int result = JOptionPane.showConfirmDialog(inputDialog, 
                  "Enter data for Student " + (i + 1) );
              
              if (result != JOptionPane.OK_OPTION) {
                  break; // User cancelled
              }
	}
}
}
