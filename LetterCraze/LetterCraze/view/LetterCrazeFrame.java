package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LetterCrazeFrame extends JFrame {

	protected JPanel levelPane;
	protected JPanel menuPane;
	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LetterCrazeFrame frame = new LetterCrazeFrame();
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
	public LetterCrazeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		menuPane = new LetterCrazeMenuGui(this);
		menuPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		menuPane.setLayout(new BorderLayout(0, 0));
		
		setContentPane(menuPane);
	}
	
	public void GoToLevel(){
		levelPane = new LetterCrazeLevelGui(this);
		levelPane.setBorder(new EmptyBorder(50, 50, 50, 50));
		levelPane.setLayout(new BorderLayout(0, 0));
		setContentPane(levelPane);
	}
	
	public void GoToMenu(){
		setContentPane(menuPane);
	}

}
