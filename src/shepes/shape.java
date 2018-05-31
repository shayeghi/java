package shepes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class shape extends JPanel {

	private int choice;
	
	public shape(int choice) {
	
		this.choice = choice;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int i = 0; i < 20; i++) {
			switch (choice) {
			case 1:
			    g.drawRect(10+i*10,10+i*10 ,50+i*10,50+i*10);
				g.drawRect(200-5*i,800-5*i ,50+i*10,50+i*10);
				g.drawOval(800+i*10,i*10 ,50+i*10,50+i*10);
				g.drawOval(800-10*i,400-10*i ,i*10,i*10);
				g.drawOval(800-10*i,600-10*i ,i*20,i*20);
				break;

			default:	
				g.drawOval(10+i*10,10+i*10 ,50+i*10,50+i*10);
				g.drawOval(200-10*i,200-10*i ,i*10,i*10);
				g.drawOval(200-10*i,200-10*i ,i*20,i*20);

				
				break;
			}
			
		}

	}

	

}
