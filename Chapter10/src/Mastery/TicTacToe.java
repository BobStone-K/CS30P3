package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class TicTacToe {
	//creating variables to keep track of which player goes and the letters on the board
	static int player = 0;
	static String[] board = new String[9];
	//function to check for a winner
	public static String checkWinner() {
		// checking for all the rows win combinations and if any player has got them
	for( int i = 0; i < 8; i++) {
		String line = null;
		 switch (i) {
         case 0:
             line = board[0] + board[1] + board[2];
             break;
         case 1:
             line = board[3] + board[4] + board[5];
             break;
         case 2:
             line = board[6] + board[7] + board[8];
             break;
         case 3:
             line = board[0] + board[3] + board[6];
             break;
         case 4:
             line = board[1] + board[4] + board[7];
             break;
         case 5:
             line = board[2] + board[5] + board[8];
             break;
         case 6:
             line = board[0] + board[4] + board[8];
             break;
         case 7:
             line = board[2] + board[4] + board[6];
             break;
   

	}
		 //if player has three in a row win it returns the winner 
	 	    if (line.equals("XXX")) {
                return "Winner is: X";
            }

   
            else if (line.equals("OOO")) {
                return "Winner is: O";
            }

	}
	// if there has been 9 rounds and there is no three in a row win then it returns its a draw
	if(player == 9) {
		return "Draw";	
	}
	//if nothing is reached then the game is still on so it returns null
	return null;
	
	}
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 319, 316);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel winnerDis = new JLabel("The Winner is: ");
		winnerDis.setBounds(10, 285, 186, 20);
		panel.add(winnerDis);
		JButton b1 = new JButton("");
		//adding a button listener to every button with the same code in all of them
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//adding one to player counter to ensure it is the right player's turn
				player += 1;
				//checking which player's turn it is and putting their letter on the board where they clicked
				if(player%2 == 1)
				{
					b1.setText("X");
					board[0] = "X";
				} else{
					b1.setText("O");
					board[0] = "O";
				}
				//checking if there is a winner and displaying the value returned from the function
				String winner = checkWinner();
				//if no winner or draw then return and resume the game
				if(winner == null) {
					return;
				}
				//if function came to a verdict then display it
				winnerDis.setText(winner);
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.PLAIN, 30));

		b1.setBounds(10, 21, 96, 77);
		panel.add(b1);
		
		JButton b4 = new JButton("");
		//adding a button listener
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b4.setText("X");
					board[3] = "X";
				} else{
					b4.setText("O");
					board[3] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
				
			}
		});
		b4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b4.setBounds(10, 109, 96, 77);
		panel.add(b4);
		
		JButton b7 = new JButton("");
		//adding a button listener
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b7.setText("X");
					board[6] = "X";
				} else{
					b7.setText("O");
					board[6] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b7.setBounds(10, 197, 96, 77);
		panel.add(b7);
		
		JButton b2 = new JButton("");
		//adding a button listener
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b2.setText("X");
					board[1] = "X";
				} else{
					b2.setText("O");
					board[1] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b2.setBounds(116, 21, 96, 77);
		panel.add(b2);
		
		JButton b8 = new JButton("");
		//adding a button listener
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b8.setText("X");
					board[7] = "X";
				} else{
					b8.setText("O");
					board[7] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b8.setBounds(116, 197, 96, 77);
		panel.add(b8);
		
		JButton b5 = new JButton("");
		//adding a button listener
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b5.setText("X");
					board[4] = "X";
				} else{
					b5.setText("O");
					board[4] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b5.setBounds(116, 109, 96, 77);
		panel.add(b5);
		
		JButton b3 = new JButton("");
		//adding a button listener
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b3.setText("X");
					board[2] = "X";
				} else{
					b3.setText("O");
					board[2] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b3.setBounds(222, 21, 96, 77);
		panel.add(b3);
		
		JButton b9 = new JButton("");
		//adding a button listener
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b9.setText("X");
					board[8] = "X";
				} else{
					b9.setText("O");
					board[8] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b9.setBounds(222, 197, 96, 77);
		panel.add(b9);
		
		JButton b6 = new JButton("");
		//adding a button listener
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player += 1;
				if(player%2 == 1)
				{
					b6.setText("X");
					board[5] = "X";
				} else{
					b6.setText("O");
					board[5] = "O";
				}
				String winner = checkWinner();
				if(winner == null) {
					return;
				}
				winnerDis.setText(winner);
			}
		});
		b6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		b6.setBounds(222, 109, 96, 77);
		panel.add(b6);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winnerDis.setText("The Winner is:");
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				Arrays.fill(board, null);
			}
		});
		btnNewButton.setBounds(220, 284, 89, 23);
		panel.add(btnNewButton);
		

		

		
		
		
	}
}
