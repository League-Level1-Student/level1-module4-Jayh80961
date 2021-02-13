package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorRunner implements ActionListener {
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton button3 = new JButton();
	static JButton button4 = new JButton();
	static JTextField text1 = new JTextField(20);
	static JTextField text2 = new JTextField(20);
	static JLabel label = new JLabel();
	public static void main(String[] args) {
		calculatorRunner runner = new calculatorRunner();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);
		button1.setText("add");
		button2.setText("sub");
		button3.setText("mul");
		button4.setText("div");
		runner.action();
		frame.setVisible(true);
	}
	public void action(){
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button1) {
			String number1 = text1.getText();
			String number2 = text2.getText();
			int number = Integer.parseInt(number1);
			int number3 = Integer.parseInt(number2);
			int answer = number+number3;
			label.setText(answer+"");
		}
		else if(arg0.getSource()==button2) {
			String number1 = text1.getText();
			String number2 = text2.getText();
			int number = Integer.parseInt(number1);
			int number3 = Integer.parseInt(number2);
			int answer = number-number3;
			label.setText(answer+"");
		}
		else if(arg0.getSource()==button3) {
			String number1 = text1.getText();
			String number2 = text2.getText();
			int number = Integer.parseInt(number1);
			int number3 = Integer.parseInt(number2);
			int answer = number*number3;
			label.setText(answer+"");
		}
		else if(arg0.getSource()==button4) {
			String number1 = text1.getText();
			String number2 = text2.getText();
			int number = Integer.parseInt(number1);
			int number3 = Integer.parseInt(number2);
			int answer = number/number3;
			label.setText(answer+"");
		}
	}
}
