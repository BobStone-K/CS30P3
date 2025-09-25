package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocalBank {
	Bank lcBank = new Bank();
	private JFrame frame;
	private JTextField accNumText;
	private JTextField amountofText;
	private JTextField fNameText;
	private JTextField lNameText;
	private JTextField beginningBalText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 536);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 475);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel selectAction = new JLabel("Select An Action: ");
		selectAction.setFont(new Font("Tahoma", Font.PLAIN, 13));
		selectAction.setBounds(21, 11, 169, 22);
		panel.add(selectAction);
		
		JComboBox actionBox = new JComboBox();
		actionBox.setModel(new DefaultComboBoxModel(new String[] {"Withdrawl", "Add an account", "Remove an account", "Deposit", "Check Balance"}));
		actionBox.setBounds(21, 44, 383, 22);
		panel.add(actionBox);
		
		JLabel infoWarner = new JLabel("Complete Information in Red");
		infoWarner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		infoWarner.setBounds(21, 77, 237, 22);
		panel.add(infoWarner);
		
		JLabel accNumberDis = new JLabel("Account number:");
		accNumberDis.setForeground(new Color(255, 0, 0));
		accNumberDis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accNumberDis.setBounds(21, 102, 169, 20);
		panel.add(accNumberDis);
		
		accNumText = new JTextField();
		accNumText.setBounds(20, 125, 384, 20);
		panel.add(accNumText);
		accNumText.setColumns(10);
		
		JLabel amountOfDis = new JLabel("Amount of deposit/withdrawl:");
		amountOfDis.setForeground(new Color(255, 0, 0));
		amountOfDis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		amountOfDis.setBounds(21, 156, 186, 20);
		panel.add(amountOfDis);
		
		amountofText = new JTextField();
		amountofText.setBounds(21, 179, 383, 20);
		panel.add(amountofText);
		amountofText.setColumns(10);
		
		JLabel fNameDis = new JLabel("First Name:");
		fNameDis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fNameDis.setBounds(21, 210, 383, 14);
		panel.add(fNameDis);
		
		fNameText = new JTextField();
		fNameText.setColumns(10);
		fNameText.setBounds(21, 226, 383, 20);
		panel.add(fNameText);
		
		JLabel lNameDis = new JLabel("Last Name:");
		lNameDis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lNameDis.setBounds(21, 257, 383, 14);
		panel.add(lNameDis);
		
		lNameText = new JTextField();
		lNameText.setColumns(10);
		lNameText.setBounds(21, 273, 383, 20);
		panel.add(lNameText);
		
		JLabel beginningBalDis = new JLabel("Beginng Balance");
		beginningBalDis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		beginningBalDis.setBounds(21, 304, 383, 22);
		panel.add(beginningBalDis);
		
		beginningBalText = new JTextField();
		beginningBalText.setColumns(10);
		beginningBalText.setBounds(21, 324, 383, 20);
		panel.add(beginningBalText);
		
		JLabel resultDis = new JLabel("");
		resultDis.setHorizontalAlignment(SwingConstants.CENTER);
		resultDis.setBounds(21, 351, 383, 51);
		panel.add(resultDis);
		
		
		actionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String choice = (String) actionBox.getSelectedItem();
			if(choice.equals("Withdrawl")) {
				accNumberDis.setForeground(Color.red);
				amountOfDis.setForeground(Color.red);
				fNameDis.setForeground(Color.black);
				lNameDis.setForeground(Color.black);
				beginningBalDis.setForeground(Color.black);
			}else if(choice.equals("Add an account")) {
				accNumberDis.setForeground(Color.red);
				amountOfDis.setForeground(Color.black);
				fNameDis.setForeground(Color.red);
				lNameDis.setForeground(Color.red);
				beginningBalDis.setForeground(Color.red);
				
			}else if(choice.equals("Remove an account")) {
				accNumberDis.setForeground(Color.red);
				amountOfDis.setForeground(Color.black);
				fNameDis.setForeground(Color.black);
				lNameDis.setForeground(Color.black);
				beginningBalDis.setForeground(Color.black);
				
			}else if(choice.equals("Deposit")) {
				accNumberDis.setForeground(Color.red);
				amountOfDis.setForeground(Color.red);
				fNameDis.setForeground(Color.black);
				lNameDis.setForeground(Color.black);
				beginningBalDis.setForeground(Color.black);
			}else if(choice.equals("Check Balance")) {
				accNumberDis.setForeground(Color.red);
				amountOfDis.setForeground(Color.black);
				fNameDis.setForeground(Color.black);
				lNameDis.setForeground(Color.black);
				beginningBalDis.setForeground(Color.black);
				
			}
			
			
			
			
			
			
			}
		});
		JButton transactionB = new JButton("Process Transaction");
		transactionB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String choice = (String) actionBox.getSelectedItem();
//				String accId = accNumText.getText();
//				double amountNum = Double.parseDouble(amountofText.getText());
				String lName = lNameText.getText();
//				String fName = fNameText.getText();
//				double ogBal = Double.parseDouble(beginningBalText.getText());
//				System.out.println(amountNum);
				System.out.println(lName);
				if(choice.equals("Withdrawl")) {
					if(accNumText.getText().equals("") || (amountofText.getText().equals(""))) {
						resultDis.setText("Required Fields are not filled in");
					}
					lcBank.transaction(2, accNumText.getText(), Double.parseDouble(amountofText.getText()));
				}else if(choice.equals("Add an account")) {
		
					
				}else if(choice.equals("Remove an account")) {
			
					
				}else if(choice.equals("Deposit")) {
		
					beginningBalDis.setForeground(Color.black);
				}else if(choice.equals("Check Balance")) {
				
					
				}
			}
		});
		transactionB.setBounds(21, 413, 145, 29);
		panel.add(transactionB);
	}
}
