package minibattleship;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiniBattleship {
	private static int[][] grid; // the 2D grid which holds the battleship
	private static int hitCount; 
	private static int missCount;
	private static int randomNum; // chooses a random number which will choose a random battleship board
	public static ImageIcon red;
	public static ImageIcon white;
	public static ImageIcon winMessage;
	public static ImageIcon loseMessage;
	private JFrame frame;
	private static JButton endMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		red = new ImageIcon("src/red.png");
		white = new ImageIcon("src/white.png");
		winMessage = new ImageIcon("src/winMessage1.png");
		loseMessage = new ImageIcon("src/loseMessage1.png");
		missCount = 0;
		hitCount = 0;
		random();
		newGrid();
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniBattleship window = new MiniBattleship();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				
			}
		});
	}
	/*This method chooses a random number between 1-18
	 * @return randomNum
	 */
	public static int random() {
		int min = 1;
		int max = 18;

		Random random = new Random();

		randomNum = random.nextInt(max + min) + min;

		return randomNum;
	

	}
	/* This method generates a random 4x4 grid that contains a 'ship'
	 * @param randomNum
	 * @return grid
	 */
	public static int[][] newGrid(){
		grid = new int [4][4];
		if(randomNum == 1) {
			grid[0] = new int [] {1, 0, 0, 0};
			grid[1] = new int [] {1, 0, 0, 0};
			grid[2] = new int [] {1, 0, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		
		if(randomNum == 2) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {1, 0, 0, 0};
			grid[2] = new int [] {1, 0, 0, 0};
			grid[3] = new int [] {1, 0, 0, 0};
		}
		
		if(randomNum == 3) {
			grid[0] = new int [] {0, 1, 0, 0};
			grid[1] = new int [] {0, 1, 0, 0};
			grid[2] = new int [] {0, 1, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		if(randomNum == 4) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 1, 0, 0};
			grid[2] = new int [] {0, 1, 0, 0};
			grid[3] = new int [] {0, 1, 0, 0};
		}
		
		if(randomNum == 5) {
			grid[0] = new int [] {0, 0, 1, 0};
			grid[1] = new int [] {0, 0, 1, 0};
			grid[2] = new int [] {0, 0, 1, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		
		if(randomNum == 6) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 1, 0};
			grid[2] = new int [] {0, 0, 1, 0};
			grid[3] = new int [] {0, 0, 1, 0};
		}
		
		if(randomNum == 7) {
			grid[0] = new int [] {0, 0, 0, 1};
			grid[1] = new int [] {0, 0, 0, 1};
			grid[2] = new int [] {0, 0, 0, 1};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		if(randomNum == 8) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 0, 1};
			grid[2] = new int [] {0, 0, 0, 1};
			grid[3] = new int [] {0, 0, 0, 1};
		}
		
		if(randomNum == 9) {
			grid[0] = new int [] {1, 1, 1, 0};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		
		if(randomNum == 10) {
			grid[0] = new int [] {0, 1, 1, 1};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		
		if(randomNum == 11) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {1, 1, 1, 0};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		if(randomNum == 12) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 1, 1, 1};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		if(randomNum == 13) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {1, 1, 1, 0};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		
		if(randomNum == 14) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {0, 1, 1, 1};
			grid[3] = new int [] {0, 0, 0, 0};
		}
		if(randomNum == 15) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {1, 1, 1, 0};
		}
		if(randomNum == 16) {
			grid[0] = new int [] {0, 0, 0, 0};
			grid[1] = new int [] {0, 0, 0, 0};
			grid[2] = new int [] {0, 0, 0, 0};
			grid[3] = new int [] {0, 1, 1, 1};
		}
		return grid;
		
	}
	/*This method checks how many 'hits' the user has had
	 * @return hitCount
	 */
	public static int hitCheck() {
		if(hitCount == 3) {
			endMessage.setIcon(winMessage);
		}
		return hitCount;
		
	}
	
	/*This method checks how many 'misses' the user has had
	 * @return missCount
	 */
	public static int missCheck() {
		if(missCount == 5) {
			endMessage.setIcon(loseMessage);
		}
		return missCount;
	}
	/**
	 * Create the application.
	 */
	public MiniBattleship() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 749, 537);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Battleship");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 23, 733, 34);
		frame.getContentPane().add(lblNewLabel);
		
		/*The buttons A1-D4 are buttons on the grid
		 * When the button is clicked, whether or not the ship is in that space is checked
		 */
		JButton a1 = 
				new JButton("");
		a1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[0][0]==1) {
					a1.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					a1.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		a1.setBounds(85, 105, 103, 79);
		frame.getContentPane().add(a1);
		
		JButton a2 = new JButton("");
		a2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[1][0]==1) {
					a2.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					a2.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		a2.setBounds(85, 185, 103, 79);
		frame.getContentPane().add(a2);
		
		JButton a3 = new JButton("");
		a3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[2][0]==1) {
					a3.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					a3.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		a3.setBounds(85, 263, 103, 79);
		frame.getContentPane().add(a3);
		
		JButton a4 = new JButton("");
		a4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[3][0]==1) {
					a4.setIcon(red);
					hitCount = hitCount +1;
					missCount = missCount +1;
					hitCheck();
				}
				else {
					a4.setIcon(white);
				}
			}
		});
		a4.setBounds(85, 340, 103, 79);
		frame.getContentPane().add(a4);
		
		JButton b1 = new JButton("");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[0][1]==1) {
					b1.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					b1.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		b1.setBounds(189, 105, 103, 79);
		frame.getContentPane().add(b1);
		
		JButton c1 = new JButton("");
		c1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[0][2]==1) {
					c1.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					c1.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		c1.setBounds(293, 105, 103, 79);
		frame.getContentPane().add(c1);
		
		JButton d1 = new JButton("");
		d1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[0][3]==1) {
					d1.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					d1.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		d1.setBounds(394, 105, 103, 79);
		frame.getContentPane().add(d1);
		
		JButton b2 = new JButton("");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[1][1]==1) {
					b2.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					b2.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		b2.setBounds(189, 185, 103, 79);
		frame.getContentPane().add(b2);
		
		JButton c2 = new JButton("");
		c2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[1][2]==1) {
					c2.setIcon(red);
					hitCount = hitCount +1; 
					hitCheck();
				}
				else {
					c2.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		c2.setBounds(293, 185, 103, 79);
		frame.getContentPane().add(c2);
		
		JButton d2 = new JButton("");
		d2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[1][3]==1) {
					d2.setIcon(red);
					hitCount = hitCount +1; 
					hitCheck();
				}
				else {
					d2.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		d2.setBounds(394, 185, 103, 79);
		frame.getContentPane().add(d2);
		
		JButton b3 = new JButton("");
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				if(grid[2][1]==1) {
					b3.setIcon(red);
					hitCount = hitCount +1; 
					hitCheck();
				}
				else {
					b3.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		b3.setBounds(189, 263, 103, 79);
		frame.getContentPane().add(b3);
		
		JButton c3 = new JButton("");
		c3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[2][2]==1) {
					c3.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					c3.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		c3.setBounds(293, 263, 103, 79);
		frame.getContentPane().add(c3);
		
		JButton d3 = new JButton("");
		d3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[2][3]==1) {
					d3.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					d3.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		d3.setBounds(394, 263, 103, 79);
		frame.getContentPane().add(d3);
		
		JButton b4 = new JButton("");
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[3][1]==1) {
					b4.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					b4.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		b4.setBounds(189, 340, 103, 79);
		frame.getContentPane().add(b4);
		
		JButton c4 = new JButton("");
		c4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[3][2]==1) {
					c4.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					c4.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		c4.setBounds(293, 340, 103, 79);
		frame.getContentPane().add(c4);
		
		JButton d4 = new JButton("");
		d4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(grid[3][3]==1) {
					d4.setIcon(red);
					hitCount = hitCount +1;
					hitCheck();
				}
				else {
					d4.setIcon(white);
					missCount = missCount +1;
					missCheck();
				}
			}
		});
		d4.setBounds(394, 340, 103, 79);
		frame.getContentPane().add(d4);
		
		JButton Quit = new JButton("Quit");
		Quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Quit.setBackground(Color.BLACK);
		Quit.setForeground(Color.RED);
		Quit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		Quit.setBounds(520, 464, 203, 23);
		frame.getContentPane().add(Quit);
		
		/* The play again button - resets grid, all buttons and variables
		 * 
		 */
		JButton btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.setBackground(Color.BLACK);
		btnPlayAgain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				a1.setIcon(null);
				a2.setIcon(null);
				a3.setIcon(null);
				a4.setIcon(null);
				b1.setIcon(null);
				b2.setIcon(null);
				b3.setIcon(null);
				b4.setIcon(null);
				c1.setIcon(null);
				c2.setIcon(null);
				c3.setIcon(null);
				c4.setIcon(null);
				d1.setIcon(null);
				d2.setIcon(null);
				d3.setIcon(null);
				d4.setIcon(null);
				endMessage.setIcon(null);;
				hitCount = 0;
				missCount = 0;
				random();
				newGrid();
				
				
			}
		});
		btnPlayAgain.setForeground(Color.GREEN);
		btnPlayAgain.setBounds(520, 430, 203, 23);
		frame.getContentPane().add(btnPlayAgain);
		
		endMessage = new JButton("");
		endMessage.setBounds(520, 105, 203, 314);
		frame.getContentPane().add(endMessage);
		
	}
}


