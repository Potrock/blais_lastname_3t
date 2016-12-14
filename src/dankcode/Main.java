package dankcode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Main {
	
	static char topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV; //V for value :D
	static int currentPlayer = 1;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 575, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel playerOption = new JLabel("How many players?");
		playerOption.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playerOption.setBounds(129, 0, 174, 79);
		frame.getContentPane().add(playerOption);
		JButton btn1Player = new JButton("1 Player");
		
		JButton btn2Players = new JButton("2 Players");
		btn2Players.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setLayout(new GridLayout(3,3));
				frame.getContentPane().remove(playerOption);
				frame.getContentPane().remove(btn1Player);
				frame.getContentPane().remove(btn2Players);
				frame.revalidate();
				frame.repaint();
				
				currentPlayer = 1;
				JButton topleft = new JButton("");
				topleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							topleftV = 'X';
						} else if (currentPlayer == 2 || topleftV != 'X') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						
						
					}
				});
				topleft.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(topleft);
				
				JButton topmid = new JButton("");
				topmid.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(topmid);
				
				JButton topright = new JButton("");
				topright.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(topright);
				
				JButton midright = new JButton("");
				midright.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(midright);
				
                JButton midmid = new JButton("");
		        midmid.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(midmid);
				
				JButton midleft = new JButton("");
				midleft.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(midleft);
				
     			JButton botleft = new JButton("");
				botleft.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(botleft);
				
				JButton botmid = new JButton("");
				botmid.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(botmid);
				
				JButton botright = new JButton("");
                botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);
			}
		});
		btn2Players.setBounds(217, 67, 217, 147);
		frame.getContentPane().add(btn2Players);
		
		btn1Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //On 1 Player Selection
				//The user has decided to play solo against the AI (TO DO: ADD AI)
				/**
				 * 
				 * Set up the match, this part can be copied to the setup for the 2 player mode aswell
				 * 
				 */
				frame.setLayout(new GridLayout(3,3));
				frame.getContentPane().remove(playerOption); //Clears previous layout
				frame.getContentPane().remove(btn1Player); 
				frame.getContentPane().remove(btn2Players); 
				frame.revalidate();
				frame.repaint();
				
				currentPlayer = 1;
				
				
				JButton topleft = new JButton("");
				topleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							topleftV = 'o';
						} else if (currentPlayer == 2 || topleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						
						
					}
				});
				topleft.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(topleft);
				
				JButton topmid = new JButton("");
				topmid.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(topmid);
				
				JButton topright = new JButton("");
				topright.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(topright);
				
				JButton midright = new JButton("");
				midright.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(midright);
				
                JButton midmid = new JButton("");
		        midmid.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(midmid);
				
				JButton midleft = new JButton("");
				midleft.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(midleft);
				
     			JButton botleft = new JButton("");
				botleft.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(botleft);
				
				JButton botmid = new JButton("");
				botmid.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(botmid);
				
				JButton botright = new JButton("");
                botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);
				
				
				
			}
		});
		btn1Player.setBounds(0, 67, 217, 147);
		frame.getContentPane().add(btn1Player);
		

		
		
	}
}
