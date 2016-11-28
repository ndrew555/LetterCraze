import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JComboBox;

public class BuilderMenuGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderMenuGui frame = new BuilderMenuGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuilderMenuGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLevelSelect = new JLabel("Level Select");
		lblLevelSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelSelect.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLevelSelect.setBounds(224, 29, 243, 39);
		contentPane.add(lblLevelSelect);
		
		JLabel lblLevelOne = new JLabel("1. Level One");
		lblLevelOne.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelOne.setBounds(41, 79, 320, 39);
		contentPane.add(lblLevelOne);
		
		String[] boxOptions = { "Edit", "Rename", "Delete"};
		JComboBox<String> comboBox = new JComboBox(boxOptions);
		comboBox.setMaximumRowCount(3);
		comboBox.setBounds(477, 96, 96, 39);
		contentPane.add(comboBox);
		
		JButton btnNewLevel = new JButton("New Level");
		btnNewLevel.setBounds(484, 39, 89, 23);
		contentPane.add(btnNewLevel);
		
		JLabel lblLevelTwo = new JLabel("2. Level Two");
		lblLevelTwo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelTwo.setBounds(41, 162, 320, 55);
		contentPane.add(lblLevelTwo);
		
		JComboBox comboBox_1 = new JComboBox(boxOptions);
		comboBox_1.setMaximumRowCount(3);
		comboBox_1.setBounds(477, 172, 96, 39);
		contentPane.add(comboBox_1);
		
		JLabel lblLevelThree = new JLabel("3. Level Three");
		lblLevelThree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLevelThree.setBounds(41, 250, 320, 45);
		contentPane.add(lblLevelThree);
		
		JComboBox comboBox_2 = new JComboBox(boxOptions);
		comboBox_2.setMaximumRowCount(3);
		comboBox_2.setBounds(477, 255, 96, 39);
		contentPane.add(comboBox_2);
	}
}
