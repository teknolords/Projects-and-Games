import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sanalan Saseenthirakumar
 * Date: 03/13/23
 * Description: This program uses the  if /else if /else structure to display the price of a pizza deal.
 */
public class PizzaDeals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for price, pizza, pops, and choice
		double price = 0, tax = 0, total = 0;
		int slicenum, pops = 0;
	
		DecimalFormat twoDigits = new DecimalFormat("#0.00");
		
		//prompt the user for the number of pizza
		slicenum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of pizza slices ordered."));
		
		//prompt the user for the number of pops
		pops = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of pops ordered."));
		
		//make a decision on how to calculate the price of the deal based on user input
		if (slicenum < 3) {
			price = 2.00 * slicenum + 0.5 * pops;
			
			// calculate the tax	
			tax = price * 0.13;
			
			//calculate the price
			total = price + tax;
			
		}
		else  {
			price = 1.00 * slicenum + 0.5 * pops;
			
			// calculate the tax	
			tax = price * 0.13;
			
			//calculate the price
			total = price + tax;
		}
		//display the total cost
		JOptionPane.showMessageDialog(null, "Your total is: " + "$" + twoDigits.format(total));

	}
}

