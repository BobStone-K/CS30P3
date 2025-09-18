package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		
		JLabel Selectype = new JLabel("Select a conversion type:");
		Selectype.setVerticalAlignment(SwingConstants.BOTTOM);
		Selectype.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Selectype.setBounds(20, 68, 179, 35);
		panel.add(Selectype);
		
		JComboBox conversionBox = new JComboBox();

		conversionBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Type", "Inch to Centimeter", "Foot to Meter", "Gallon to Litre", "Pound to Kilogram"}));
		conversionBox.setBounds(20, 107, 404, 35);
		panel.add(conversionBox);
		
		JLabel cDis = new JLabel("");
		cDis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cDis.setBounds(20, 156, 257, 35);
		panel.add(cDis);
		conversionBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Inch to Centimeter
				//Feet to Meter
				//Gallon to Litre
				//Pound to Kilogram
	
				if(conversionBox.getSelectedItem().equals("Inch to Centimeter")) {
					cDis.setText("1 inch equals 2.54 centimeters");
						
			} else if(conversionBox.getSelectedItem().equals("Foot to Meter")) {
				cDis.setText("1 foot equals 0.3048 meters");
			}else if(conversionBox.getSelectedItem().equals("Gallon to Litre")) {
				cDis.setText("1 gallon equals 4.5461 litres");
			}else {
				cDis.setText("1 pound equals 0.4536 kilograms");
			
			}	
			}
		});
	}
}
