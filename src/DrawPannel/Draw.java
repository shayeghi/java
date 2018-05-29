package DrawPannel;

import java.awt.Graphics;

import javax.swing.JPanel;


public class Draw extends JPanel{
	
	

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
	
		for (int i = width; i >= 0; i-=20) {
			System.out.println(i);
			g.drawLine(i,0,height, i);
			
		}
		for (int i = height; i >= 0; i-=20) {
			System.out.println(i);
			g.drawLine(0	,i,i, width);
			//CHNAGE 
			
		}
		
		
		
	
	}
}
