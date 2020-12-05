package _11_whack_a_mole;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whack_a_mole implements MouseListener {
	static JFrame frame = new JFrame();	 
	 static JPanel panel = new JPanel();
	 static JButton button = new JButton();
	 public static void main(String[] args) {
		 frame.add(panel);
		 panel.add(button);
		 frame.setTitle("Whack a button for Fame and Glory");
		 frame.setVisible(true);
		 frame.pack();
	 }
	 public void button(){
		 button.addMouseListener(this); 
	 }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Failed.");
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
