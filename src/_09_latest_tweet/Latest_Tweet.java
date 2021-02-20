package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Latest_Tweet implements ActionListener {
	static JTextField text = new JTextField(20);
	static JButton button = new JButton();
	public static void main(String[] args) {
		Latest_Tweet object = new Latest_Tweet();
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setTitle("The Amazing Tweet Retriever");
		window.setVisible(true);
		button.setText("Search the Twitterverse");
		panel.add(text);
		panel.add(button);
		object.run();
		window.pack();
	
	}
	public void run() {
		button.addActionListener(this);
	}
	private String getLatestTweet(String searchingFor) {

	    Twitter twitter = new TwitterFactory().getInstance();

	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button) {
			JOptionPane.showMessageDialog(null, "Tweet,Tweet");
			String tweetanswer = getLatestTweet("Hi");
			JOptionPane.showMessageDialog(null, tweetanswer);
		}
		
	}

	
}
