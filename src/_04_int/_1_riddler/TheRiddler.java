package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("What is greater than God");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one

		if (input.equals("Noting is greater than God")) {
			JOptionPane.showMessageDialog(null, "You get 1 point");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong it was Noting is greater than God");
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		String score1 = JOptionPane.showInputDialog(" What can travel around the world while staying in a corner?");
		if (input.equals("A stamp")) {
			JOptionPane.showMessageDialog(null, "You get 1 point");
			score1 = score1 + 1;

		} else

		{
			JOptionPane.showMessageDialog(null, "Wrong it was A stamp");

		}

	}
}
// 2. Make a pop up to show the score.
