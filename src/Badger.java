import java.util.Iterator;

import javax.swing.JOptionPane;

public class Badger {
	public static void main(String[] args) {
		for (int E = 1; E < 4; E++) {
			for (int B = 1; B < 11; B++) {
				JOptionPane.showMessageDialog(null, "Badger");

			}
			if (E < 3) {

				for (int C = 1; C < 3; C++) {
					JOptionPane.showMessageDialog(null, "mushroom");
				}
			} else {

				for (int D = 1; D < 4; D++) {
					JOptionPane.showMessageDialog(null, "a snake");
				}
			}
		}
	}
}
