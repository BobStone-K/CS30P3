package Mastery;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon placeHolder = new ImageIcon("../Chapter10/src/Mastery/placeholder.gif");
		ImageIcon allBroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
		ImageIcon twoBroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
		ImageIcon plates = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon Tiger = new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
	
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel plateDis = new JLabel("");
		plateDis.setIcon(new ImageIcon(BreakAPlate.class.getResource("/Mastery/plates.gif")));
		plateDis.setHorizontalAlignment(SwingConstants.CENTER);
		plateDis.setBounds(87, 41, 263, 61);
		panel.add(plateDis);
		
		JButton playButton = new JButton("Play");

		playButton.setBounds(133, 184, 145, 38);
		panel.add(playButton);
		
		JLabel rewardDis = new JLabel("");
		rewardDis.setHorizontalAlignment(SwingConstants.CENTER);
		rewardDis.setBounds(155, 113, 91, 60);
		panel.add(rewardDis);
		
		playButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int chance = (int) (2 * Math.random() + 1);
				if(playButton.getText().equals("Play")) {
					if(chance == 1) {
						plateDis.setIcon(twoBroken);
						rewardDis.setIcon(sticker);
						playButton.setText("Play Again");
					}
					if(chance == 2) {
						plateDis.setIcon(allBroken);
						rewardDis.setIcon(Tiger);
						playButton.setText("Play Again");
					}
					return;
				} else if(playButton.getText().equals("Play Again")) {
					plateDis.setIcon(plates);
					rewardDis.setIcon(placeHolder);
					playButton.setText("Play");
					return;
				}
			}
		});
		
}
}
