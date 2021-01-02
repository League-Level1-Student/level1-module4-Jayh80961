package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class typing_tutor implements KeyListener {
	JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
	char currentLetter;
	
		

	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	
	void setup(){
        currentLetter = generateRandomLetter();
        label.setText(currentLetter+"");
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.addKeyListener(this);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
        frame.pack();
        }
		public static void main(String[] args) {
		typing_tutor tutor = new typing_tutor();
		tutor.setup(); 
		 }
		Date timeAtStart = new Date();
		private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		    Date timeAtEnd = new Date();
		    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		    long gameInSeconds = (gameDuration / 1000) % 60;
		    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		    int charactersPerMinute = (int) (charactersPerSecond * 60);
		    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
		}
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getKeyChar());
			if(currentLetter == e.getKeyChar()){
				System.out.println("Correct!");
				panel.setBackground(Color.green);
			}
			else {
				System.out.println("Wrong!");
				panel.setBackground(Color.red);
			}
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			currentLetter = generateRandomLetter();
			label.setText(currentLetter+"");
			
		} 
	
}
