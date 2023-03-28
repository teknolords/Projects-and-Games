/**
 * 
 */
 import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;
import java.text.DecimalFormat;

/**
 * @author Sanalan Saseenthirakumar
 * Date: 03/14/22
 * Description: This program used the if/else if /else structure to convert a students marks into a Level
 */
public class MarksConvertor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for mark
		double mark = 0;

		//create a formatting for the decimal marks
		DecimalFormat twoDigits = new DecimalFormat();
		
		// creating Scanner class
		Scanner scan = new Scanner(System.in);

		// prompting user for marks
		System.out.print("Please enter the marks:");
		mark = Double.parseDouble(scan.nextLine());

		//checking conditions
		if(mark > 100 || mark < 0) {
			System.out.println("ERROR!");
		}	

		else if(mark < 100 && mark >= 80) {
			System.out.println("Level 4");
		}

		else if (mark < 80 && mark >= 70) {
			System.out.println("Level 3");
		}

		else if (mark < 70 && mark >= 60){
			System.out.println("Level 2");
		}
		else if (mark < 60 && mark >= 50) {
			System.out.println ("Level 1");
		}
		else {
			System.out.println("Level R");
		}
	}
	
}

