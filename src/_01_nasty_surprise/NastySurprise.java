package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	static JButton button1 = new JButton();
	static JLabel label = new JLabel();  
	static JButton button2 = new JButton();
	static NastySurprise surprise = new NastySurprise();
	public void add() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	public static void main(String[] args) {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add(panel);
	window.setVisible(true);
	button1.setText("Trick");
	button2.setText("Treat");
	panel.add(button1);
	panel.add(button2);
	surprise.add();
	window.pack();
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource().equals(button1)) {
		surprise.showPictureFromTheInternet("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dog-puppy-on-garden-royalty-free-image-1586966191.jpg?crop=0.752xw:1.00xh;0.175xw,0&resize=640:*");
		}
		else {
		surprise.showPictureFromTheInternet("https://d78ear04r5cyy.cloudfront.net/wp-content/uploads/bfi_thumb/halloween-2019-blog-1-1-347bsjou8sdvn8qy8efc5oeewxw9mtxd4hu4zm7adq07o7nge.jpg");
		}
	}
	
	
}
