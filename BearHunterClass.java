import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sanalan Saseenthirakumar
 * Date: 3/17/23
 * Description: This program is a game played by the user against the computer. The user will type one of the following options: Bear,	
 * 				Ninja, or Hunter. The user has the option of entering words or numbers. If the user does not enter the correct option for bear hunter or ninja, they will be able to 
 * 				try again after an error message. If the user decides to play again, they can enter their choice of yes or no. 
 */
public class BearHunterClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare variables for the users choice, computer's guess, and add a choice for user to play again
		int userChoice, computerChoice;
		computerChoice = (int)(Math.random() * 3 + 1);
		String answer = "Yes";
		String qnswer = "No";
		while (answer.equalsIgnoreCase("Yes")) {
			
	
		//prompt user for their choice
		userChoice = Integer.parseInt(JOptionPane.showInputDialog(null,"Please choose your option: \"1 - Bear\" ,"
				+ " \"2 - Ninja\" , \"3 - Bear\""));
		
		//check conditions for a tie
		if (userChoice == computerChoice ) {
			JOptionPane.showMessageDialog(null,"Game is tied!");	
			
		}
		else if (userChoice == 1 && computerChoice == 2) {
			JOptionPane.showMessageDialog(null, "Bear munches on the Ninja using claws!"
					+ " \n You Won! \t Computer Loses!"); // if user chooses bear, and computer chooses ninja
			
		}
		else if (userChoice == 2 && computerChoice == 1) {
			JOptionPane.showMessageDialog(null,"Bear munches on the Ninja using claws!"
					+ "\n You Lost! \t Computer Won!"); //if user chooses ninja, and computer chooses bear
	
		}
		else if (userChoice == 2 && computerChoice == 3) {
			JOptionPane.showMessageDialog(null,"Ninja uses karate chop and kills the Hunter!"
					+ " \n You Won! \t Computer Lost!");//if user chooses ninja, and computer chooses hunter

		}
		else if (userChoice == 3 && computerChoice == 2) {
			JOptionPane.showMessageDialog(null,"Ninja uses karate chop and kills the Hunter!"
					+ " \n You Lost! \t Computer Won!");//if user chooses hunter, and computer chooses ninja
		}
		else if (userChoice == 3 && computerChoice == 1) {
		
			JOptionPane.showMessageDialog(null,"Hunter uses gun and shoots the Bear!"
					+ " \n You Won! \t Computer Lost!");//if user chooses hunter, and computer chooses bear

		}
		else if (userChoice == 1 && computerChoice == 3) {
			JOptionPane.showMessageDialog(null,"Hunter uses gun and shoots the Bear!"
					+ " \n You Lost! \t Computer Won!");//if user chooses bear, and computer chooses hunter

		}
		else {
			JOptionPane.showInputDialog(null,"Error, Please choose your option again!: \"1 - Bear\" , \"2 - Ninja\" , \"3 - Hunter\"");
		}
		answer = JOptionPane.showInputDialog(null, "Enter \"Yes\" to play again! \n Enter \"No\" to quit the game!");
		
	}   
		if (answer.equalsIgnoreCase("No")) {
		JOptionPane.showMessageDialog(null, "Thank you for playing my game!");

	}

	}
}
