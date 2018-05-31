package shepes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter 1 for rectangle"
				+ "enter 2 for ovals");
		int choice =Integer.parseInt(input);
		shape pannel = new shape(choice);
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(1000,1000);
		application.add(pannel);
		application.setVisible(true);
		

	}

}
