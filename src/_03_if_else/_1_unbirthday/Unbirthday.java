package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("When is your birthday? MM/DD");
		if (input.equalsIgnoreCase("11/19")) {
			
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
	}
	
}
