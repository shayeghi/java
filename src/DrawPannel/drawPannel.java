package DrawPannel;

import javax.swing.JFrame;

public class drawPannel {

	public static void main(String[] args) {
		
		Draw pannel= new Draw();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(pannel);
		
		application.setSize(757,780);
		
		application.setVisible(true);
		
	}
}
