package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class MyFilePart2 {

	private JFrame frame;
	private static final String FILE_PATH = "C:\\Users\\38262004\\git\\CS30P3\\Chapter11\\src\\Skillbuilders\\zzz.txt";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFilePart2 window = new MyFilePart2();
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
	public MyFilePart2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		File textFile = new File(FILE_PATH);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JButton DFile = new JButton("Delete File");
		DFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFile.delete())
				{
					System.out.println("File has been deleted.");
				}
			else
			{
				System.out.println("File is kept and stays the same");
			}
			}
		});
		DFile.setBounds(216, 134, 101, 44);
		frame.getContentPane().add(DFile);
		
		JButton KFile = new JButton("Keep File");
		KFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textFile.exists()) {
					System.out.println("zzz.txt file exist");
					
				}else {
					try {
						textFile.createNewFile();
						System.out.println("File has successfully been created.");
					} catch(IOException err) {
						System.out.println("File could not be created");
						System.out.println("IOException: " + err.getMessage());
					}
				}
			}
		});
		KFile.setBounds(105, 134, 101, 44);
		frame.getContentPane().add(KFile);
		

	}
}
