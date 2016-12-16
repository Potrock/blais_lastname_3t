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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Main {

	static char topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV; //V for value, and because my buttons are called topleft, topmid, etc. :D
	static int currentPlayer = 1;
	boolean hasWinner;


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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 22));
		frame.setBounds(100, 100, 575, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Tic Tac Toe - Menu");
		JButton btn1Player = new JButton("1 Player");
		btn1Player.setSize(271, 346);
		JButton btn2Players = new JButton("2 Players");
		Icon playersIcon = new ImageIcon("img/operaIcon.png");
		btn2Players.setIcon(playersIcon);
		btn1Player.setFont(new Font("Tahoma", Font.PLAIN, 25));
		JLabel playerOption = new JLabel("How many players?");
		playerOption.setFont(new Font("Tahoma", Font.PLAIN, 42));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btn1Player, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn2Players, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(88)
							.addComponent(playerOption, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(playerOption, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btn1Player, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
						.addComponent(btn2Players, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE))
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);

		btn2Players.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btn2Players.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setLayout(new GridLayout(3,3));
				frame.getContentPane().remove(playerOption);
				frame.getContentPane().remove(btn1Player);
				frame.getContentPane().remove(btn2Players);
				frame.revalidate();
				frame.repaint();
				frame.setTitle("Tic Tac Toe - 2 Player Game");

				currentPlayer = 1;
				JButton topleft = new JButton("");
				topleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1) {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && topleftV != 'X') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							initialize();
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
							initialize();
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
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && topmidV != 'X') {
							topmid.setText("O");
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							toprightV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && toprightV != 'X') {
							topright.setText("O");
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							toprightV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midrightV != 'X') {
							midleft.setText("O");
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midmidV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midmidV != 'X') {
							midmid.setText("O");
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midmidV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midrightV != 'X') {
							midright.setText("O");
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botleftV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botleftV != 'X') {
							botleft.setText("O");
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botleftV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botmidV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botmidV != 'X') {
							botmid.setText("O");
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botmidV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botrightV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botrightV != 'X') {
							botright.setText("O");
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botrightV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
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
							frame.removeAll();
							frame.revalidate();
							frame.repaint();
							initialize();
						}


					}
				});
			}
		});

		btn1Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //On 1 Player Selection
				//The user has decided to play solo against the AI (TO DO: ADD AI)
				/**
				 * 
				 * Set up the match, this part can be copied to the setup for the 2 player mode aswell
				 * 
				 */
				frame.getContentPane().setLayout(new GridLayout(3,3));
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'o';
						} else if (currentPlayer == 2 && topleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'O';
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'o';
						} else if (currentPlayer == 2 && topmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							toprightV = 'o';
						} else if (currentPlayer == 2 && toprightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'O';
						} else if (currentPlayer == 2 && midrightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midmidV = 'o';
						} else if (currentPlayer == 2 && midmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'o';
						} else if (currentPlayer == 2 && midleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botleftV = 'o';
						} else if (currentPlayer == 2 && botleftV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botmidV = 'o';
						} else if (currentPlayer == 2 && botmidV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botrightV = 'o';
						} else if (currentPlayer == 2 && botrightV != 'o') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
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
							hasWinner = true;
							try {
								Thread.sleep(10);
							} catch(InterruptedException ex) {
								Thread.currentThread().interrupt();
							}						
							frame.removeAll();
						}


					}
				});
				botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);



			}
		});




	}


}
