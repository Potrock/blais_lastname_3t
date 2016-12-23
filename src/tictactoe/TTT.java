package tictactoe;

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

public class TTT {
	
	/**
	 * Patrick and Dylan's Tic Tac Toe
	 * 
	 * A button was made for each of the 9 squares in tic tac toe.
	 * Every time you click one, it checks to see who you are playing as, and based on that will either set the text to your character, or will do nothing if it's already been set.
	 * After 5 turns, it begins to check for winners.
	 * It notifies you who's turn it is in the title of the window.
	 */

    static char topLeftV, topMidV, topRightV, midLeftV, midMidV, midRightV, botLeftV, botMidV, botRightV; //Setting up the values used to check for winners, and to prevent overriding the buttons.
    static int currentPlayer = 1; //Player 1 = X, 2 = O
    boolean hasWinner; //Game ends if hasWinner = true, it's also used to check for a tie after 9 turns.
    int turnCount = 0; //To only check for winner after 5 turns

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TTT window = new TTT();
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
    public TTT() {
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
        frame.setResizable(false); //Disables resizing, because unfortunately the menu page doesn't scale.
        frame.setBounds(100, 100, 600, 700); //Sets the size and location of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Tic Tac Toe - Menu");
        frame.getContentPane().setLayout(null);
        
        //New label for opening scene/
        JLabel playerOption = new JLabel("Welcome to Patrick and Dylan's Tic Tac Toe");
        playerOption.setForeground(Color.RED);
        playerOption.setFont(new Font("Tahoma", Font.PLAIN, 25));
        playerOption.setBounds(44, 81, 500, 79);
        frame.getContentPane().add(playerOption);
        
        //Start button to start game
        JButton start = new JButton("Start!");
        start.setFont(new Font("Tahoma", Font.BOLD, 25));
        start.setForeground(Color.BLUE);
        
        /*
         * Underneath this is where all of the game code is, it sets up all the buttons
         * and every time someone clicks one of them, an (almost) identical set of instructions is executed.
         * 
         * To show who's turn it is, the Window's Title changes based on the turn.
         * When someone wins, a dialogue box pops up saying who won, if you tie, a dialogue also shows up.
         * 
         * I'll comment line by line the first button (topLeft), because they are all pretty much the exact same, but with different variable names.
         */
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setLayout(new GridLayout(3, 3));//Sets the layout for the game
                frame.getContentPane().remove(playerOption);//Removes the buttons
                frame.getContentPane().remove(start);
                frame.setTitle("Tic Tac Toe - 2 Player Game");//Sets new title
                frame.revalidate();
                frame.repaint();//Housekeeping
                
                frame.setTitle("Tic Tac Toe - It is X's turn!"); //Starts the game on X's turn

                /**
                 * Button Setup
                 */
                currentPlayer = 1;
                JButton topLeft = new JButton("");
                topLeft.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && topLeftV == '\u0000') { //Checks if it's X's turn (1) and that the value of topLeft is null(unset)
                            currentPlayer = 2; //Starts off immediately by setting up the next turn, changing currentPlayer to 2 (O)
                            topLeft.setText("X"); //Sets the button text to X (frontend)
                            topLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100)); //Gotta make the text look good
                            frame.revalidate();
                            frame.repaint(); // Housekeeping
                            topLeftV = 'X'; //Sets the button value to X (to check for wins and to prevent it being overwritten)
                            topLeft.setForeground(Color.blue);
                            turnCount++; //Increases turncount by 1 (Used below for win check and tie check)
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!"); //Tells you it is now O's turn in the title
                            
                        } else if (currentPlayer == 2 && topLeftV == '\u0000') { //Checksif it's O's turn (2) and that topLeft hasn't been set already
                            topLeft.setText("O"); //Sets the text to O (frontend)
                            topLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100)); //Text setup
                            frame.revalidate();
                            frame.repaint(); // Housekeeping
                            currentPlayer = 1; //Sets current player to 1 in preparation for next turn
                            topLeftV = 'O'; //Sets value of topLeft 
                            topLeft.setForeground(Color.red); //Text setup
                            turnCount++; //Increases turn count by 1 for win/tie check
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!"); //Changes titles to notify user that it's now X's turn.
                        }
                        if (turnCount >= 5) { //Only checks for a win if there have been 5 or more turns, because instructions
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' || //Each of this if statement is a different win possibility, there are a total of 8 (6 Lines, 2 Diagonals)
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!"); //If any of the above is true, X has won, and this shows a popup.
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll(); //Waits, then locks up the board.
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!"); //If any of the above is true, O has won, and this shows a popup.
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll(); //Waits, then locks up the board.
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (turnCount == 9 && hasWinner == false) { //If there has been 9 turns (number of spots on the board) and nobody has won yet, it's a tie!
                                JOptionPane.showMessageDialog(null, "You tied!"); //Shows a popup saying it's a tie.
                            }


                        }
                    }
                });
                topLeft.setBounds(56, 143, 141, 141); //Boundary setup for the button.
                frame.getContentPane().add(topLeft);
                
                /**
                 * This is repeated another 8 times for the rest of the buttons, all of them are named using a row-Column naming scheme. For topLeft, it's top row, left column.
                 */

                JButton topMid = new JButton("");
                topMid.setBounds(220, 143, 141, 141);
                frame.getContentPane().add(topMid);
                topMid.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && topMidV == '\u0000') {
                            currentPlayer = 2;
                            topMid.setText("X");
                            topMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            topMidV = 'X';
                            topMid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && topMidV == '\u0000') {
                            topMid.setText("O");
                            topMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            topMidV = 'O';
                            topMid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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
                    }
                });

                JButton topRight = new JButton("");
                topRight.setBounds(385, 143, 141, 141);
                frame.getContentPane().add(topRight);
                topRight.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && topRightV == '\u0000') {
                            currentPlayer = 2;
                            topRight.setText("X");
                            topRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            topRightV = 'X';
                            topRight.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && topRightV == '\u0000') {
                            topRight.setText("O");
                            topRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            topRightV = 'O';
                            topRight.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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
                    }
                });

                JButton midLeft = new JButton("");
                midLeft.setBounds(56, 305, 141, 141);
                frame.getContentPane().add(midLeft);
                midLeft.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && midLeftV == '\u0000') {
                            currentPlayer = 2;
                            midLeft.setText("X");
                            midLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            midLeftV = 'X';
                            midLeft.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midLeftV == '\u0000') {
                            midLeft.setText("O");
                            midLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midLeftV = 'O';
                            midLeft.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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

                    }
                });

                JButton midMid = new JButton("");
                midMid.setBounds(220, 305, 141, 141);
                frame.getContentPane().add(midMid);
                midMid.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && midMidV == '\u0000') {
                            currentPlayer = 2;
                            midMid.setText("X");
                            midMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            midMidV = 'X';
                            midMid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midMidV == '\u0000') {
                            midMid.setText("O");
                            midMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midMidV = 'O';
                            midMid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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

                    }
                });

                JButton midRight = new JButton("");
                midRight.setBounds(385, 305, 141, 141);
                frame.getContentPane().add(midRight);
                midRight.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && midRightV == '\u0000') {
                            currentPlayer = 2;
                            midRight.setText("X");
                            midRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            midRightV = 'X';
                            midRight.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midRightV == '\u0000') {
                            midRight.setText("O");
                            midRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midRightV = 'O';
                            midRight.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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

                    }
                });

                JButton botLeft = new JButton("");
                botLeft.setBounds(56, 467, 141, 141);
                frame.getContentPane().add(botLeft);
                botLeft.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && botLeftV == '\u0000') {
                            currentPlayer = 2;
                            botLeft.setText("X");
                            botLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            botLeftV = 'X';
                            botLeft.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botLeftV == '\u0000') {
                            botLeft.setText("O");
                            botLeft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botLeftV = 'O';
                            botLeft.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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
                    }
                });

                JButton botMid = new JButton("");
                botMid.setBounds(220, 467, 141, 141);
                frame.getContentPane().add(botMid);
                botMid.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && botMidV == '\u0000') {
                            currentPlayer = 2;
                            botMid.setText("X");
                            botMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            botMidV = 'X';
                            botMid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botMidV == '\u0000') {
                            botMid.setText("O");
                            botMid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botMidV = 'O';
                            botMid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();
                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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
                    }
                });

                JButton botRight = new JButton("");
                botRight.setBounds(385, 467, 141, 141);
                frame.getContentPane().add(botRight);
                botRight.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && botRightV == '\u0000') {
                            currentPlayer = 2;
                            botRight.setText("X");
                            botRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            botRightV = 'X';
                            botRight.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botRightV == '\u0000') {
                            botRight.setText("O");
                            botRight.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botRightV = 'O';
                            botRight.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topLeftV == 'X' && topMidV == 'X' && topRightV == 'X' ||
                                midLeftV == 'X' && midMidV == 'X' && midRightV == 'X' ||
                                botLeftV == 'X' && botMidV == 'X' && botRightV == 'X' ||
                                topLeftV == 'X' && midLeftV == 'X' && botLeftV == 'X' ||
                                topMidV == 'X' && midMidV == 'X' && botMidV == 'X' ||
                                topRightV == 'X' && midRightV == 'X' && botRightV == 'X' ||
                                topRightV == 'X' && midMidV == 'X' && botLeftV == 'X' ||
                                topLeftV == 'X' && midMidV == 'X' && botRightV == 'X') {
                                JOptionPane.showMessageDialog(null, "Player X has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
                                    Thread.currentThread().interrupt();
                                }
                                frame.removeAll();
                                frame.repaint();
                                frame.revalidate();
                                initialize();

                            } else if (topLeftV == 'O' && topMidV == 'O' && topRightV == 'O' ||
                                midLeftV == 'O' && midMidV == 'O' && midRightV == 'O' ||
                                botLeftV == 'O' && botMidV == 'O' && botRightV == 'O' ||
                                topLeftV == 'O' && midLeftV == 'O' && botLeftV == 'O' ||
                                topMidV == 'O' && midMidV == 'O' && botMidV == 'O' ||
                                topRightV == 'O' && midRightV == 'O' && botRightV == 'O' ||
                                topRightV == 'O' && midMidV == 'O' && botLeftV == 'O' ||
                                topLeftV == 'O' && midMidV == 'O' && botRightV == 'O') {
                                JOptionPane.showMessageDialog(null, "Player O has won!");
                                hasWinner = true;
                                try {
                                    Thread.sleep(3000);
                                } catch (InterruptedException ex) {
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
                    }
                });
                frame.revalidate();
                frame.repaint();
            }
        });
        start.setBounds(175, 224, 224, 160);
        frame.getContentPane().add(start);


    }

}