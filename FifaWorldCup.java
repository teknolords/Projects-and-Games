import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sanalan Saseenthirakumar
 * Date: March 20. 2023
 * Description: A program to display price of soccer game tickets based on the
 * 				ticket type Early Bord(EB) or Lat minute (LM). based on the person's
 * 				age (12 and younger or older than 12)
 */
public class FifaWorldCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables for ticket type, age, and price
		String ticketType = "";
		int age = 0;
		double price = 0;
		
		//format for the price using decimalformat
		DecimalFormat curr = new DecimalFormat("0.00");
		
		// prompt user for ticket type
		ticketType = JOptionPane.showInputDialog(null, "Enter ticket type - \"EB\" or \"LM\":" );
		
		//prompt user for age
		age = Integer.parseInt(JOptionPane.showInputDialog (null, "Enter your age:"));
		
		//determine ticket price
		if (ticketType.equals("EB")) { //note that this is case sensitive (meaning only capitals
			if (age <= 12) {
				price = 70.99;
		}
		
			else if (age > 12) {
				price = 150.99;
			}
			
	}
		else if(ticketType.equals("LM")) {
			if (age <= 12) {
				price = 500.99;
		}
		
			else if (age > 12) {
				price = 1000.99;
			}
		}

		//display the cost using the decimal formatting object
		JOptionPane.showMessageDialog(null,  "The cost of your ticket is: $" + curr.format(price));
	}
}
