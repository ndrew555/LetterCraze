package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LevelBuilderFrame extends JFrame {

	private BuilderMenuGui menuGui;
	private BuilderNewLevelMenuGui newLevelGui;
	private BuilderGui builderGui;

	public LevelBuilderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		menuGui = new BuilderMenuGui(this);
		menuGui.setBorder(new EmptyBorder(50, 50, 50, 50));
		menuGui.setLayout(new BorderLayout(0, 0));
		setContentPane(menuGui);
	}

	public void goToNewMenu() {
		newLevelGui = new BuilderNewLevelMenuGui(this);
		newLevelGui.setBorder(new EmptyBorder(50, 50, 50, 50));
		newLevelGui.setLayout(new BorderLayout(0, 0));
		setContentPane(newLevelGui);
		
	}
	
	public void goToBuilder() {
		builderGui = new BuilderGui(this);
		builderGui.setBorder(new EmptyBorder(50, 50, 50, 50));
		builderGui.setLayout(new BorderLayout(0, 0));
		setContentPane(builderGui);
		
	}
	
	public void goToMenu() {
		setContentPane(menuGui);
		
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelBuilderFrame frame = new LevelBuilderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}




}
