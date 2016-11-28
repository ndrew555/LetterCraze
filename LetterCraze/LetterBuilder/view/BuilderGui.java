package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class BuilderGui extends JPanel {
	
	protected LevelBuilderFrame frame;
	protected JTextField textField;
	protected JTextField textField_3;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_4;
	protected JTextField textField_5;


	/**
	 * Create the frame.
	 */
	public BuilderGui(LevelBuilderFrame frame) {
		this.frame = frame;
		setBounds(100, 100, 793, 500);
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(12, 13, 77, 23);
		cancel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.goToMenu();
				
			}
			
		});
		add(cancel);
		
		JLabel lblLevelName = new JLabel("LEVEL NAME");
		lblLevelName.setBounds(263, 12, 88, 21);
		lblLevelName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		add(lblLevelName);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(601, 13, 57, 23);
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnUndo);
		
		JPanel panel = new JPanel();
		panel.setBounds(134, 108, 524, 325);
		add(panel);
		panel.setLayout(new GridLayout(6, 6, 5, 5));
		
		/*for (int i=0; i<36; i++) {
			panel.add(new JToggleButton("A"));
		}*/
		
		JToggleButton tglbtnA = new JToggleButton("A");
		panel.add(tglbtnA);
		JToggleButton tglbtn2 = new JToggleButton("A");
		panel.add(tglbtn2);
		JToggleButton tglbtn3 = new JToggleButton("A");
		panel.add(tglbtn3);
		JToggleButton tglbtn4 = new JToggleButton("A");
		panel.add(tglbtn4);
		JToggleButton tglbtn5 = new JToggleButton("A");
		panel.add(tglbtn5);
		JToggleButton tglbtn6 = new JToggleButton("A");
		panel.add(tglbtn6);
		JToggleButton tglbtn7 = new JToggleButton("A");
		panel.add(tglbtn7);
		JToggleButton tglbtn8 = new JToggleButton("A");
		panel.add(tglbtn8);
		JToggleButton tglbtn9 = new JToggleButton("A");
		panel.add(tglbtn9);
		JToggleButton tglbtn10 = new JToggleButton("A");
		panel.add(tglbtn10);
		JToggleButton tglbtn11 = new JToggleButton("A");
		panel.add(tglbtn11);
		JToggleButton tglbtn12 = new JToggleButton("A");
		panel.add(tglbtn12);
		JToggleButton tglbtn13 = new JToggleButton("A");
		panel.add(tglbtn13);
		JToggleButton tglbtn14 = new JToggleButton("A");
		panel.add(tglbtn14);
		JToggleButton tglbtn15 = new JToggleButton("A");
		panel.add(tglbtn15);
		JToggleButton tglbtn16 = new JToggleButton("A");
		panel.add(tglbtn16);
		JToggleButton tglbtn17 = new JToggleButton("A");
		panel.add(tglbtn17);
		JToggleButton tglbtn18 = new JToggleButton("A");
		panel.add(tglbtn18);
		JToggleButton tglbtn19 = new JToggleButton("A");
		panel.add(tglbtn19);
		JToggleButton tglbtn20 = new JToggleButton("A");
		panel.add(tglbtn20);
		JToggleButton tglbtn21 = new JToggleButton("A");
		panel.add(tglbtn21);
		JToggleButton tglbtn22 = new JToggleButton("A");
		panel.add(tglbtn22);
		JToggleButton tglbtn23 = new JToggleButton("A");
		panel.add(tglbtn23);
		JToggleButton tglbtn24 = new JToggleButton("A");
		panel.add(tglbtn24);
		JToggleButton tglbtn25 = new JToggleButton("A");
		panel.add(tglbtn25);
		JToggleButton tglbtn26 = new JToggleButton("A");
		panel.add(tglbtn26);
		JToggleButton tglbtn27 = new JToggleButton("A");
		panel.add(tglbtn27);
		JToggleButton tglbtn28 = new JToggleButton("A");
		panel.add(tglbtn28);
		JToggleButton tglbtn29 = new JToggleButton("A");
		panel.add(tglbtn29);
		JToggleButton tglbtn30 = new JToggleButton("A");
		panel.add(tglbtn30);
		JToggleButton tglbtn31 = new JToggleButton("A");
		panel.add(tglbtn31);
		JToggleButton tglbtn32 = new JToggleButton("A");
		panel.add(tglbtn32);
		JToggleButton tglbtn33 = new JToggleButton("A");
		panel.add(tglbtn33);
		JToggleButton tglbtn34 = new JToggleButton("A");
		panel.add(tglbtn34);
		JToggleButton tglbtn35 = new JToggleButton("A");
		panel.add(tglbtn35);
		JToggleButton tglbtn36 = new JToggleButton("A");
		panel.add(tglbtn36);
		
		JLabel lblstar = new JLabel("1-Star:");
		lblstar.setBounds(12, 70, 46, 14);
		add(lblstar);
		
		textField = new JTextField();
		textField.setBounds(52, 67, 57, 21);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblstar_1 = new JLabel("2-Star:");
		lblstar_1.setBounds(10, 99, 46, 14);
		add(lblstar_1);
		
		JLabel lblstar_2 = new JLabel("3-Star:");
		lblstar_2.setBounds(12, 135, 46, 14);
		add(lblstar_2);
		
		JToggleButton tglbtnLetters = new JToggleButton("Letters");
		tglbtnLetters.setBounds(144, 13, 96, 23);
		add(tglbtnLetters);
		
		textField_3 = new JTextField();
		textField_3.setBounds(263, 39, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(486, 13, 89, 23);
		add(btnSave);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(52, 96, 57, 21);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(52, 132, 57, 21);
		add(textField_2);
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(678, 13, 89, 23);
		add(btnDone);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(678, 47, 89, 23);
		add(btnHelp);
		
		JLabel lblLevelTheme = new JLabel("LEVEL THEME");
		lblLevelTheme.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblLevelTheme.setBounds(361, 11, 115, 22);
		add(lblLevelTheme);
		
		textField_4 = new JTextField();
		textField_4.setBounds(359, 39, 103, 21);
		add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAllowedWords = new JLabel("Allowed Words:");
		lblAllowedWords.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAllowedWords.setBounds(12, 183, 96, 23);
		add(lblAllowedWords);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 217, 96, 215);
		add(textArea);
		
		JLabel lblTimeLimit = new JLabel("Time Limit:");
		lblTimeLimit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTimeLimit.setBounds(263, 62, 77, 27);
		add(lblTimeLimit);
		
		textField_5 = new JTextField();
		textField_5.setBounds(361, 70, 101, 23);
		add(textField_5);
		textField_5.setColumns(10);
	}
}
