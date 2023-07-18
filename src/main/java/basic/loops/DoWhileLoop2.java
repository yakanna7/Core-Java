//Java program to implement a game to guess the  number between 1 and 3

package basic.loops;

import java.util.Scanner;

class DoWhileLoop2 
{
	public static void main(String args[])
	{
		char choice;
		int guessed, toGuess;

		Scanner s = new Scanner(System.in);

		do
		{
			// Generates random number b/w 1 to 3
			toGuess = (int) (Math.random() * 3) + 1;
			System.out.println("Enter any number b/w 1 to 3");
			guessed = s.nextInt();

			if (guessed == toGuess) 
			{
				System.out.println("You won the game");
			} 
			else 
			{
				System.out.println("You lost the game");
				System.out.println("Number to guess " + toGuess);
				System.out.println("Guessed number " + guessed);
			}

			System.out.println("Do you want to continue Y / N ?");
			choice = s.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		System.out.println("Game Over");
	}
}
