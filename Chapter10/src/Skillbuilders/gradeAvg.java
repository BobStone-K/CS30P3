







package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class gradeAvg {

	private JFrame frame;
	private JTextField gradeBox1;
	private JTextField gradeBox2;
	private JTextField gradeBox3;
	private JButton submissionButton;
	private JLabel avgDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gradeAvg window = new gradeAvg();
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
	public gradeAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel grade1 = new JLabel("Enter the first grade:");
		grade1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		grade1.setBounds(29, 11, 167, 50);
		frame.getContentPane().add(grade1);
		
		JLabel grade2 = new JLabel("Enter the second grade:");
		grade2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		grade2.setBounds(29, 77, 167, 50);
		frame.getContentPane().add(grade2);
		
		JLabel grade3 = new JLabel("Enter the third grade:");
		grade3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		grade3.setBounds(29, 138, 167, 50);
		frame.getContentPane().add(grade3);
		
		gradeBox1 = new JTextField();
		gradeBox1.setBounds(206, 13, 185, 50);
		frame.getContentPane().add(gradeBox1);
		gradeBox1.setColumns(10);
		
		gradeBox2 = new JTextField();
		gradeBox2.setColumns(10);
		gradeBox2.setBounds(206, 77, 185, 50);
		frame.getContentPane().add(gradeBox2);
		
		gradeBox3 = new JTextField();
		gradeBox3.setColumns(10);
		gradeBox3.setBounds(206, 138, 185, 50);
		frame.getContentPane().add(gradeBox3);
		
		submissionButton = new JButton("Average");
		submissionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstGrade = gradeBox1.getText();
				String secondGrade = gradeBox2.getText();
				String thirdGrade = gradeBox3.getText();
				Double avgGrade = (Double.parseDouble(firstGrade) + Double.parseDouble(secondGrade) + Double.parseDouble(thirdGrade))/3;
				avgDisplay.setText(Double.toString(avgGrade));
			}
		});
		submissionButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		submissionButton.setBounds(29, 199, 167, 51);
		frame.getContentPane().add(submissionButton);
		
		avgDisplay = new JLabel("");
		avgDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		avgDisplay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		avgDisplay.setBounds(206, 200, 185, 50);
		frame.getContentPane().add(avgDisplay);
	}
}
