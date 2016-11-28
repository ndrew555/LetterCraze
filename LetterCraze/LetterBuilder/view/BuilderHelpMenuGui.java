package view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class BuilderHelpMenuGui extends JPanel {

	protected JTextField txtThemeallowedWords;
	protected LevelBuilderFrame frame;


	/**
	 * Create the frame.
	 */
	public BuilderHelpMenuGui(LevelBuilderFrame frame) {
		this.frame  = frame;
		setBounds(100, 100, 803, 514);
		
		JLabel lblBuilderInstructions = new JLabel("Builder Instructions");
		lblBuilderInstructions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBuilderInstructions.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuilderInstructions.setBounds(276, 25, 194, 37);
		add(lblBuilderInstructions);
		
		JPanel panel = new JPanel();
		panel.setBounds(37, 68, 143, 98);
		add(panel);
		panel.setLayout(new GridLayout(3, 3, 5, 5));
		
		JToggleButton toggleButton = new JToggleButton("A");
		panel.add(toggleButton);
		
		JToggleButton toggleButton_1 = new JToggleButton("A");
		panel.add(toggleButton_1);
		
		JToggleButton toggleButton_2 = new JToggleButton("A");
		panel.add(toggleButton_2);
		
		JToggleButton toggleButton_3 = new JToggleButton("A");
		panel.add(toggleButton_3);
		
		JToggleButton toggleButton_4 = new JToggleButton("A");
		panel.add(toggleButton_4);
		
		JToggleButton toggleButton_5 = new JToggleButton("A");
		panel.add(toggleButton_5);
		
		JToggleButton toggleButton_6 = new JToggleButton("A");
		panel.add(toggleButton_6);
		
		JToggleButton toggleButton_7 = new JToggleButton("A");
		panel.add(toggleButton_7);
		
		JToggleButton toggleButton_8 = new JToggleButton("A");
		panel.add(toggleButton_8);
		
		JTextArea txtrThisPanelAllows = new JTextArea();
		txtrThisPanelAllows.setText("This panel allows you to define the shape of the level. \n"
				+ "Activate/deactivate tiles by clicking them.\n"
				+ "Activate/deactivate multiple tiles by clicking and dragging.");
		txtrThisPanelAllows.setBounds(218, 73, 484, 71);
		add(txtrThisPanelAllows);
		
		JToggleButton tglbtnLetters = new JToggleButton("Letters");
		tglbtnLetters.setBounds(37, 189, 121, 23);
		add(tglbtnLetters);
		
		JTextArea txtrInThemeLevels = new JTextArea();
		txtrInThemeLevels.setText("In theme levels, you will want to set initial letters \n"
				+ "for each square. If this button is toggled,\n"
				+ "clicking on tiles will allow you to enter\n"
				+ "initial letters instead of activating tiles.");
		txtrInThemeLevels.setBounds(218, 175, 484, 54);
		add(txtrInThemeLevels);
		
		JLabel lblStar = new JLabel("Star-1:");
		lblStar.setBounds(37, 254, 83, 23);
		add(lblStar);
		
		JLabel lblStar_1 = new JLabel("Star-2:");
		lblStar_1.setBounds(37, 277, 67, 28);
		add(lblStar_1);
		
		JLabel lblStar_2 = new JLabel("Star-3:");
		lblStar_2.setBounds(37, 308, 59, 23);
		add(lblStar_2);
		
		JTextArea txtrStarthresholds = new JTextArea();
		txtrStarthresholds.setText("Star-Thresholds:\n"
				+ "In each of these text fields, enter the\n"
				+ "number of points required for each star.");
		txtrStarthresholds.setBounds(218, 253, 484, 64);
		add(txtrStarthresholds);
		
		txtThemeallowedWords = new JTextField();
		txtThemeallowedWords.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtThemeallowedWords.setText("Theme/Allowed Words");
		txtThemeallowedWords.setBounds(37, 345, 146, 37);
		add(txtThemeallowedWords);
		txtThemeallowedWords.setColumns(10);
		
		JTextArea txtrThemehelp = new JTextArea();
		txtrThemehelp.setText("If you are making a theme level, you must\n"
				+ "enter the theme as well as a list of\n"
				+ "allowed words. ");
		txtrThemehelp.setBounds(221, 342, 397, 64);
		add(txtrThemehelp);
		
		JLabel lblTimeLimit = new JLabel("Time Limit:");
		lblTimeLimit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTimeLimit.setBounds(37, 408, 143, 37);
		add(lblTimeLimit);
		
		JTextArea txtrTimelimit = new JTextArea();
		txtrTimelimit.setText("If you are making a lightning level, you\n"
				+ "must enter a time limit in this field.");
		txtrTimelimit.setBounds(219, 417, 322, 37);
		add(txtrTimelimit);
	}
}
