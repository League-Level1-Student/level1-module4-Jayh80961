package _01_nasty_surprise;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F430375308140588923%2F&psig=AOvVaw2_V9M4068YB4Rqkzh3YPUV&ust=1603647200593000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJir7L_hzewCFQAAAAAdAAAAABAD");
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
	window.pack();
	
	}
	
	
}
