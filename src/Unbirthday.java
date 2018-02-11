import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String name = JOptionPane.showInputDialog("When is your birthday");
	if (name.equals("02/05")){
		JOptionPane.showMessageDialog(null, "Happy Birthday");
}
JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	
}	
}

