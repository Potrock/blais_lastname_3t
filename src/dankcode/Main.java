package dankcode;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

import java.awt.Font;

public class Main {

	private JFrame frame;

	int turn = 1;
	boolean btnclick1 = false, btnclick2 = false, btnclick3 = false, btnclick4 = false, btnclick5 = false, btnclick6 = false,
			btnclick7 = false, btnclick8 = false, btnclick9 = false;

	int topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV = 0;
	// will later be changed to reflect value in the box (ie 'X' will be
	// represented by 1, 'O' will be represented by 2)

	boolean computerwins = false; // Only used for "tie" code for 1 player, "Go
	// Second" mode.
	static int player = 1; // Player 1 = X, 2 = O
	boolean hasWinner; // Game ends if hasWinner = true
	int turnCount = 0; // To only check for winner after 5 turns

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

  /** 
   * 	Main Setup 
   */
  frame = new JFrame();
  frame.setBounds(100, 100, 600, 700);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(null);
  frame.setTitle("Tic Tac Toe - Menu");
  frame.getContentPane().setLayout(null);

  JLabel playerOption = new JLabel("How many players?");
  playerOption.setFont(new Font("Tahoma", Font.PLAIN, 57));
  playerOption.setBounds(49, 11, 500, 79);
  frame.getContentPane().add(playerOption);
	JButton btn1Player = new JButton("1 player");
	btn1Player.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btn1Player.setBounds(49, 101, 224, 342);
	frame.getContentPane().add(btn1Player);

	JButton btn2Players = new JButton("2 players");
	btn2Players.setFont(new Font("Tahoma", Font.PLAIN, 15));
	btn2Players.setBounds(307, 101, 224, 342);
	frame.getContentPane().add(btn2Players);
	
	btn1Player.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			frame.getContentPane().remove(playerOption);

			frame.getContentPane().remove(btn1Player);
			frame.getContentPane().remove(btn2Players);

			frame.revalidate();
			frame.repaint();

					JButton btn1 = new JButton("");
					btn1.setBounds(56, 143, 141, 141);
					frame.getContentPane().add(btn1);

					JButton btn2 = new JButton("");
					btn2.setBounds(220, 143, 141, 141);
					frame.getContentPane().add(btn2);

					JButton btn3 = new JButton("");
					btn3.setBounds(385, 143, 141, 141);
					frame.getContentPane().add(btn3);

					JButton btn4 = new JButton("");
					btn4.setBounds(56, 305, 141, 141);
					frame.getContentPane().add(btn4);

					JButton btn5 = new JButton("");
					btn5.setBounds(220, 305, 141, 141);
					frame.getContentPane().add(btn5);

					JButton btn6 = new JButton("");
					btn6.setBounds(385, 305, 141, 141);
					frame.getContentPane().add(btn6);

					JButton btn7 = new JButton("");
					btn7.setBounds(56, 467, 141, 141);
					frame.getContentPane().add(btn7);

					JButton btn8 = new JButton("");
					btn8.setBounds(220, 467, 141, 141);
					frame.getContentPane().add(btn8);

					JButton btn9 = new JButton("");
					btn9.setBounds(385, 467, 141, 141);
					frame.getContentPane().add(btn9);
					
					frame.revalidate();
					frame.repaint();
					
