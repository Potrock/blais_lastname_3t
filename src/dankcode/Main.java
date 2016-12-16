package dankcode;

import java.awt.Color;
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

<<<<<<< HEAD
	static char topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV; //V for value :D
=======
	static char topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV; //V for value, and because my buttons are called topleft, topmid, etc. :D
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
	static int currentPlayer = 1;
	boolean hasWinner;
	int turnCount = 0;


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
<<<<<<< HEAD

		JLabel playerOption = new JLabel("How many players?");
		playerOption.setFont(new Font("Tahoma", Font.PLAIN, 20));
		playerOption.setBounds(129, 0, 174, 79);
		frame.getContentPane().add(playerOption);
		JButton btn1Player = new JButton("1 Player");

=======
		JButton btn1Player = new JButton("1 Player");
		btn1Player.setSize(271, 346);
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
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
						if (currentPlayer == 1 && topleftV == '\u0000') {
							currentPlayer = 2;
							topleft.setText("X");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'X';
<<<<<<< HEAD
							topleft.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && topleftV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && topleftV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							topleftV = 'O';
							topleft.setForeground(Color.red);
							turnCount++;
						}
						if (turnCount >= 5) {
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
									Thread.sleep(3000);
								} catch(InterruptedException ex) {
									Thread.currentThread().interrupt();
								}						
								frame.removeAll();
								frame.repaint();
								frame.revalidate();
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
								hasWinner = true;
								try {
									Thread.sleep(3000);
								} catch(InterruptedException ex) {
									Thread.currentThread().interrupt();
								}						
								frame.removeAll();
								frame.repaint();
								frame.revalidate();
								initialize();
							} else if (turnCount == 9 && hasWinner == false) {
								JOptionPane.showMessageDialog(null, "You tied!");
							}


						}
=======
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


>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});
				topleft.setBounds(77, 32, 140, 140);
				frame.getContentPane().add(topleft);

				JButton topmid = new JButton("");
				topmid.setBounds(227, 32, 140, 140);
				frame.getContentPane().add(topmid);
				topmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && topmidV =='\u0000') {
							currentPlayer = 2;
							topmid.setText("X");
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'X';
<<<<<<< HEAD
							topmid.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && topmidV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && topmidV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							topmid.setText("O");
							topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							topmidV = 'O';
							topmid.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}


<<<<<<< HEAD
					}
=======
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});

				JButton topright = new JButton("");
				topright.setBounds(377, 33, 140, 140);
				frame.getContentPane().add(topright);
				topright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && toprightV =='\u0000') {
							currentPlayer = 2;
							topright.setText("X");
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							toprightV = 'X';
<<<<<<< HEAD
							topright.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && toprightV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && toprightV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							topright.setText("O");
							topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							toprightV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							toprightV = 'O';
							topright.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}

						}
<<<<<<< HEAD
=======


>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});

				JButton midleft = new JButton("");
				midleft.setBounds(77, 184, 140, 140);
				frame.getContentPane().add(midleft);
				midleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && midleftV == '\u0000') {
							currentPlayer = 2;
							midleft.setText("X");
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
<<<<<<< HEAD
							midleftV = 'X';
							midleft.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && midleftV == '\u0000') {
=======
							midrightV = 'X';
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midrightV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							midleft.setText("O");
							midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							midleftV = 'O';
							midleft.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}
						}

<<<<<<< HEAD
=======

>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});

				JButton midmid = new JButton("");
				midmid.setBounds(227, 184, 140, 140);
				frame.getContentPane().add(midmid);
				midmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && midmidV == '\u0000') {
							currentPlayer = 2;
							midmid.setText("X");
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midmidV = 'X';
<<<<<<< HEAD
							midmid.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && midmidV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midmidV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							midmid.setText("O");
							midmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midmidV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							midmidV = 'O';
							midmid.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}
<<<<<<< HEAD
						}
=======

>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303

					}
				});

				JButton midright = new JButton("");
				midright.setBounds(377, 184, 140, 140);
				frame.getContentPane().add(midright);
				midright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && midrightV == '\u0000') {
							currentPlayer = 2;
							midright.setText("X");
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'X';
<<<<<<< HEAD
							midright.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && midrightV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && midrightV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							midright.setText("O");
							midright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							midrightV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							midrightV = 'O';
							midright.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}
						}

<<<<<<< HEAD
=======

>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});

				JButton botleft = new JButton("");
				botleft.setBounds(77, 335, 140, 140);
				frame.getContentPane().add(botleft);
				botleft.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && botleftV == '\u0000') {
							currentPlayer = 2;
							botleft.setText("X");
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botleftV = 'X';
<<<<<<< HEAD
							botleft.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && botleftV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botleftV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							botleft.setText("O");
							botleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botleftV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							botleftV = 'O';
							botleft.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}

						}
					}
				});

				JButton botmid = new JButton("");
				botmid.setBounds(227, 335, 140, 140);
				frame.getContentPane().add(botmid);
				botmid.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && botmidV == '\u0000') {
							currentPlayer = 2;
							botmid.setText("X");
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botmidV = 'X';
<<<<<<< HEAD
							botmid.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && botmidV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botmidV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							botmid.setText("O");
							botmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botmidV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							botmidV = 'O';
							botmid.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
<<<<<<< HEAD

						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}

						}
=======
						}


>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});

				JButton botright = new JButton("");
				botright.setBounds(377, 335, 140, 140);
				frame.getContentPane().add(botright);
				botright.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (currentPlayer == 1 && botrightV == '\u0000') {
							currentPlayer = 2;
							botright.setText("X");
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botrightV = 'X';
<<<<<<< HEAD
							botright.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && botrightV == '\u0000') {
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is O's turn!");
						} else if (currentPlayer == 2 && botrightV != 'X') {
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
							botright.setText("O");
							botright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							botrightV = 'O';
							currentPlayer = 1;
<<<<<<< HEAD
							botrightV = 'O';
							botright.setForeground(Color.red);
							turnCount++;
=======
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
						}
						if (turnCount >= 5) {
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
<<<<<<< HEAD

=======
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
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
						} else if (turnCount == 9 && hasWinner == false) {
							JOptionPane.showMessageDialog(null, "You tied!");
						}

						}
<<<<<<< HEAD
=======


>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
					}
				});
			}
		});
<<<<<<< HEAD
		btn2Players.setBounds(217, 67, 217, 147);
		frame.getContentPane().add(btn2Players);
=======
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303

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
							topleftV = 'X';
							topleft.setForeground(Color.blue);
							turnCount++;
						} else if (currentPlayer == 2 && topleftV != 'X') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topleftV = 'O';
<<<<<<< HEAD
							topleft.setForeground(Color.red);
							turnCount++;
=======
							currentPlayer = 1;
							frame.setTitle("Tic Tac Toe - 2 Players - It is X's turn!");
>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
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
							topmidV = 'X';
							topmid.setForeground(Color.blue);
						} else if (currentPlayer == 2 && topmidV != 'X') {
							topleft.setText("O");
							topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
							frame.revalidate();
							frame.repaint();
							topmidV = 'O';
							topmid.setForeground(Color.red);
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
							toprightV = 'X';
						} else if (currentPlayer == 2 && toprightV != 'X') {
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
<<<<<<< HEAD
		btn1Player.setBounds(0, 67, 217, 147);
		frame.getContentPane().add(btn1Player);


=======




>>>>>>> 5db3dd3cf1abc7d1d14ceb5cdd708621cf54e303
	}


}
