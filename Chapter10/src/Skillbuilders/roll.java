package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					roll window = new roll();
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
	public roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon d1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel die1 = new JLabel("");
		die1.setHorizontalAlignment(SwingConstants.CENTER);
		die1.setForeground(new Color(0, 0, 0));
		die1.setBounds(10, 11, 188, 179);
		panel.add(die1);
		
		JLabel die2 = new JLabel("");
		die2.setHorizontalAlignment(SwingConstants.CENTER);
		die2.setForeground(new Color(0, 0, 0));
		die2.setBounds(236, 11, 188, 179);
		panel.add(die2);
		
		JButton rButton = new JButton("Roll");
		rButton.setBackground(new Color(240, 240, 240));
		rButton.setFont(new Font("Wide Latin", Font.PLAIN, 13));
		rButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int dieRoll1 = (int) (6 * Math.random() + 1);
				
				if(dieRoll1 == 1) {
					die1.setIcon(d1);
				}else if(dieRoll1 == 2) {
					die1.setIcon(d2);
				}else if(dieRoll1 == 3) {
					die1.setIcon(d3);
				}else if(dieRoll1 == 4) {
					die1.setIcon(d4);
				}else if(dieRoll1 == 5) {
					die1.setIcon(d5);
				}else {
					die1.setIcon(d6);
				}

				
				int dieRoll2 = (int) (6 * Math.random() + 1);
				
				if(dieRoll2 == 1) {
					die2.setIcon(d1);
				}else if(dieRoll2 == 2) {
					die2.setIcon(d2);
				}else if(dieRoll2 == 3) {
					die2.setIcon(d3);
				}else if(dieRoll2 == 4) {
					die2.setIcon(d4);
				}else if(dieRoll2 == 5) {
					die2.setIcon(d5);
				}else {
					die2.setIcon(d6);
				}
			}
		});
		rButton.setBounds(125, 201, 188, 37);
		panel.add(rButton);
	}
}
