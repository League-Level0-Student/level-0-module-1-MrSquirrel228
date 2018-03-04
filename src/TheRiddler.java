import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Christopher = 0;
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String touring = JOptionPane.showInputDialog("What has eyes but does not weep what can move but does not use feet what can move things but does not have arms.");
		if (touring.equals("a storm")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Christopher += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
			Christopher -= 1;
			JOptionPane.showMessageDialog(null, "The correct answer is a storm");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		
	}
}

