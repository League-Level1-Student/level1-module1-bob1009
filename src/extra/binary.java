package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary implements ActionListener {
	public static void main(String[] args) {
		binary nary=new binary();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField(20);
	JButton button = new JButton();
	JLabel label = new JLabel();
	JLabel label2= new JLabel();
	private String name;

	binary(String name) {
		String string = null;
		this.name = string;
		
	}

	
	
	
	
	
	
	binary() {
		button.addActionListener(this);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(text);
		panel.add(label);
		frame.setSize(500, 100);
		button.setSize(7, 10);
		button.setText("convert");
		label.setText("put in a combanation of 8 1s and 0s and press convert");
		panel.add(label2);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		String string = text.getText();
		String con= convert(string);
		label2.setText("the binary you typed in is "+ con);
	}
		
String convert(String input) {
	
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}}