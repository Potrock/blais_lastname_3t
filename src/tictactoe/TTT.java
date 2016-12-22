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

    static char topleftV, topmidV, toprightV, midleftV, midmidV, midrightV, botleftV, botmidV, botrightV; //V for value :D
    static int currentPlayer = 1; //Player 1 = X, 2 = O
    boolean hasWinner; //Game ends if hasWinner = true
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
        frame.setBounds(100, 100, 600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Tic Tac Toe - Menu");
        frame.getContentPane().setLayout(null);

        JLabel playerOption = new JLabel("Welcome to Patrick and Dylan's Tic Tac Toe");
        playerOption.setForeground(Color.RED);
        playerOption.setFont(new Font("Tahoma", Font.PLAIN, 25));
        playerOption.setBounds(44, 81, 500, 79);
        frame.getContentPane().add(playerOption);

        JButton start = new JButton("Start!");
        start.setFont(new Font("Tahoma", Font.BOLD, 25));
        start.setForeground(Color.BLUE);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setLayout(new GridLayout(3, 3));
                frame.getContentPane().remove(playerOption);
                frame.getContentPane().remove(start);
                frame.setTitle("Tic Tac Toe - 2 Player Game");
                frame.revalidate();
                frame.repaint();
                
                frame.setTitle("Tic Tac Toe - It is X's turn!");


                /**
                 * Button Setup
                 */
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
                            topleft.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && topleftV == '\u0000') {
                            topleft.setText("O");
                            topleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            topleftV = 'O';
                            topleft.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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
                topleft.setBounds(56, 143, 141, 141);
                frame.getContentPane().add(topleft);

                JButton topmid = new JButton("");
                topmid.setBounds(220, 143, 141, 141);
                frame.getContentPane().add(topmid);
                topmid.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && topmidV == '\u0000') {
                            currentPlayer = 2;
                            topmid.setText("X");
                            topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            topmidV = 'X';
                            topmid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && topmidV == '\u0000') {
                            topmid.setText("O");
                            topmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            topmidV = 'O';
                            topmid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton topright = new JButton("");
                topright.setBounds(385, 143, 141, 141);
                frame.getContentPane().add(topright);
                topright.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && toprightV == '\u0000') {
                            currentPlayer = 2;
                            topright.setText("X");
                            topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            toprightV = 'X';
                            topright.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && toprightV == '\u0000') {
                            topright.setText("O");
                            topright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            toprightV = 'O';
                            topright.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton midleft = new JButton("");
                midleft.setBounds(56, 305, 141, 141);
                frame.getContentPane().add(midleft);
                midleft.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (currentPlayer == 1 && midleftV == '\u0000') {
                            currentPlayer = 2;
                            midleft.setText("X");
                            midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            midleftV = 'X';
                            midleft.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midleftV == '\u0000') {
                            midleft.setText("O");
                            midleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midleftV = 'O';
                            midleft.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton midmid = new JButton("");
                midmid.setBounds(220, 305, 141, 141);
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
                            midmid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midmidV == '\u0000') {
                            midmid.setText("O");
                            midmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midmidV = 'O';
                            midmid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton midright = new JButton("");
                midright.setBounds(385, 305, 141, 141);
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
                            midright.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && midrightV == '\u0000') {
                            midright.setText("O");
                            midright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            midrightV = 'O';
                            midright.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton botleft = new JButton("");
                botleft.setBounds(56, 467, 141, 141);
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
                            botleft.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botleftV == '\u0000') {
                            botleft.setText("O");
                            botleft.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botleftV = 'O';
                            botleft.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton botmid = new JButton("");
                botmid.setBounds(220, 467, 141, 141);
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
                            botmid.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botmidV == '\u0000') {
                            botmid.setText("O");
                            botmid.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botmidV = 'O';
                            botmid.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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
                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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

                JButton botright = new JButton("");
                botright.setBounds(385, 467, 141, 141);
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
                            botright.setForeground(Color.blue);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is O\'s Turn!");
                        } else if (currentPlayer == 2 && botrightV == '\u0000') {
                            botright.setText("O");
                            botright.setFont(new Font("Comic Sans", Font.PLAIN, 100));
                            frame.revalidate();
                            frame.repaint();
                            currentPlayer = 1;
                            botrightV = 'O';
                            botright.setForeground(Color.red);
                            turnCount++;
                            frame.setTitle("Tic Tac Toe - It is X\'s Turn!");
                        }
                        if (turnCount >= 5) {
                            if (topleftV == 'X' && topmidV == 'X' && toprightV == 'X' ||
                                midleftV == 'X' && midmidV == 'X' && midrightV == 'X' ||
                                botleftV == 'X' && botmidV == 'X' && botrightV == 'X' ||
                                topleftV == 'X' && midleftV == 'X' && botleftV == 'X' ||
                                topmidV == 'X' && midmidV == 'X' && botmidV == 'X' ||
                                toprightV == 'X' && midrightV == 'X' && botrightV == 'X' ||
                                toprightV == 'X' && midmidV == 'X' && botleftV == 'X' ||
                                topleftV == 'X' && midmidV == 'X' && botrightV == 'X') {
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

                            } else if (topleftV == 'O' && topmidV == 'O' && toprightV == 'O' ||
                                midleftV == 'O' && midmidV == 'O' && midrightV == 'O' ||
                                botleftV == 'O' && botmidV == 'O' && botrightV == 'O' ||
                                topleftV == 'O' && midleftV == 'O' && botleftV == 'O' ||
                                topmidV == 'O' && midmidV == 'O' && botmidV == 'O' ||
                                toprightV == 'O' && midrightV == 'O' && botrightV == 'O' ||
                                toprightV == 'O' && midmidV == 'O' && botleftV == 'O' ||
                                topleftV == 'O' && midmidV == 'O' && botrightV == 'O') {
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