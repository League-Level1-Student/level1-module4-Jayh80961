package _12_slot_machine;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements MouseListener {
	static JFrame frame = new JFrame();	 
	 static JPanel panel = new JPanel();
	 static JButton button = new JButton();
	private static Object imageURL;
	private static Object limeURL;
	private static Object cherryURL;
	private static Object orangeURL;
	public static void main(String[] args) {
		frame.add(panel);
		 panel.add(button);
		 frame.setTitle("Slot Machine");
		 frame.setVisible(true);
		 frame.pack();
	}
	
		private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
        button.addMouseListener(this);
        if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
        }
       
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			if(image.url == cherry.jpg) {
			JOptionPane.showMessageDialog(null, "You got cherry!");
			}
			else if(image.url == orange.jpg) {
				JOptionPane.showMessageDialog(null, "You got orange!");
				}
			else {
				JOptionPane.showMessageDialog(null, "You got lime! ");
			}
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
    
	

