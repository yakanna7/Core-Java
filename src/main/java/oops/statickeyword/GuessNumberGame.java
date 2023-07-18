//Java program to implement a game to guess number

package oops.statickeyword;

import java.util.Scanner;

class GuessNumberGame {

	public static void main(String args[]) {
		char choice;
		int guessed, toGuess;
		Scanner input = new Scanner(System.in);
		do {
			// Generates random number b/w 1 to 3
			toGuess = (int) (Math.random() * 3) + 1;
			System.out.println("Enter any number b/w 1 to 3");
			guessed = input.nextInt();

			if (guessed == toGuess) {
				System.out.println("You won the game");
			} else {
				System.out.println("You lost the game");
				System.out.println("Number to guess " + toGuess);
				System.out.println("Guessed number " + guessed);
			}

			System.out.println("Do you want to continue Y / N ?");

			choice = input.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		System.out.println("Game Over");
	}
}
