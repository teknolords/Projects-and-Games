import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Name: Gurnoor Gill
 * Date: March 7, 2023
 * Description: 6. Write a program that calculates the length of the hypotenuse
 * 
 * 
 */
public class Hypotenuse {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double number1, number2, sum = 0; // Declare variables for adjacent, opposite, and hypotenuse sides.
		
		DecimalFormat twoDigits = new DecimalFormat("0.00"); // Round answer to 2 decimal places.
	
		
		number1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Opposite Side Length"));
		
		number2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter the Adjacent Side Length"));
		
		
		sum = Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2));
		
		
		JOptionPane.showMessageDialog(null, "Formula: a\u00B2 + b\u00B2 = c\u00B2 \n Hypotenuse: " + twoDigits.format(sum));
		
}
	
}