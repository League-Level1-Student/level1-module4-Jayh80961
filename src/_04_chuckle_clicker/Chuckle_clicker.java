package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_clicker implements ActionListener {
	public static void main(String[] args) {
	Chuckle_clicker clicker = new Chuckle_clicker();	
	clicker.makeButtons();
		
	}
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	void makeButtons() {
		//JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		button1.setText("joke");
		panel.add(button2);
		button2.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == button1) {
		JOptionPane.showMessageDialog(null, "Why do we tell actors to 'Break a leg?'");
		}
		else {
			JOptionPane.showMessageDialog(null, "Because every play has a cast.");
		}
	}
}
