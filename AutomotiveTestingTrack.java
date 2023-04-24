import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Sanalan Saseenthirakumar
 * Date: 
 * Description:
 */
public class AutomotiveTestingTrack extends JFrame {
	/**	declare  global variables for the speed of the car, the users name, and the
	 *  
	 */

	ImageIcon Track;
	int delay = 100; //variable to slow down the animation
	public AutomotiveTestingTrack() {
		super("Automotive Testing Track");
		setSize (1000,700);


		Track = new ImageIcon("racetrack.png");

		setVisible(true); //displays the window we created
		setDefaultCloseOperation(EXIT_ON_CLOSE); //cleans up my program by properly closing it
	}


	public void paint(Graphics g) {

		for (int i = 0; i < 1000; i++)
		{ 
			g.setColor(Color.green); //sets the colour of the grass background
			g.fillRect(0,0,1000,700); // the grass

			g.setColor(Color.black); //sets the colour of the black road
			g.fillRect(325,0,350,700);// the  road


			for(int x =0;x<700;x+=70) {
				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(490,x,10,50);//sets the colour of the white pavement lines
		
			}
			try {
				Thread.sleep(100); //this delays the program by 1000 milliseconds
			} catch (InterruptedException e) {
				// the printStackTrace method is used to find when the program exceeds the set delay limit of 1000ms and 
				e.printStackTrace();
			}

			for (int j = 0; j<= 1000; j++);
			{
				g.setColor(Color.green); //sets the colour of the grass middleground
				g.fillRect(0,0,1000,500); // the grass

				g.setColor(Color.blue); //sets the colour of the blue lake background
				g.fillRect(0,0,1000,200); // the grass

				g.setColor(Color.black); //sets the colour of the black road
				g.fillRect(0,500,1000,300);// the  road

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(0,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(100,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(200,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(300,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(400,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(500,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(600,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(700,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(800,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(900,600,50,10);//sets the colour of the white pavement lines

				g.setColor(Color.white);//sets the colour of the white pavement lines
				g.fillRect(1900,600,50,10);//sets the colour of the white pavement lines

				
			}
			
	        	
	        
		}
		

	}





	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// call the constructor method
		new AutomotiveTestingTrack();
	}

}
