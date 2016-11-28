import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LetterCrazeMenuGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LetterCrazeMenuGui frame = new LetterCrazeMenuGui();
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
	public LetterCrazeMenuGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLettercraze = new JLabel("LetterCraze");
		lblLettercraze.setHorizontalAlignment(SwingConstants.CENTER);
		lblLettercraze.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblLettercraze.setBounds(189, 11, 310, 74);
		contentPane.add(lblLettercraze);
		
		JLabel lblChooseLevel = new JLabel("Choose Level:");
		lblChooseLevel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChooseLevel.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseLevel.setBounds(238, 116, 209, 23);
		contentPane.add(lblChooseLevel);
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 161, 544, 258);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 3, 0, 0));
		
		JButton btnLightning = new JButton("Lightning 1");
		btnLightning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnLightning);
		
		JButton btnTheme = new JButton("Theme 1");
		panel.add(btnTheme);
		
		JButton btnPuzzle = new JButton("Puzzle 1");
		panel.add(btnPuzzle);
		
		JButton btnLightning2 = new JButton("Lightning 2");
		panel.add(btnLightning2);
		
		JButton btnTheme2 = new JButton("Theme 2");
		panel.add(btnTheme2);
		
		JButton btnPuzzle2 = new JButton("Puzzle 2");
		panel.add(btnPuzzle2);
		
		JButton btnLightning3 = new JButton("Lightning 3");
		panel.add(btnLightning3);
		
		JButton btnTheme3 = new JButton("Theme 3");
		panel.add(btnTheme3);
		
		JButton btnPuzzle3 = new JButton("Puzzle 3");
		panel.add(btnPuzzle3);
		
		JButton btnLightning4 = new JButton("Lightning 4");
		panel.add(btnLightning4);
		
		JButton btnTheme4 = new JButton("Theme 4");
		panel.add(btnTheme4);
		
		JButton btnPuzzle4 = new JButton("Puzzle 4");
		panel.add(btnPuzzle4);
		
		JButton btnLightning5 = new JButton("Lightning 5");
		panel.add(btnLightning5);
		
		JButton btnTheme5 = new JButton("Theme 5");
		panel.add(btnTheme5);
		
		JButton btnPuzzle5 = new JButton("Puzzle 5");
		panel.add(btnPuzzle5);
	}

}
