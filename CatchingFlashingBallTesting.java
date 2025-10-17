import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CatchingFlashingBallTesting {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //create an object of this frame
		CatchingFlashingBall panel = new CatchingFlashingBall(); //create an object of CatchingFlashingBall
		frame.add(panel); //add JPanel into JFrame
		//set a frame's resolution
		frame.setTitle("My Catching FlashBall"); //set Title of this frame
		frame.setSize(600, 400); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set default Close Operation
	}

}
