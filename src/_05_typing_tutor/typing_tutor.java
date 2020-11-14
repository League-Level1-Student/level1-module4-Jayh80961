package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing_tutor {
	char currentLetter;
	public static void main(String[] args) {
		
		
		

	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	void setup(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        currentLetter = generateRandomLetter();
        JLabel label = new JLabel();
        label.setText(currentLetter);
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        }
		main method(){
		typingTutor tutor = new typingTutor();
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
	
}
