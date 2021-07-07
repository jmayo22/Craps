
/**
 * Write a description of class Craps here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Craps
{
    public static void main(String[] args)
    {
        System.out.println("Do you want to play Craps? y/n");
        Scanner in = new Scanner(System.in);
        String playCraps = in.nextLine();
        Die dice = new Die();
        System.out.println("Would you like to view the rules for Craps? y/n");
        String viewRules = in.nextLine();
        if (viewRules.equalsIgnoreCase("y"))
        {
            System.out.println("First: A player rolls two six-sided dice and adds thes numbers that are rolled together.");
            System.out.println("On the first roll, if a player rolls a 7 or 11 they automatically win, or if a player rolls a 2, 3, or 12 they automatically lose.");
            System.out.println("If any other number is rolled on the first roll, that number becomes the point.");
            System.out.println("The player continues to roll the two dice until one of two things happens: either they roll the point again, in which case they win, or they roll a 7, in which case they lose.");
        }
        while (playCraps.equalsIgnoreCase("y"))
        {
            System.out.println("Press [Enter] to roll the dice");
            Scanner in2 = new Scanner(System.in);
            String wait = in2.nextLine();
            int result = dice.rollDice();
            if (result == 7 || result == 11)
            {
                System.out.println("Congratulations! You rolled a " + result);
                System.out.println("You win!");
            }
            else if (result == 2 || result == 3 || result == 12)
            {
                System.out.println("Sorry :( You rolled a " + result);
                System.out.println("You lost...");
            }
            else
            {
                int count = 0;
                int point = result;
                while ((result != 7 && point != result) || count == 0)
                {
                    count++;
                    System.out.println("You rolled a " + result);
                    System.out.println("The point is " + point);
                    System.out.println("Press [Enter] to keep rolling.");
                    Scanner in3 = new Scanner(System.in);
                    String pause = in3.nextLine();
                    result = dice.rollDice();
                    if (result == point)
                    {
                        System.out.println("Congratulations! You rolled a " + result);
                        System.out.println("You win!");
                    }
                    else if (result == 7)
                    {
                        System.out.println("Sorry :( You rolled a " + result);
                        System.out.println("You lose...");
                    }
                }
            }
            System.out.println("Would you like to play Craps again? y/n");
            playCraps = in.nextLine();
        }
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

Jason, you don't have a Craps game in here! What's going on?
Come see me!

SCORE: 1/20

*/

