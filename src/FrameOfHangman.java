import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FrameOfHangman {
	// hidden vocabulary
	static String choosenVoc;
	static String hint;

	// checks user's answer to question came from Questions class
	static boolean answer;

	// creates objects to choose word according to levels
	static EASY EASY = new EASY();
	static INTERMEDIATE INTERMEDIATE = new INTERMEDIATE();
	static HARDEST HARDEST = new HARDEST();

	// holds level and category names
	static String level = null;
	static String category = null;

	// list which holds guessed letters from user
	static List<Character> playersGuess = new ArrayList<>();

	// to not create more than one frame
	static JFrame frame = new JFrame();

	// holds wrong letter guess
	static int wrong_count = 0;

	// holds how many times guess button pressed
	static int count = 0;

	// guessed letter
	static char letter;

	public static void main(String[] args) {

		// create swing frame
		frame.setTitle("HANGMAN");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(2000, 800);
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		panel.setLayout(null);
		// create menu label
		JLabel label = new JLabel();
		label.setText("HANGMAN");
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Showcard Gothic", Font.BOLD, 100));
		label.setBackground(Color.white);
		label.setBounds(480, 109, 600, 250);
		panel.setBackground(new Color(255, 185, 15));
		label.setForeground(Color.black);

		panel.add(label);

		// create start button
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);

		JButton button = new JButton();
		button.setBounds(645, 100, 200, 50);
		button.setText("START GAME");
		button.setFont(new Font("Tahomo", Font.PLAIN, 30));
		button.setSize(250, 50);
		button.setFocusable(false);
		button.setForeground(new Color(255, 185, 15));
		button.setBackground(Color.black);
		Color borderColor = new Color(255, 185, 15); // Change to the desired color
		button.setBorder(new LineBorder(borderColor));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create_levels();
			}
		});

		// Add hover effect
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setForeground(Color.white);
				button.setBorder(new LineBorder(Color.white));
				button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				button.setForeground(new Color(255, 185, 15));
				button.setBorder(new LineBorder(borderColor));
				button.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				button.setForeground(Color.gray);
				button.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				button.setForeground(new Color(255, 185, 15));
				button.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});
		panel2.setSize(2000, 400);
		panel2.setBackground(Color.black);
		panel2.add(button);
		container.add(panel);
		container.add(panel2);
		frame.add(container);

		frame.setVisible(true);
	}

	public static void create_levels() {

		// create the panel

		JPanel panel = new JPanel(null);
		JLabel label = new JLabel();
		label.setText("CHOOSE A DIFFICULTY");
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Georgia", Font.PLAIN, 50));
		label.setBackground(Color.white);
		label.setBounds(400, 50, 800, 100);
		panel.setBackground(new Color(255, 185, 15));
		label.setForeground(Color.white);

		// Create a border for the label
		Border labelBorder = BorderFactory.createLineBorder(new Color(255, 185, 15), 2);
		label.setBorder(labelBorder);

		panel.add(label, BorderLayout.CENTER);
		// create easy button
		JButton easy = new JButton("EASY");
		easy.setBounds(675, 250, 200, 50);
		easy.setFont(new Font("Tahomo", Font.PLAIN, 40));
		easy.setSize(200, 50);
		easy.setFocusable(false);
		easy.setBackground(new Color(255, 185, 15));
		easy.setForeground(Color.black);
		Color borderColor = Color.black; // Change to the desired color
		easy.setBorder(new LineBorder(borderColor));
		easy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				level = "EASY";
				create_categories();
			}
		});
		easy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				easy.setForeground(Color.white);
				easy.setBorder(new LineBorder(Color.white));
				easy.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				easy.setForeground(Color.black);
				easy.setBorder(new LineBorder(borderColor));
				easy.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		easy.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				easy.setForeground(Color.gray);
				easy.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				easy.setForeground(Color.black);
				easy.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});
		panel.add(easy);

		// create intermediate button
		JButton intermediate = new JButton("INTERMEDIATE");
		intermediate.setBounds(600, 350, 200, 50);
		intermediate.setFont(new Font("Tahomo", Font.PLAIN, 40));
		intermediate.setSize(375, 50);
		intermediate.setFocusable(false);
		intermediate.setBackground(new Color(255, 185, 15));
		intermediate.setForeground(Color.black);
		intermediate.setBorder(new LineBorder(borderColor));
		intermediate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				level = "INTERMEDIATE";
				create_categories();
			}
		});
		intermediate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				intermediate.setForeground(Color.white);
				intermediate.setBorder(new LineBorder(Color.white));
				intermediate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				intermediate.setForeground(Color.black);
				intermediate.setBorder(new LineBorder(borderColor));
				intermediate.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		intermediate.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				intermediate.setForeground(Color.gray);
				intermediate.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				intermediate.setForeground(Color.black);
				intermediate.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});
		panel.add(intermediate);

		// create hard button
		JButton hard = new JButton("HARD");
		hard.setBounds(675, 450, 200, 50);
		hard.setFont(new Font("Tahomo", Font.PLAIN, 40));
		hard.setSize(200, 50);
		hard.setFocusable(false);
		hard.setBackground(new Color(255, 185, 15));
		hard.setForeground(Color.black);
		hard.setBorder(new LineBorder(borderColor));

		hard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				level = "HARD";
				create_categories();
			}
		});
		hard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hard.setForeground(Color.white);
				hard.setBorder(new LineBorder(Color.white));
				hard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hard.setForeground(Color.black);
				hard.setBorder(new LineBorder(borderColor));
				hard.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		hard.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				hard.setForeground(Color.gray);
				hard.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				hard.setForeground(Color.black);
				hard.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});
		panel.add(hard);

		frame.setContentPane(panel);
		frame.getContentPane().setBackground(Color.black);

		// resets frame
		frame.revalidate();
		frame.repaint();
	}

	public static void create_categories() {

		// create panel
		JPanel panel = new JPanel(null);

		// create label
		JLabel label = new JLabel();
		label.setText("CHOOSE A CATEGORY");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setFont(new Font("Georgia", Font.PLAIN, 50));
		label.setBackground(Color.white);
		label.setBounds(400, 50, 800, 100);
		panel.setBackground(new Color(0, 0, 0));
		label.setForeground(Color.white);
		label.setHorizontalAlignment(JLabel.CENTER);
		//panel.add(label);
		
		Border labelBorder = BorderFactory.createLineBorder(new Color(255, 185, 15), 2);
		label.setBorder(labelBorder);

		panel.add(label, BorderLayout.CENTER);
		
		// create city and country button
		JButton cities_countries = new JButton();
		cities_countries.setBounds(400, 350, 200, 50);
		cities_countries.setText("Cities/Countries");
		cities_countries.setFont(new Font("Tahomo", Font.PLAIN, 30));
		cities_countries.setSize(320, 80);
		cities_countries.setFocusable(false);
		cities_countries.setBackground(new Color(0, 0, 0));
		cities_countries.setForeground(Color.white);
		Color borderColor = new Color(255, 185, 15);
		cities_countries.setBorder(new LineBorder(borderColor));
		
		
		

		// Add hover effect
		cities_countries.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cities_countries.setForeground(Color.white);
				cities_countries.setBorder(new LineBorder(Color.white));
				cities_countries.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				cities_countries.setForeground(new Color(255, 255, 255));
				cities_countries.setBorder(new LineBorder(borderColor));
				cities_countries.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		cities_countries.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				cities_countries.setForeground(Color.gray);
				cities_countries.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				cities_countries.setForeground(new Color(255, 185, 15));
				cities_countries.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});

		
		cities_countries.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				category = "Cities/Countries";
				switch (level) {
				case "EASY":
					choosenVoc = EASY.selectCities_Countries();
					break;
				case "INTERMEDIATE":
					choosenVoc = INTERMEDIATE.selectCities_Countries();
					break;
				case "HARD":
					choosenVoc = HARDEST.selectCities_Countries();
					break;
				}
				Letters();
			}
		});
		panel.add(cities_countries);

		// create football team button
		JButton footballTeams = new JButton();
		footballTeams.setBounds(400, 450, 200, 50);
		footballTeams.setText("Football Teams");
		footballTeams.setFont(new Font("Tahomo", Font.PLAIN, 30));
		footballTeams.setSize(320, 80);
		footballTeams.setFocusable(false);
		footballTeams.setBackground(new Color(0, 0, 0));
		footballTeams.setForeground(Color.white);
		Color borderColorF = new Color(255, 185, 15);
		footballTeams.setBorder(new LineBorder(borderColorF));
		
		
		

		// Add hover effect
		footballTeams.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				footballTeams.setForeground(Color.white);
				footballTeams.setBorder(new LineBorder(Color.white));
				footballTeams.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				footballTeams.setForeground(new Color(255, 255, 255));
				footballTeams.setBorder(new LineBorder(borderColorF));
				footballTeams.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		footballTeams.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				footballTeams.setForeground(Color.gray);
				footballTeams.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				footballTeams.setForeground(new Color(255, 185, 15));
				footballTeams.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});

		
		
		footballTeams.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				category = "Football Teams";
				switch (level) {
				case "EASY":
					choosenVoc = EASY.selectFootballTeams();
					break;
				case "INTERMEDIATE":
					choosenVoc = INTERMEDIATE.selectFootballTeams();
					break;
				case "HARD":
					choosenVoc = HARDEST.selectFootballTeams();
					break;
				}
				Letters();
			}
		});
		panel.add(footballTeams);

		// create car brand button
		JButton carBrands = new JButton();
		carBrands.setBounds(800, 350, 200, 50);
		carBrands.setText("Car Brands");
		carBrands.setFont(new Font("Tahomo", Font.PLAIN, 30));
		carBrands.setSize(320, 80);
		carBrands.setFocusable(false);
		carBrands.setBackground(new Color(0, 0, 0));
		carBrands.setForeground(Color.white);
		Color borderColorC = new Color(255, 185, 15);
		carBrands.setBorder(new LineBorder(borderColorC));
		
		
		

		// Add hover effect
		carBrands.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				carBrands.setForeground(Color.white);
				carBrands.setBorder(new LineBorder(Color.white));
				carBrands.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				carBrands.setForeground(new Color(255, 255, 255));
				carBrands.setBorder(new LineBorder(borderColorC));
				carBrands.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		carBrands.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				carBrands.setForeground(Color.gray);
				carBrands.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				carBrands.setForeground(new Color(255, 185, 15));
				carBrands.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});

		
		
		carBrands.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				category = "Car Brands";
				switch (level) {
				case "EASY":
					choosenVoc = EASY.selectCarBrands();
					break;
				case "INTERMEDIATE":
					choosenVoc = INTERMEDIATE.selectCarBrands();
					break;
				case "HARD":
					choosenVoc = HARDEST.selectCarBrands();
					break;
				}
				Letters();
			}
		});
		panel.add(carBrands);


		// create goods button
		JButton goods = new JButton();
		goods.setBounds(800, 450, 200, 50);
		goods.setText("Goods");
		goods.setFont(new Font("Tahomo", Font.PLAIN, 30));
		goods.setSize(320, 80);
		goods.setFocusable(false);
		goods.setBackground(new Color(0, 0, 0));
		goods.setForeground(Color.white);
		Color borderColorG = new Color(255, 185, 15);
		goods.setBorder(new LineBorder(borderColorG));
		
		
		

		// Add hover effect
		goods.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				goods.setForeground(Color.white);
				goods.setBorder(new LineBorder(Color.white));
				goods.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				goods.setForeground(new Color(255, 255, 255));
				goods.setBorder(new LineBorder(borderColorG));
				goods.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		goods.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				goods.setForeground(Color.gray);
				goods.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				goods.setForeground(new Color(255, 185, 15));
				goods.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});

		
		
		goods.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				category = "Goods";
				switch (level) {
				case "EASY":
					choosenVoc = EASY.selectGoods();
					break;
				case "INTERMEDIATE":
					choosenVoc = INTERMEDIATE.selectGoods();
					break;
				case "HARD":
					choosenVoc = HARDEST.selectGoods();
					break;
				}
				Letters();
			}
		});
		panel.add(goods);

		frame.setContentPane(panel);
		frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0));
		// resets frame
		frame.revalidate();
		frame.repaint();
	}

	public static void Letters() {
		// create panel
		JPanel panel = new JPanel(null);

		// create hint button
		JButton Hint = new JButton();
		Hint.setBounds(250, 150, 990, 350);
		Hint.setText("HINT");
		Hint.setFont(new Font("Tahomo", Font.BOLD, 20));
		Hint.setSize(170, 50);
		Hint.setFocusable(false);
		Hint.setBackground(new Color(255, 185, 15));
		Hint.setForeground(Color.black);
		
		Color borderColorH = new Color(0, 0, 0);
		Hint.setBorder(new LineBorder(borderColorH));
		
		

		// Add hover effect
		Hint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Hint.setForeground(Color.white);
				Hint.setBorder(new LineBorder(Color.white));
				Hint.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Hint.setForeground(new Color(0, 0, 0));
				Hint.setBorder(new LineBorder(borderColorH));
				Hint.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		Hint.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Hint.setForeground(Color.gray);
				Hint.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Hint.setForeground(new Color(255, 185, 15));
				Hint.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});

		
		Hint.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// create a hint in correct category and in correct difficulty
				switch (category) {
				case "Cities/Countries":
					switch (level) {
					case "EASY":
						hint = EASY.selectHintCities_Countries();
						break;
					case "INTERMEDIATE":
						hint = INTERMEDIATE.selectHintCities_Countries();
						break;
					case "HARD":
						hint = HARDEST.selectHintCities_Countries();
						break;
					}
					break;
				case "Football Teams":
					switch (level) {
					case "EASY":
						hint = EASY.selectHintFootballTeams();
						break;
					case "INTERMEDIATE":
						hint = INTERMEDIATE.selectHintFootballTeams();
						break;
					case "HARD":
						hint = HARDEST.selectHintFootballTeams();
						break;
					}
					break;

				case "Car Brands":
					switch (level) {
					case "EASY":
						hint = EASY.selectHintCarBrands();
						break;
					case "INTERMEDIATE":
						hint = INTERMEDIATE.selectHintCarBrands();
						break;
					case "HARD":
						hint = HARDEST.selectHintCarBrands();
						break;
					}
					break;

				case "Goods":
					switch (level) {
					case "EASY":
						hint = EASY.selectHintGoods();
						break;
					case "INTERMEDIATE":
						hint = INTERMEDIATE.selectHintGoods();
						break;
					case "HARD":
						hint = HARDEST.selectHintGoods();
						break;
					}
					break;
				}
				hints();
				Letters();
			}

		});
		panel.add(Hint);
		

		// create Character button
		JButton Character = new JButton();
		Character.setBounds(50, 150, 990, 350);
		Character.setText("CHARACTER");
		Character.setFont(new Font("Tahomo", Font.BOLD, 20));
		Character.setSize(170, 50);
		Character.setFocusable(false);
		Character.setBackground(new Color(255, 185, 15));
		Character.setForeground(Color.black);
		
		Color borderColorCh = new Color(0, 0, 0);
		Character.setBorder(new LineBorder(borderColorCh));
		
		

		// Add hover effect
		Character.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Character.setForeground(Color.white);
				Character.setBorder(new LineBorder(Color.white));
				Character.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Character.setForeground(new Color(0, 0, 0));
				Character.setBorder(new LineBorder(borderColorCh));
				Character.setCursor(Cursor.getDefaultCursor());

			}
		});

		// Add click effect
		Character.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Character.setForeground(Color.gray);
				Character.setBorder(new LineBorder(Color.gray));
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				Character.setForeground(new Color(255, 185, 15));
				Character.setBorder(new LineBorder(new Color(255, 185, 15)));
			}
		});
		Character.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// gives a random letter which haven't guessed
				giveLetter(choosenVoc, playersGuess);
				// shows winning situation
				make_a_guess(letter);
			}
		});
		panel.add(Character);

		// create guess button
		JButton Guess = new JButton();
		Guess.setBounds(450, 150, 990, 350);
		Guess.setText("GUESS");
		Guess.setFont(new Font("Tahomo", Font.BOLD, 20));
		Guess.setSize(170, 50);
		Guess.setFocusable(false);
		Guess.setBackground(new Color(255, 185, 15));
		Guess.setForeground(Color.black);
		
		Color borderColorGu = new Color(0, 0, 0);
		Guess.setBorder(new LineBorder(borderColorGu));
		
		

		// Add hover effect
		Guess.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Guess.setForeground(Color.white);
				Guess.setBorder(new LineBorder(Color.white));
				Guess.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Guess.setForeground(new Color(0, 0, 0));
				Guess.setBorder(new LineBorder(borderColorGu));
				Guess.setCursor(Cursor.getDefaultCursor());

			}
		});
		Guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (count < 2) {
					count++;
					guessVoc();
				} else {
					JOptionPane.showMessageDialog(null, "You can't guess no more");
				}
			}
		});
		panel.add(Guess);

		// create question button
		JButton Question = new JButton("QUESTION");
		Question.setBounds(650, 150, 350, 350);
		Question.setFont(new Font("Tahomo", Font.BOLD , 20));
		Question.setSize(170, 50);
		Question.setBackground(new Color(255, 185, 15));
		Question.setForeground(Color.black);
		
		Color borderColorQ = new Color(0, 0, 0);
		Question.setBorder(new LineBorder(borderColorQ));
		
		

		// Add hover effect
		Question.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Question.setForeground(Color.white);
				Question.setBorder(new LineBorder(Color.white));
				Question.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

			}

			@Override
			public void mouseExited(MouseEvent e) {
				Question.setForeground(new Color(0, 0, 0));
				Question.setBorder(new LineBorder(borderColorQ));
				Question.setCursor(Cursor.getDefaultCursor());

			}
		});
		Question.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getAquestion();
			}
		});
		panel.add(Question);

		// create gold image
		JLabel goldImage = new JLabel("");
		String imagePath = "src/gold.png";
		goldImage.setIcon(new ImageIcon(imagePath));
		goldImage.setLabelFor(frame);
		goldImage.setBounds(20, 25, 65, 61);
		panel.add(goldImage);
		// Create gold text
		JTextArea gold = new JTextArea();
		gold.setText(String.valueOf("Gold :" + Categories.gold));
		gold.setForeground(new Color(255, 185, 15));
		gold.setFont(new Font("Tahomo", Font.BOLD, 30));
		gold.setBackground(Color.white);
		gold.setBounds(95, 40, 350, 350);
		gold.setPreferredSize(new Dimension(200, 200));
		gold.setLineWrap(true);
		gold.setWrapStyleWord(true);
		gold.setOpaque(false);
		gold.setEditable(false);
		panel.add(gold);

		// create the keyboard
		String[] keys = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };

		for (int i = 0; i < keys.length; i++) {
			JButton button = new JButton();
			button.setBackground(new Color(255, 185, 15));
			button.setForeground(Color.black);
			
			Color borderColorB = new Color(0, 0, 0);
			button.setBorder(new LineBorder(borderColorB));

			

			// Add hover effect
			Guess.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					button.setForeground(Color.white);
					button.setBorder(new LineBorder(Color.white));
					button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

				}

				@Override
				public void mouseExited(MouseEvent e) {
					button.setForeground(new Color(0, 0, 0));
					button.setBorder(new LineBorder(borderColorB));
					button.setCursor(Cursor.getDefaultCursor());

				}
			});

			int keyboard_length = 13;
			if (i < keyboard_length)
				button.setBounds(50 + i * 60, 450, 990, 350);
			else
				button.setBounds(50 + (i - keyboard_length) * 60, 550, 990, 350);

			button.setText(keys[i]);
			button.setFont(new Font("Tahomo", Font.BOLD, 20));
			button.setSize(55, 55);
			button.setFocusable(false);
			final int index = i;
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					make_a_guess(keys[index].charAt(0));
				}
			});
			panel.add(button);
		}

		frame.setContentPane(panel);
		frame.getContentPane().setBackground(new java.awt.Color(255, 185, 15));
		// reset frame
		frame.revalidate();
		frame.repaint();

		// print the hangman and letters to the screen
		printVoc();
		printHangedman();
	}

	public static void hints() {
		// gets the chosen hint and arrange the gold amount
		if (Categories.gold > 1) {
			JOptionPane.showMessageDialog(null, "Hear your hint! " + "\n" + hint);
			--Categories.gold;
			--Categories.gold;
			Letters();

		}

		else {
			JOptionPane.showMessageDialog(null, "You don't have enough gold");

		}

	}

	public static void giveLetter(String voc, List<Character> playerGuesses) {
		// It checks if there are enough gold and accordingly puts a random letter on the screen in the positions it is in the vocabulary.

		if (Categories.gold != 0) {
			Random generator = new Random();
			do {
				int index = generator.nextInt(voc.length());
				letter = voc.charAt(index);
			} while (playerGuesses.contains(letter));
			playerGuesses.add(letter);
			--Categories.gold;
			Letters();
			printHangedman();
		} else {
			JOptionPane.showMessageDialog(null, "You don't have enough gold");
			printHangedman();

		}

	}

	public static void guessVoc() {

		// take the guess from the user through input dialog
		String sentence = JOptionPane.showInputDialog("Enter a full guess");

		String result;
		// checks the guess
		if (choosenVoc.equalsIgnoreCase(sentence)) {
			Categories.gold++;
			Categories.gold++;
			result = "CORRECT GUESS!" + "\n" + "You have " + Categories.gold + " gold.";
			JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.PLAIN_MESSAGE);
			Letters();
			printHangedman();

			JLabel situation1 = new JLabel();

			situation1.setText("YOU WIN !");
			situation1.setHorizontalTextPosition(JLabel.CENTER);
			situation1.setVerticalTextPosition(JLabel.TOP);
			situation1.setForeground(new Color(255, 185, 15));
			situation1.setFont(new Font("Tahomo", Font.BOLD, 35));
			situation1.setBackground(Color.white);
			situation1.setBounds(20, 20, 400, 763);
			frame.getContentPane().add(situation1);

			// after the game is over asks the user to continue or not.
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}

			int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			if (dialogButton == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "CONTINUE");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
				playersGuess.clear();
				wrong_count = 0;
				create_levels();

			} else {
				JOptionPane.showMessageDialog(null, "GOODBYE");
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
				System.exit(0);
			}
		} else {
			result = "WRONG GUESS!!";
			JOptionPane.showMessageDialog(null, result, "Massage", JOptionPane.ERROR_MESSAGE);
			Letters();
			printHangedman();
		}
	}

	public static void getAquestion() {
		// create a question
		Questions questions = new Questions();
		String question = questions.selectQuestion();

		// create message dialogue for question
		JOptionPane.showMessageDialog(null, "Here is your question " + "\n" + question);

		// get the answer to the question
		String sentence = JOptionPane.showInputDialog("Enter the answer");

		answer = questions.answersCorrect(sentence);
		if (answer) {
			Categories.gold++;
			JOptionPane.showMessageDialog(null, "Your answer is correct. 1 gold gained." + "\n" + "You have " + Categories.gold + " gold.");
			Letters();
			printHangedman();
		} else {
			JOptionPane.showMessageDialog(null, "Your answer is incorrect. No gold gained" + "\n" + "You have " + Categories.gold + " gold.");
			Letters();
			printHangedman();
		}
	}

	public static void make_a_guess(char guessingLetter) {

		// save the guess
		playersGuess.add(Character.toLowerCase(guessingLetter));

		// if the guess was correct
		if (choosenVoc.toLowerCase().contains(Character.toString(Character.toLowerCase(guessingLetter)))) {
			printVoc();
			// if the game is won
			if (is_game_won()) {

				// update the guessed letters
				Categories.gold++;
				Letters();

				JLabel situation1 = new JLabel();

				situation1.setText("YOU WIN !");
				situation1.setHorizontalTextPosition(JLabel.CENTER);
				situation1.setVerticalTextPosition(JLabel.TOP);
				situation1.setForeground(new Color(255, 185, 15));
				situation1.setFont(new Font("Georgia", Font.BOLD, 35));
				situation1.setBackground(Color.white);
				situation1.setBounds(20, 20, 400, 763);
				frame.getContentPane().add(situation1);

				// calls this method to update the hangman situation
				printHangedman();

				// after the game is over asks the user to continue or not.
				int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
				if (dialogButton == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "CONTINUE");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
					playersGuess.clear();
					wrong_count = 0;
					create_levels();

				} else {
					JOptionPane.showMessageDialog(null, "GOODBYE");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
					System.exit(0);
				}

				// restarts the frame
				frame.revalidate();
				frame.repaint();

			}

		}

		else {
			// if the guess was incorrect
			wrong_count++;
			Letters();
		}

		// if wrong guesses exceeded 6 then the game is over
		if (wrong_count == 6) {
			JLabel situation2 = new JLabel();

			situation2.setText("YOU LOSE !");
			situation2.setHorizontalTextPosition(JLabel.CENTER);
			situation2.setVerticalTextPosition(JLabel.TOP);
			situation2.setForeground(new Color(255, 185, 15));
			situation2.setFont(new Font("Georgia", Font.BOLD, 35));
			situation2.setBackground(Color.white);
			situation2.setBounds(20, 20, 400, 763);
			frame.getContentPane().add(situation2);

			// writes the played words original to the screen
			JLabel correctAnswer = new JLabel();
			correctAnswer.setText(choosenVoc);
			correctAnswer.setHorizontalTextPosition(JLabel.CENTER);
			correctAnswer.setVerticalTextPosition(JLabel.TOP);
			correctAnswer.setForeground(new Color(255, 185, 15));
			correctAnswer.setFont(new Font("Georgia", Font.BOLD, 32));
			correctAnswer.setBackground(Color.white);
			correctAnswer.setBounds(300, 20, 600, 763);
			frame.getContentPane().add(correctAnswer);

			// after the game is over asks the user to continue or not.

			int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to continue?");
			if (dialogButton == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "CONTINUE");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				playersGuess.clear();
				wrong_count = 0;
				create_levels();

			} else {
				JOptionPane.showMessageDialog(null, "GOODBYE");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
				System.exit(0);
			}
			// restarts the frame
			frame.revalidate();
			frame.repaint();
		}
	}

	private static void printHangedman() {
		// it shows the images that depend on wrong counter
		if (wrong_count == 0) {
			String imagePath1 = "src/img(1).png";
			JLabel img_1 = new JLabel("");
			img_1.setIcon(new ImageIcon(imagePath1));
			img_1.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_1);
		}

		if (wrong_count == 1) {
			JLabel img_2 = new JLabel("");
			String imagePath2 = "src/img(2).png";

			img_2.setIcon(new ImageIcon(imagePath2));
			img_2.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_2);
		}

		if (wrong_count == 2) {
			JLabel img_3 = new JLabel("");
			String imagePath3 = "src/img(3).png";
			img_3.setIcon(new ImageIcon(imagePath3));
			img_3.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_3);
		}

		if (wrong_count == 3) {
			JLabel img_4 = new JLabel("");
			String imagePath4 = "src/img(4).png";
			img_4.setIcon(new ImageIcon(imagePath4));
			img_4.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_4);
		}

		if (wrong_count == 4) {
			JLabel img_5 = new JLabel("");
			String imagePath5 = "src/img(5).png";

			img_5.setIcon(new ImageIcon(imagePath5));
			img_5.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_5);
		}

		if (wrong_count == 5) {
			JLabel img_6 = new JLabel("");
			String imagePath6 = "src/img(6).png";

			img_6.setIcon(new ImageIcon(imagePath6));
			img_6.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_6);
		}

		if (wrong_count == 6) {
			JLabel img_7 = new JLabel("");
			String imagePath7 = "src/img(7).png";
			img_7.setIcon(new ImageIcon(imagePath7));
			img_7.setBounds(450, 0, 5786, 800);
			frame.getContentPane().add(img_7);
		}

		frame.setVisible(true);
	}

	public static void printVoc() {
		// firstly it shows the lines in the screen then it fills up the letters in the right locations

		JPanel panel = (JPanel) frame.getContentPane();
		for (int a = 0; a <= choosenVoc.length(); a++) {
			JLabel line = new JLabel();
			for (int b = 0; b < a; b++) {
				if (playersGuess.contains(choosenVoc.charAt(b))) {
					line.setText(choosenVoc.charAt(b) + "");
				} else {
					if (choosenVoc.charAt(b) == ' ') {
						line.setText("  ");
					} else if (!(choosenVoc.charAt(b) == ' ')) {
						line.setText("_ ");
					}
				}
				line.setHorizontalTextPosition(JLabel.CENTER);
				line.setVerticalTextPosition(JLabel.CENTER);
				line.setForeground(new Color(255, 255, 255));
				line.setFont(new Font("Georgia", Font.PLAIN, 40));
				line.setBackground(Color.white);
				line.setBounds(100 + 30 * a, 200, 250, 250);
			}
			panel.add(line);
		}
		frame.getContentPane().setBackground(new java.awt.Color(0, 0, 0));
		// restarts the frame
		frame.revalidate();
		frame.repaint();
	}

	public static boolean is_game_won() {
		// it checks if all the letters in the vocabulary guessed correctly
		boolean won = true;
		String new_choosenVoc = choosenVoc.replaceAll("\\s", "");
		for (int i = 0; i < new_choosenVoc.length(); i++) {
			char letter = new_choosenVoc.charAt(i);
			if (!playersGuess.contains(letter)) {
				won = false;
				break;
			}
		}
		return won;
	}
}