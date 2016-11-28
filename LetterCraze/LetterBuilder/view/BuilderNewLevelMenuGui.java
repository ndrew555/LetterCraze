package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class BuilderNewLevelMenuGui extends JPanel {

	protected LevelBuilderFrame frame;

	/**
	 * Create the frame.
	 */
	public BuilderNewLevelMenuGui(LevelBuilderFrame frame) {
		this.frame = frame;
		setBounds(100, 100, 782, 494);
		
		JLabel lblSelectLevelType = new JLabel("Select Level Type:");
		lblSelectLevelType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectLevelType.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectLevelType.setBounds(165, 37, 399, 84);
		add(lblSelectLevelType);
		
		JButton btnPuzzle = new JButton("Puzzle");
		btnPuzzle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPuzzle.setBounds(154, 132, 430, 74);
		btnPuzzle.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.goToBuilder();
				
				
			}
			
		});
		add(btnPuzzle);
		
		JButton btnTheme = new JButton("Theme");
		btnTheme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTheme.setBounds(154, 217, 430, 74);
		add(btnTheme);
		
		JButton btnLightning = new JButton("Lightning");
		btnLightning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLightning.setBounds(154, 302, 430, 74);
		add(btnLightning);
	}

}
