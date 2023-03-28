
import java.text.DecimalFormat;
import java.util.Scanner;

/** 
 * 
 */

/**
 * @author: Sanalan Saseenthirakumar
 * Date: March 03 2023
 * Description: This program displays the receipt for a CostCo retailer by prompting for inputs  such as time, date, company name, etc
 */
public class Receipt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables for company name .date.time.and names and prices of 4 items
		double itemprice1 = 0, itemprice2 = 0, itemprice3 = 0, itemprice4 = 0, totalcost = 0, tax = 0;
		
		String companyname,date,time,itemname1, itemname2, itemname3, itemname4;
		Scanner inputStr = new Scanner(System.in);
		Scanner inputD =  new Scanner(System.in);
		//Setting up formating for decimals
		DecimalFormat twoDecimals = new DecimalFormat ("#0.00");
		
		try {
		System.out.println("What is the company name?");	// Prompt the user for the company name
		companyname = inputStr.nextLine();
		
		System.out.println("What is the date?"); 	// Prompt the user for the date
		date = inputStr.nextLine();
		
		System.out.println("What is the time?");	// Prompt the user for the time
		time = inputStr.nextLine();
		
		System.out.println("What is the 1st item purchased and its price?"); //Prompt user for the name and price of the first item
		itemname1 = inputStr.nextLine();
		(itemprice1) = Double.parseDouble(inputD.nextLine());
		
		System.out.println("What is the 2nd item purchased and its price?"); //Prompt user for the name and price of the second item
		itemname2 = inputStr.nextLine();
		itemprice1 = Double.parseDouble(inputD.nextLine());
		
		System.out.println("What is the 3rd item purchased and its price?"); //Prompt user for the name and price of the third item
		itemname3 = inputStr.nextLine();
		itemprice3 = Double.parseDouble(inputD.nextLine());
		
		System.out.println("What is the 4th item purchased and its price?"); //Prompt user for the name and price of the fourth item
		itemname4 = inputStr.nextLine();
		itemprice4 = Double.parseDouble(inputD.nextLine());
		
		totalcost = (itemprice1) + (itemprice2) + (itemprice3) + (itemprice4); //Add up the inputed price numbers 
		tax = (0.13*totalcost);//Calculating tax
		
		//Displays the components of the receipt
		System.out.println(companyname); //Displays the company name
		System.out.println(date  + "  " + time); //Displays the date and time of purchase
		System.out.print(itemname1 + ":" + "$" + itemprice1 + "  "); //Displays the name and price of item 1
		System.out.println("\n" + itemname2 + ":" + "$" + itemprice2); //Displays the name and price of item 2
		System.out.print(itemname3 + ":" + "$" + itemprice3 + "  "); //Displays the name and price of item 3
		System.out.println("\n" + itemname4 + ":" + "$" + itemprice4); //Displays the name and price of item 4
		System.out.println("----------------------------");
		System.out.println ("\n" + "Total Before Tax: " + "$" + twoDecimals.format(totalcost)); //Displays the total cost before tax
		System.out.println ("Tax (13%): " + "$" + twoDecimals.format(tax)); //Displays the tax
		System.out.println("----------------------------");
		System.out.println ("Total With Tax: " + "$" + twoDecimals.format(totalcost + tax)); //Displays the total cost after tax
		
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
		
		
	}

}
