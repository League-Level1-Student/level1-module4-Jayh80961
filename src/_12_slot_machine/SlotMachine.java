package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	static JFrame frame = new JFrame();	 
	 static JPanel panel = new JPanel();
	 static JButton button = new JButton();
	 static JLabel label1 = new JLabel();
	 static JLabel label2 = new JLabel();
	 static JLabel label3 = new JLabel();
	 static int randnum1 = 1;
	 static int randnum2 = 2;
	 static int randnum3 = 3;
	public static void main(String[] args) {
		frame.add(panel);
		 panel.add(button);
		 frame.setTitle("Slot Machine");
		 frame.setVisible(true);
		 SlotMachine machine = new SlotMachine();
		 button.setText("Spin!");
		 
		 try {
			label1 = machine.createLabelImage("lime.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
				label2 = machine.createLabelImage("cherry.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 try {
				label3 = machine.createLabelImage("orange.jpg");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	panel.add(label1);
			panel.add(label2);
			panel.add(label3);
			machine.method();
	}
	public void method(){
		button.addActionListener(this);
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		panel.removeAll();
		panel.add(button);
		Random ran = new Random();
		randnum1 = ran.nextInt(3);
		randnum2 = ran.nextInt(3);
		randnum3 = ran.nextInt(3);
		if(randnum1 == 0) {
		try {
			
			label1 = createLabelImage("orange.jpg");
			panel.add(label1);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
		
			e.printStackTrace();
		}
		}
			if(randnum1 == 1) {
			try {
			
				label2 = createLabelImage("cherry.jpg");
				panel.add(label2);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(randnum1 == 2) {
			try {
				
				label3 = createLabelImage("lime.jpg");
				panel.add(label3);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		if(randnum2 == 0) {
			try {
				
				label1 = createLabelImage("orange.jpg");
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(randnum2 == 1) {
				try {
				
					label2 = createLabelImage("cherry.jpg");
					panel.add(label2);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				if(randnum2 == 2) {
				try {
				
					label3 = createLabelImage("lime.jpg");
					panel.add(label3);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		if(randnum3 == 0) {
			try {
				
				label1 = createLabelImage("orange.jpg");
				panel.add(label1);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			if(randnum3 == 1) {
				try {
				
					label2 = createLabelImage("cherry.jpg");
					panel.add(label2);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			if(randnum3 == 2) {
				try {
				
					label3 = createLabelImage("lime.jpg");
					panel.add(label3);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
				System.out.println(randnum1);
				System.out.println(randnum2);
				System.out.println(randnum3);
				if(randnum1 == randnum2 && randnum1 == randnum3) {
					JOptionPane.showMessageDialog(null, "You win the game!");
				}
		frame.pack();
	}
}
       
		

		
    
	

