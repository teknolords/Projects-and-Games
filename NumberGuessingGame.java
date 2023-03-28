import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Sanalan Saseenthirakumar
 * Date: March 09 2023
 * Description: This is a number guessing game . The user is asked to guess a 
 * 				a number from 1 to 10 and if it matches the computer's guess, user wins
 */
public class NumberGuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare variables and initialize them for the user and computer guess
		int compGuess = 0, userGuess = 0;
		String answer = "Yes"; //user wants to play again
		while (answer.equals("Yes")) {
		compGuess = (int)(Math.random() *10 + 1); //set compGuess to random number
		
		//prompt the user to enter a number between 1 and 10
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number between 1 and 10"));
		
		//Determine if user guessed correctly or not
		if (userGuess == compGuess) { // user wins
			JOptionPane.showMessageDialog(null, "Great! You Won!");
			
		}
		
		else if (userGuess < compGuess) { //user guesses too low
			JOptionPane.showMessageDialog(null, "You guessed too low! \n Computer Guessed: " + compGuess +  "You Guessed:" + userGuess + ":( Try Again!");
		}
		
		else { //user guesses too high
			JOptionPane.showMessageDialog(null, "You guessed too high! \n Computer Guessed:" + compGuess +  "You Guessed:" + userGuess + ":( Try Again!");
					}
		answer = JOptionPane.showInputDialog(null, "Enter \"Yes\" to play again!");

	}
		JOptionPane.showMessageDialog(null, "Thank you for playing my game!");

	}
}
