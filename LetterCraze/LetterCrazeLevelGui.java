import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JProgressBar;

public class LetterCrazeLevelGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LetterCrazeLevelGui frame = new LetterCrazeLevelGui();
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
	public LetterCrazeLevelGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("<- Levels");
		button.setBounds(12, 13, 77, 23);
		contentPane.add(button);
		
		JLabel lblLevelName = new JLabel("LEVEL NAME");
		lblLevelName.setBounds(322, 12, 88, 21);
		lblLevelName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLevelName.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		contentPane.add(lblLevelName);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(595, 13, 57, 23);
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnUndo);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(662, 13, 61, 23);
		contentPane.add(btnReset);
		
		JPanel panel = new JPanel();
		panel.setBounds(121, 70, 537, 363);
		contentPane.add(panel);
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
		
		JLabel lblScore = new JLabel("Score: 35");
		lblScore.setBounds(12, 70, 46, 14);
		contentPane.add(lblScore);
		
		JLabel lblTimertheme = new JLabel("Timer/Theme");
		lblTimertheme.setHorizontalAlignment(SwingConstants.CENTER);
		lblTimertheme.setBounds(278, 32, 165, 27);
		contentPane.add(lblTimertheme);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setBounds(12, 95, 57, 338);
		progressBar.setValue(35);
		contentPane.add(progressBar);
		
		JLabel lblStar = new JLabel("Star 1");
		lblStar.setBounds(79, 348, 46, 14);
		contentPane.add(lblStar);
		
		JLabel lblStar_1 = new JLabel("Star 2");
		lblStar_1.setBounds(79, 219, 46, 14);
		contentPane.add(lblStar_1);
		
		JLabel lblStar_2 = new JLabel("Star 3");
		lblStar_2.setBounds(79, 95, 46, 14);
		contentPane.add(lblStar_2);
		
		
	}
}
