import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DemoP3 {

	private JFrame frame;
	private JTextField fN;
	private JTextField lN;
	private JTextField dis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoP3 window = new DemoP3();
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
	public DemoP3() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fN = new JTextField();
		fN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(fN.getText().equals("First Name"))
					fN.setText("");
			}
		});
		fN.setForeground(new Color(86, 84, 85));
		fN.setHorizontalAlignment(SwingConstants.CENTER);
		fN.setText("First Name");
		fN.setBounds(99, 35, 106, 30);
		panel.add(fN);
		fN.setColumns(10);
		
		lN = new JTextField();
		lN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				if(lN.getText().equals("Last Name"))
					lN.setText("");
			}
		});
		lN.setForeground(new Color(86, 84, 85));
		lN.setHorizontalAlignment(SwingConstants.CENTER);
		lN.setText("Last Name");
		lN.setColumns(10);
		lN.setBounds(229, 35, 106, 30);
		panel.add(lN);
		
		JComboBox grades = new JComboBox();
		grades.setForeground(new Color(128, 255, 255));
		grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "12", "11", "10"}));
		grades.setBounds(99, 76, 106, 22);
		panel.add(grades);
		
		JComboBox schools = new JComboBox();
		schools.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent Heights", "Nelson Mandela", "James Fowler", "Richard San Academy"}));
		schools.setForeground(new Color(128, 255, 255));
		schools.setBounds(229, 76, 106, 22);
		panel.add(schools);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstN =fN.getText();
				String lastN = lN.getText();
				String year;
				String school;
					
				if(grades.getSelectedItem().equals(12)) {
					year = "12";}
				else if(grades.getSelectedItem().equals(11)) {
					year = "11";
				}
				else {
					year = "10";
				}
				
				if(schools.getSelectedItem().equals("Crescent Heights")) {
					school = "Crescent Heights";}
				else if(schools.getSelectedItem().equals("Nelson Mandela")) {
					school = "Nelson Mandela";
				}
				else {
					school = "James Fowler";
				}
				
				dis.setText(firstN + " " + lastN + " is in grade " + year + " in " + school + " highschool");
			}
		});
		submit.setBounds(138, 109, 157, 44);
		panel.add(submit);
		
		dis = new JTextField();
		dis.setBounds(99, 164, 236, 86);
		panel.add(dis);
		dis.setColumns(10);
	}
}
