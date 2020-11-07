package _04_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_clicker {
	public static void main(String[] args) {
		button1 makeButtons = new makeButtons();
		button2 makeButtons = new makeButtons();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button1.setText("Joke");
		button2.setText("Punch line");
		if(event.getSource() == jokeButton) {
		JOptionPane.showMessageDialog(null, "hi");	
		}
	}
}
