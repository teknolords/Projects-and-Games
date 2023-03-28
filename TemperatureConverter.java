import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author: Sanalan Saseenthirakumar
 * Date: 03/03/2023
 * Description: This program converts from temperature from Celsius to Fahrenheit using the formula:
 * 				fahrenheit = celsius * 9/5 + 32
 * 				It also allows the user to convert from Fahrenheit to Celsius using the formula:
 * 				celsius = (fahrenheit - 32)* 5/9
 */
public class TemperatureConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables for fahrenheit and celsius
		double  celsius = 0, fahrenheit = 0;
		int choice;  //variable for user choice
		
		//Setting up formating for decimals
		DecimalFormat twoDigits = new DecimalFormat ("#0.00");
		
		//prompt the user for which conversion they would choose.
		choice = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter \n1 - Celsius to Fahrenheit \n2 - Fahrenehit to Celsius"));

		if (choice == 1) {
			//prompt the user for celsius
			celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your temperature in Celsius"));

			//convert the temperature from celsius to fahrenheit
			fahrenheit = celsius * 9/5 + 32;

			//display the temperature in fahrenheit
			JOptionPane.showMessageDialog(null, celsius + " degC. = " + twoDigits.format(fahrenheit) + " degF. " );
		}

		else if (choice==2) {
			//prompt the user for fahrenheit
			fahrenheit = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter yor temperature in Fahrenheit"));

			//convert the temperature from fahrenheit to celsius
			celsius = (fahrenheit - 32) * 5/9;

			// display the temperature in celcius
			JOptionPane.showMessageDialog(null, fahrenheit + "degF. = " + twoDigits.format(celsius) + " degC. ");
		}

	}

}
