package dankcode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
						} else if (currentPlayer == 2 && topleftV != 'X') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				topleft.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(topleft);
				
				JButton topmid = new JButton("");
				topmid.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(topmid);
				topmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topmid.setText("X");
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							topmidV = 'X';
						} else if (currentPlayer == 2 && topmidV != 'X') {
							topmid.setText("O");
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
				JButton topright = new JButton("");
				topright.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(topright);
				topright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topright.setText("X");
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							toprightV = 'X';
						} else if (currentPlayer == 2 && toprightV != 'X') {
							topright.setText("O");
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
				JButton midright = new JButton("");
				midright.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(midright);
				midright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							midright.setText("X");
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							midrightV = 'X';
						} else if (currentPlayer == 2 && midrightV != 'X') {
							midright.setText("O");
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
                JButton midmid = new JButton("");
		        midmid.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(midmid);
				midmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							midmid.setText("X");
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							midmidV = 'X';
						} else if (currentPlayer == 2 && midmidV != 'X') {
							midmid.setText("O");
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
				JButton midleft = new JButton("");
				midleft.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(midleft);
				midleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							midleft.setText("X");
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							topleftV = 'X';
						} else if (currentPlayer == 2 && midleftV != 'X') {
							midleft.setText("O");
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
     			JButton botleft = new JButton("");
				botleft.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(botleft);
				botleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							botleft.setText("X");
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botleftV = 'X';
						} else if (currentPlayer == 2 && botleftV != 'X') {
							botleft.setText("O");
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
				JButton botmid = new JButton("");
				botmid.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(botmid);
				botmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							botmid.setText("X");
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botmidV = 'X';
						} else if (currentPlayer == 2 && botmidV != 'X') {
							botmid.setText("O");
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
				
				JButton botright = new JButton("");
                botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);
				botright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							botright.setText("X");
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botrightV = 'X';
						} else if (currentPlayer == 2 && botrightV != 'X') {
							botright.setText("O");
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							currentPlayer = 1;
						}
						
						
					}
				});
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
						} else if (currentPlayer == 2 && topleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				topleft.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(topleft);
				
				JButton topmid = new JButton("");
				topmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							topmidV = 'o';
						} else if (currentPlayer == 2 && topmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				topmid.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(topmid);
				
				JButton topright = new JButton("");
				topright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							toprightV = 'o';
						} else if (currentPlayer == 2 && toprightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				topright.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(topright);
				
				JButton midright = new JButton("");
				midright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							midrightV = 'o';
						} else if (currentPlayer == 2 && midrightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				midright.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(midright);
				
                JButton midmid = new JButton("");
                midmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							midmidV = 'o';
						} else if (currentPlayer == 2 && midmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
		        midmid.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(midmid);
				
				JButton midleft = new JButton("");
				midleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							midleftV = 'o';
						} else if (currentPlayer == 2 && midleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				midleft.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(midleft);
				
     			JButton botleft = new JButton("");
     			botleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botleftV = 'o';
						} else if (currentPlayer == 2 && botleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				botleft.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(botleft);
				
				JButton botmid = new JButton("");
				botmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botmidV = 'o';
						} else if (currentPlayer == 2 && botmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
				botmid.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(botmid);
				
				JButton botright = new JButton("");
				botright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
							botrightV = 'o';
						} else if (currentPlayer == 2 && botrightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 50));
							frame.revalidate();
							frame.repaint();
						}
						if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' 
								|| midleftV == 'X' && midmidV == 'X' &&  midrightV == 'X' 
								|| botleftV == 'X' && botmidV == 'X' && botrightV == 'X' 
								|| topleftV == 'X' && midleftV == 'X' && botleftV == 'X'
								|| topmidV == 'X' && midmidV == 'X' && botmidV == 'X'
								|| toprightV == 'X' && midrightV == 'X' && botrightV == 'X'
								|| toprightV == 'X' && midmidV == 'X' && botleftV == 'X'
								|| topleftV == 'X' && midmidV == 'X' && botrightV == 'X')
						{
							JOptionPane.showMessageDialog(null,"Player X has won!");
						} else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' 
								|| midleftV == 'O' && midmidV == 'O' &&  midrightV == 'O' 
								|| botleftV == 'O' && botmidV == 'O' && botrightV == 'O' 
								|| topleftV == 'O' && midleftV == 'O' && botleftV == 'O'
								|| topmidV == 'O' && midmidV == 'O' && botmidV == 'O'
								|| toprightV == 'O' && midrightV == 'O' && botrightV == 'O'
								|| toprightV == 'O' && midmidV == 'O' && botleftV == 'O'
								|| topleftV == 'O' && midmidV == 'O' && botrightV == 'O')
						{
							JOptionPane.showMessageDialog(null, "Player O has won!");
						}
						
						
					}
				});
                botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);
				
				
				
			}
		});
		btn1Player.setBounds(0, 67, 217, 147);
		frame.getContentPane().add(btn1Player);
		

		}
		
		
	}
