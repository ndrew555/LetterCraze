import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class BuilderNewLevelMenuGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderNewLevelMenuGui frame = new BuilderNewLevelMenuGui();
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
	public BuilderNewLevelMenuGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSelectLevelType = new JLabel("Select Level Type:");
		lblSelectLevelType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSelectLevelType.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectLevelType.setBounds(165, 37, 399, 84);
		contentPane.add(lblSelectLevelType);
		
		JButton btnPuzzle = new JButton("Puzzle");
		btnPuzzle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPuzzle.setBounds(154, 132, 430, 74);
		contentPane.add(btnPuzzle);
		
		JButton btnTheme = new JButton("Theme");
		btnTheme.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTheme.setBounds(154, 217, 430, 74);
		contentPane.add(btnTheme);
		
		JButton btnLightning = new JButton("Lightning");
		btnLightning.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLightning.setBounds(154, 302, 430, 74);
		contentPane.add(btnLightning);
	}

}
