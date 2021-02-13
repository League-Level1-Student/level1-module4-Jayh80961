package _09_latest_tweet;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latest_Tweet implements MouseListener {
	static JTextField text = new JTextField(20);
	static JButton button = new JButton();
	public static void main(String[] args) {
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setTitle("The Amazing Tweet Retriever");
		window.setVisible(true);
		button.setText("Search the Twitterverse");
		panel.add(text);
		panel.add(button);
		window.pack();
	
	}
	public void run() {
		button.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
