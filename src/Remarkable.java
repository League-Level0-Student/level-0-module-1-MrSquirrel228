import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("What is your name");
	if (name.equals("Aiden")){
		JOptionPane.showMessageDialog(null, "You have a hobby");
}
	if (name.equals("Adi")){
		JOptionPane.showMessageDialog(null, "You are a person");
}		
	if (name.equals("Ben")){
		JOptionPane.showMessageDialog(null, "I give up");
}

}}