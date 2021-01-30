package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whack_a_mole implements ActionListener {
	static int molecount = 0;
	static int missed = 0;
	static JFrame frame = new JFrame();	 
	 static JPanel panel = new JPanel();
	 static Date timeatstart;
	 public static void main(String[] args) {
		 Random random = new Random();
		 whack_a_mole mole = new whack_a_mole();
		 
		 mole.make_buttons(random.nextInt(24));
		 timeatstart = new Date();
	 }
	 private void endGame(Date timeAtStart, int molesWhacked) { 
		    Date timeAtEnd = new Date();
		    JOptionPane.showMessageDialog(null, "Your whack rate is "
		            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
		                  + " moles per second.");
		}
	 public void make_buttons(int random){
		for(int i=0;i<24;i++) {
			JButton button = new JButton();
			button.setPreferredSize(new Dimension(100,40));
			button.addActionListener(this);
			frame.add(panel);
			 frame.setTitle("Whack a button for Fame and Glory");
			 frame.setVisible(true);
			panel.add(button);
			frame.setPreferredSize(new Dimension(500,500));
			if(i==random) {
				button.setText("Mole!");
			}
		}
	 }
	   static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		panel.removeAll();
		JButton buttonPresssed = (JButton) arg0.getSource();
		frame.dispose();
		whack_a_mole mole = new whack_a_mole();
		Random random = new Random();
		mole.make_buttons(random.nextInt(24));
		if((buttonPresssed.getText().equalsIgnoreCase("Mole!"))) {
			molecount++;
		}
		else {
			JOptionPane.showMessageDialog(null, "You missed!");
			missed++;
		}
		if(molecount==10){
			mole.endGame(timeatstart, molecount);
		}
		if(missed==5) {
			JOptionPane.showMessageDialog(null, "You lose!");
		}
	}
}
	
