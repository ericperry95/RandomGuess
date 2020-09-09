// chapter 6 page 327

import javax.swing.JOptionPane;

public class RandomGuess
{
	public static void main (String[] args)
	{
		// variables and constants
		int userGuess;
		int magicNumber;
		String msg;
		int attempts = 1;
		final int LOW = 1;
		final int HIGH = 5;

		// input phase
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between " + LOW + " and " + HIGH));

		// calculation phase 
		magicNumber = (int) (Math.random() * HIGH) + LOW;

		while(userGuess != magicNumber)
		{
			if(userGuess > magicNumber)
			{
			msg = "Your guess is too high!";
			}
			else 
			{
			msg = "Your guess is to low!";
			}
			userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, msg + "\nPlease enter a number between " + LOW + " and " + HIGH));

			// increment the number of attempts before the userGuess is checked again
			++attempts;

		}
		// output phase 
		JOptionPane.showMessageDialog(null, "YOU'VE WON! \nYou picked the number: " + userGuess + "\nThe magic number was: " + magicNumber + "\nYou gessed it in " + attempts + " attempts.");

	}
}