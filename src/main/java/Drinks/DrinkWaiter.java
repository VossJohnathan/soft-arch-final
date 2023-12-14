package Drinks;

import Drinks.Models.*;
import Drinks.DrinkFactory;
import java.util.Scanner;

public class DrinkWaiter {

    private static Scanner DrinkKeyboard = new Scanner(System.in);
    public static void DrinkMachine() {


        //Spacer
        System.out.println(" ");

        //Intro Messages:
        System.out.println("Welcome to the drink station! ");
        System.out.println("We have several choices of drink for you: ");

        //Factory outputs.
        ThatGoodSlurp Water = DrinkFactory.getThatGoodSlurp
                ("Water",
                        "This drink is Water! ",
                        "The water is clear and crisp, the perfect Temperature! ",
                        "Cool & Refreshing!");

        ThatGoodSlurp Soda = DrinkFactory.getThatGoodSlurp
                ("Soda",
                        "This drink is Soda! ",
                        "The Soda looks to be bubbly! ",
                        "The Soda is sweet and refreshing!");

        ThatGoodSlurp Lemonade = DrinkFactory.getThatGoodSlurp(
                "Lemonade",
                "This drink is Lemonade! ",
                "The lemonade is cold and freshly made! ",
                "The Lemonade is sweet & Sour, the perfect lemonade! ");

        //Drink Outputs
        System.out.println("Drink 1: " + Water);
        System.out.println("Drink 2: " + Soda);
        System.out.println("Drink 3: " + Lemonade);

        int choice = 0;
        while (choice != 4) {
            choice = getDrinkChoice();

            switch (choice) {
                case 1:
                    System.out.println("You took the Water.");
                    break;
                case 2:
                    System.out.println("You took the Soda.");
                    break;
                case 3:
                    System.out.println("You took the Lemonade.");
                    break;
                case 4:
                    System.out.println("You did not take a drink.");

            }
        }


    }

    private static int getDrinkChoice() {
        //Ask for choice.
        System.out.println(" ");
        System.out.println("Which Drink Number would you like?");
        System.out.println("1. Water ");
        System.out.println("2. Soda ");
        System.out.println("3. Lemonade ");
        System.out.println("4. Exit ");
        System.out.println(">> ");

        return Integer.parseInt(DrinkKeyboard.nextLine());
    }
}
