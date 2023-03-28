/**
 * 
 */

/**
 * @author: Sanalan Saseenthirakumar
 * Date: 03/02/2023
 * Description: This program display your name inside a box made up of characters on the console screen
 */
public class NamePrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("+---------+"); //this line prints and displays the top side of the box
		System.out.println("|         |"); //this line prints and displays the right and left sides of the box that are above the name
		System.out.print("  Sanalan  ");  //this line prints and displays the name inside of the box
		System.out.println("\n|         |"); //this line prints and displays the right and left sides of the box that are below the name
		System.out.print("+---------+"); //this line displays the bottom side of the box
	}

}
