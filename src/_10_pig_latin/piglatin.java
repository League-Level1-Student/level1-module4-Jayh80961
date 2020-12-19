package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class piglatin {
	static JFrame frame = new JFrame();	 
	 static JPanel panel = new JPanel();
	 static JButton button = new JButton();
	private static Object imageURL;
	public static JLabel main(String[] args) {
		frame.add(panel);
		 panel.add(button);
		 frame.setTitle("Slot Machine");
		 frame.setVisible(true);
		 frame.pack();
		 }
		 JLabel createLabelImage(download.jpg); MalformedURLException{
		        Object dowload;
				URL imageURL = getClass().getResource(dowload.jpg);
			if (imageURL == null){
				System.err.println("Could not find image " + "dowload.jpg");
				return new JLabel();
			} 
			Icon icon = new ImageIcon();
			JLabel imageLabel = new JLabel(icon);
			return imageLabel; 
		

	}
}
