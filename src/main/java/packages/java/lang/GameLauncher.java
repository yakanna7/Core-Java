package  packages.java.lang;
import java.util.Scanner;

import java.io.IOException;

public class GameLauncher {
    public static void main (String[] args) throws IOException {
        char choice='y';
        Scanner sc=new Scanner(System.in);
        while(choice=='y'|| choice=='Y')
        {
    	   GuessGame game = new GuessGame();
           game.startGame();
           System.out.println("Do You want to continue ?");
           System.out.println("Select Y to continue");
           System.out.println("or any other key to quit");
           choice=sc.next().charAt(0);
           
        } 
        sc.close();
    }
}
