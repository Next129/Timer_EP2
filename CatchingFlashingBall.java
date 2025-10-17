import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CatchingFlashingBall extends JPanel{
	Timer timer = new Timer(1000,new TimerListener());
	int xCenter = 0;
	int yCenter = 0;
	int radius = 20;
	
	CatchingFlashingBall(){
		timer.start();
		this.addMouseListener(new Catcher());
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.setColor(Color.ORANGE);
		g.fillOval(xCenter,yCenter ,radius ,radius );
	}
	
	
public class TimerListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		xCenter = random.nextInt(getWidth());
		yCenter = random.nextInt(getHeight());	
		repaint();
		
	}
}
public class Catcher implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int distance = (int) calculateDistance(e.getX(),e.getY(),xCenter,yCenter);
			if (distance <= radius) {
				timer.stop();
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

double calculateDistance(int x1, int y1, int x2, int y2) {
return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
}


}
