import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Christopher = 0;
		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String touring = JOptionPane.showInputDialog("What has eyes but does not weep what can move but does not use feet what can move things but does not have arms?");
		if (touring.equals("a Storm")) {
			JOptionPane.showMessageDialog(null, "Correct");
			JOptionPane.showMessageDialog(null, Christopher +=1);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
			JOptionPane.showMessageDialog(null, Christopher -=1);
			JOptionPane.showMessageDialog(null, "The correct answer is a storm");
		}
		
		touring = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		if (touring.equals("Meat")) {
			JOptionPane.showMessageDialog(null, "Correct");
			JOptionPane.showMessageDialog(null, Christopher +=1);
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorect");
			JOptionPane.showMessageDialog(null, Christopher -=1);
			JOptionPane.showMessageDialog(null, "The correct answer is Meat");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		
	}
}
