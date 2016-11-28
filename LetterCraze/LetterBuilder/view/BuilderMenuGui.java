package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BuilderMenuGui extends JPanel {

	//protected LevelBuilderFrame frame;

	/**
	 * Create the frame.
	 * @param lb 
	 */
	protected LevelBuilderFrame frame;
	public BuilderMenuGui(LevelBuilderFrame frame) {
		this.frame = frame;
		setBounds(100, 100, 761, 510);

		
		JLabel lblLevelSelect = new JLabel("Level Select");
		lblLevelSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelSelect.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLevelSelect.setBounds(224, 29, 243, 39);
		add(lblLevelSelect);
		
		JLabel lblLevelOne = new JLabel("1. Level One");
		lblLevelOne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelOne.setBounds(41, 79, 320, 39);
		add(lblLevelOne);
		
		String[] boxOptions = { "Edit", "Rename", "Delete"};
		JComboBox<String> comboBox = new JComboBox(boxOptions);
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(477, 96, 96, 39);
		add(comboBox);
		
		JButton btnNewLevel = new JButton("New Level");
		btnNewLevel.setBounds(484, 39, 89, 23);
		btnNewLevel.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.goToNewMenu();
				
			}
			
		});
		add(btnNewLevel);
		
		JLabel lblLevelTwo = new JLabel("2. Level Two");
		lblLevelTwo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelTwo.setBounds(41, 162, 320, 55);
		add(lblLevelTwo);
		
		JComboBox comboBox_1 = new JComboBox(boxOptions);
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(477, 172, 96, 39);
		add(comboBox_1);
		
		JLabel lblLevelThree = new JLabel("3. Level Three");
		lblLevelThree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelThree.setBounds(41, 250, 320, 45);
		add(lblLevelThree);
		
		JComboBox comboBox_2 = new JComboBox(boxOptions);
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(477, 255, 96, 39);
		add(comboBox_2);
	}
}