					btn5.setText("O");
					btn5.setForeground(Color.green);
					btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
					turn++;
					btnclick5 = true;
					midmidV = 2;
					frame.revalidate();
					frame.repaint();
					
					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick1 == false) {
								btn1.setText("X"); 
								btn1.setForeground(Color.RED);
								btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick1 = true;
								topleftV = 1;

								if (turn == 3) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}

						}
					});

					btn2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick2 == false) {
								btn2.setText("X"); 
								btn2.setForeground(Color.RED);
								btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick2 = true;
								topmidV = 1;

								if (turn == 3) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick3 == false) {
								btn3.setText("X"); 
								btn3.setForeground(Color.RED);
								btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick3 = true;
								toprightV = 1;

								if (turn == 3) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick4 == false) {
								btn4.setText("X"); 
								btn4.setForeground(Color.RED);
								btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick4 = true;
								midleftV = 1;

								if (turn == 3) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 1;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick6 == false) {
								btn6.setText("X"); 
								btn6.setForeground(Color.RED);
								btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick6 = true;
								midrightV = 1;

								if (turn == 3) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick7 == false) {
								btn7.setText("X"); 
								btn7.setForeground(Color.RED);
								btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick7 = true;
								botleftV = 1;

								if (turn == 3) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}
							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick8 == false) {
								btn8.setText("X"); 
								btn8.setForeground(Color.RED);
								btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick8 = true;
								botmidV = 1;

								if (turn == 3) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}
							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});

					btn9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 == 0 && btnclick9 == false) {
								btn9.setText("X"); 
								btn9.setForeground(Color.RED);
								btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick9 = true;
								botrightV = 1;

								if (turn == 3) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
								}
							}
							if (turn % 2 == 1) {
								if (topleftV == 2 && topmidV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && toprightV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && toprightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midmidV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && midrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && midrightV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botleftV == 2 && botrightV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (botmidV == 2 && botrightV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midleftV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botleftV == 2 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midleftV == 2 && botleftV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && midmidV == 2 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topmidV == 2 && botmidV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botmidV == 2 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midrightV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botrightV == 2 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midrightV == 2 && botrightV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && midmidV == 2 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (topleftV == 2 && botrightV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botrightV == 2 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && midmidV == 2 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (toprightV == 2 && botleftV == 2 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								} else if (midmidV == 2 && botleftV == 2 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;
									computerwins = true;
									JLabel lblYouLose = new JLabel("You Lose!");
									lblYouLose.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblYouLose.setBounds(180,50, 500, 60);
									frame.getContentPane().add(lblYouLose);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
								}

								else if (topleftV == 1 && topmidV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && toprightV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && toprightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midmidV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && midrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && midrightV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botleftV == 1 && botrightV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (botmidV == 1 && botrightV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midleftV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botleftV == 1 && btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midleftV == 1 && botleftV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && midmidV == 1 && btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topmidV == 1 && botmidV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botmidV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midrightV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botrightV == 1 && btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botrightV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && midmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botrightV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botrightV == 1 && btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && midmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick5 == false) {
									btn5.setText("O"); 
									btn5.setForeground(Color.GREEN);
									btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick5 = true;
									midmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botleftV == 1 && btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midmidV == 1 && botleftV == 1 && btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (topleftV == 1 && botmidV == 1 && btnclick7 == false) {
									btn7.setText("O"); 
									btn7.setForeground(Color.GREEN);
									btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick7 = true;
									botleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (toprightV == 1 && botmidV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (midrightV == 1 && botleftV == 1 && btnclick9 == false) {
									btn9.setText("O"); 
									btn9.setForeground(Color.GREEN);
									btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick9 = true;
									botrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == false) {
									btn1.setText("O"); 
									btn1.setForeground(Color.GREEN);
									btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick1 = true;
									topleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick2 == false) {
									btn2.setText("O"); 
									btn2.setForeground(Color.GREEN);
									btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick2 = true;
									topmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick3 == false) {
									btn3.setText("O"); 
									btn3.setForeground(Color.GREEN);
									btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick3 = true;
									toprightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick4 == false) {
									btn4.setText("O"); 
									btn4.setForeground(Color.GREEN);
									btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick4 = true;
									midleftV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick6 == false) {
									btn6.setText("O"); 
									btn6.setForeground(Color.GREEN);
									btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick6 = true;
									midrightV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick8 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								} else if (btnclick9 == false) {
									btn8.setText("O"); 
									btn8.setForeground(Color.GREEN);
									btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
									turn++;
									btnclick8 = true;
									botmidV = 2;

									frame.revalidate();
									frame.repaint();
								}

							}
							if (turn == 10 && computerwins == false) {
								JLabel lbltie = new JLabel("Tie Game!");
								lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
								lbltie.setBounds(180, 50, 500, 60);
								frame.getContentPane().add(lbltie);
								frame.revalidate();
								frame.repaint();
							}
						}
					});
				}
			});

	btn2Players.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			
			frame.getContentPane().remove(playerOption);

			frame.getContentPane().remove(btn2Players);
			frame.getContentPane().remove(btn1Player);
					

					JLabel lblp1turn = new JLabel("Player 1 Turn");
					lblp1turn.setFont(new Font("Tahoma", Font.PLAIN, 36));
					lblp1turn.setBounds(180, 50, 500, 60);
					frame.getContentPane().add(lblp1turn);
					frame.revalidate();
					frame.repaint();

					JLabel lblp2turn = new JLabel("Player 2 Turn");
					lblp2turn.setFont(new Font("Tahoma", Font.PLAIN, 36));
					lblp2turn.setBounds(180, 50, 500, 60);
					frame.revalidate();
					frame.repaint();

					JButton btn1 = new JButton("");
					btn1.setBounds(56, 143, 141, 141);
					frame.getContentPane().add(btn1);

					JButton btn2 = new JButton("");
					btn2.setBounds(220, 143, 141, 141);
					frame.getContentPane().add(btn2);

					JButton btn3 = new JButton("");
					btn3.setBounds(385, 143, 141, 141);
					frame.getContentPane().add(btn3);

					JButton btn4 = new JButton("");
					btn4.setBounds(56, 305, 141, 141);
					frame.getContentPane().add(btn4);

					JButton btn5 = new JButton("");
					btn5.setBounds(220, 305, 141, 141);
					frame.getContentPane().add(btn5);

					JButton btn6 = new JButton("");
					btn6.setBounds(385, 305, 141, 141);
					frame.getContentPane().add(btn6);

					JButton btn7 = new JButton("");
					btn7.setBounds(56, 467, 141, 141);
					frame.getContentPane().add(btn7);

					JButton btn8 = new JButton("");
					btn8.setBounds(220, 467, 141, 141);
					frame.getContentPane().add(btn8);

					JButton btn9 = new JButton("");
					btn9.setBounds(385, 467, 141, 141);
					frame.getContentPane().add(btn9);

					frame.revalidate();
					frame.repaint();

					JLabel lblhasWinner1 = new JLabel("Player 1 Wins!");
					JLabel lblhasWinner2 = new JLabel("Player 2 Wins!");
					JLabel lbltie = new JLabel("Tie Game!");
					frame.revalidate();
					frame.repaint();

					btn1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {

							if (turn % 2 != 0 && btnclick1 == false) {
								btn1.setText("X"); 
								btn1.setForeground(Color.RED);
								btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick1 = true;
								topleftV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();

							} else if (btnclick1 == false) {
								btn1.setText("O"); 
								btn1.setForeground(Color.GREEN);
								btn1.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick1 = true;
								topleftV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();

							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								}

								else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}

							}
						}

					});

					btn2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick2 == false) {
								btn2.setText("X"); 
								btn2.setForeground(Color.RED);
								btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick2 = true;
								topmidV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick2 == false) {
								btn2.setText("O"); 
								btn2.setForeground(Color.GREEN);
								btn2.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick2 = true;
								topmidV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}

							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick3 == false) {
								btn3.setText("X"); 
								btn3.setForeground(Color.RED);
								btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick3 = true;
								toprightV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick3 == false) {
								btn3.setText("O"); 
								btn3.setForeground(Color.GREEN);
								btn3.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick3 = true;
								toprightV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick4 == false) {
								btn4.setText("X"); 
								btn4.setForeground(Color.RED);
								btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick4 = true;
								midleftV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick4 == false) {
								btn4.setText("O"); 
								btn4.setForeground(Color.GREEN);
								btn4.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick4 = true;
								midleftV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick5 == false) {
								btn5.setText("X"); 
								btn5.setForeground(Color.RED);
								btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick5 = true;
								midmidV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick5 == false) {
								btn5.setText("O"); 
								btn5.setForeground(Color.GREEN);
								btn5.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick5 = true;
								midmidV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn6.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick6 == false) {
								btn6.setText("X"); 
								btn6.setForeground(Color.RED);
								btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick6 = true;
								midrightV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick6 == false) {
								btn6.setText("O"); 
								btn6.setForeground(Color.GREEN);
								btn6.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick6 = true;
								midrightV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn7.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick7 == false) {
								btn7.setText("X"); 
								btn7.setForeground(Color.RED);
								btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick7 = true;
								botleftV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick7 == false) {
								btn7.setText("O"); 
								btn7.setForeground(Color.GREEN);
								btn7.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick7 = true;
								botleftV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn8.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick8 == false) {
								btn8.setText("X"); 
								btn8.setForeground(Color.RED);
								btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick8 = true;
								botmidV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick8 == false) {
								btn8.setText("O"); 
								btn8.setForeground(Color.GREEN);
								btn8.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick8 = true;
								botmidV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5) {
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
							}
						}
					});

					btn9.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							if (turn % 2 != 0 && btnclick9 == false) {
								btn9.setText("X"); 
								btn9.setForeground(Color.RED);
								btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick9 = true;
								botrightV = 1;

								frame.getContentPane().remove(lblp1turn);
								frame.getContentPane().add(lblp2turn);
								frame.revalidate();
								frame.repaint();
							} else if (btnclick9 == false) {
								btn9.setText("O"); 
								btn9.setForeground(Color.GREEN);
								btn9.setFont(new Font("Tahoma", Font.BOLD, 120));
								turn++;
								btnclick9 = true;
								botrightV = 2;

								frame.getContentPane().remove(lblp2turn);
								frame.getContentPane().add(lblp1turn);
								frame.revalidate();
								frame.repaint();
							}
							if (turn >= 5)
								if ((topleftV == 1 && topmidV == 1 && toprightV == 1) || (midleftV == 1 && midmidV == 1 && midrightV == 1)
										|| (botleftV == 1 && botmidV == 1 && botrightV == 1) || (topleftV == 1 && midleftV == 1 && botleftV == 1)
										|| (topmidV == 1 && midmidV == 1 && botmidV == 1) || (toprightV == 1 && midrightV == 1 && botrightV == 1)
										|| (topleftV == 1 && midmidV == 1 && botrightV == 1) || (toprightV == 1 && midmidV == 1 && botleftV == 1)) {
									frame.getContentPane().remove(lblp2turn);
									lblhasWinner1.setText("Player 1 Wins!");
									lblhasWinner1.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner1.setBounds(180, 50, 500, 60);
									frame.getContentPane().add(lblhasWinner1);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								} else if ((topleftV == 2 && topmidV == 2 && toprightV == 2) || (midleftV == 2 && midmidV == 2 && midrightV == 2)
										|| (botleftV == 2 && botmidV == 2 && botrightV == 2) || (topleftV == 2 && midleftV == 2 && botleftV == 2)
										|| (topmidV == 2 && midmidV == 2 && botmidV == 2) || (toprightV == 2 && midrightV == 2 && botrightV == 2)
										|| (topleftV == 2 && midmidV == 2 && botrightV == 2) || (toprightV == 2 && midmidV == 2 && botleftV == 2)) {
									frame.getContentPane().remove(lblp1turn);
									lblhasWinner2.setText("Player 2 Wins!");
									lblhasWinner2.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lblhasWinner2.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lblhasWinner2);
									frame.revalidate();
									frame.repaint();
									btnclick1 = btnclick2 = btnclick3 = btnclick4 = btnclick5 = btnclick6 = btnclick7 = btnclick8 = btnclick9 = true;
									
									frame.revalidate();
									frame.repaint();
								}

								else if (btnclick1 == true && btnclick2 == true && btnclick3 == true
										&& btnclick4 == true && btnclick5 == true && btnclick6 == true
										&& btnclick7 == true && btnclick8 == true && btnclick9 == true) {
									frame.getContentPane().remove(lblp2turn);
									lbltie.setText("Tie Game!");
									lbltie.setFont(new Font("Tahoma", Font.PLAIN, 36));
									lbltie.setBounds(20, 67, 500, 60);
									frame.getContentPane().add(lbltie);
									frame.revalidate();
									frame.repaint();
								}
						}
					});
				}
			});
		}
}