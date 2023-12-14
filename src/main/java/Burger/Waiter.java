package Burger;

import Burger.Toppings.*;
import Burger.WellnessType.*;

import java.util.Scanner;
public class Waiter {

    private Scanner keyboard;


    private int getWellnessType() {
        //Spacer
        System.out.println();

        //Wellness Intro
        System.out.println("Welcome to Big Burgs R' Us!");
        System.out.println("A plain burger costs: $8.99");
        System.out.println("What type of burger would you like?");

        //Wellness Types
        System.out.println("1- Rare");
        System.out.println("2- Medium Rare");
        System.out.println("3- Medium");
        System.out.println("4- Medium Well");
        System.out.println("5- Well Done");
        System.out.println("0. No Burger Please.");
        System.out.print(">> ");

        //Return User Input
        return Integer.parseInt(keyboard.nextLine());
    }

    private int getToppingsChoices() {
        //Spacer
        System.out.println();

        //Toppings Intro
        System.out.println("Now what kind of toppings would you like on your burger?");
        System.out.println("You can have any number of Toppings! Each costs $0.50 extra.");

        //Toppings Types
        System.out.println("1- Bacon");
        System.out.println("2- Cheese");
        System.out.println("3- Lettuce");
        System.out.println("4- Tomato");
        System.out.println("5- Onion");
        System.out.println("6- Pickles");
        System.out.println("7- Ketchup");
        System.out.println("8- Mayo");

        System.out.println("0-");
        System.out.println(">> ");

        //Return User Input
        return Integer.parseInt(keyboard.nextLine());

    }

    public void takeOrder() {
        keyboard = new Scanner(System.in);

        int WellnessChoice = 0;
        do {
            WellnessChoice = getWellnessType();

            Burg burg = null;

            switch (WellnessChoice) {
                case 1:
                    burg = new Rare();
                    break;
                case 2:
                    burg = new MediumRare();
                    break;
                case 3:
                    burg = new Medium();
                    break;
                case 4:
                    burg = new MediumWell();
                    break;
                case 5:
                    burg = new WellDone();
                    break;
            }

            if (burg != null) {
                int ToppingsChoice = 0;
                do {
                    ToppingsChoice = getToppingsChoices();

                    switch (ToppingsChoice) {
                        case 1:
                            burg = new Bacon(burg);
                            break;
                        case 2:
                            burg = new Cheese(burg);
                            break;
                        case 3:
                            burg = new Lettuce(burg);
                            break;
                        case 4:
                            burg = new Tomato(burg);
                            break;
                        case 5:
                            burg = new Onion(burg);
                            break;
                        case 6:
                            burg = new Pickles(burg);
                            break;
                        case 7:
                            burg = new Ketchup(burg);
                            break;
                        case 8:
                            burg = new Mayo(burg);
                            break;
                    }

                } while (ToppingsChoice != 0);

                System.out.printf("The cost of your burger is: $%.2f\n", burg.getCost() );
                System.out.println("Please enjoy your " + burg.getDescription());
            }
        } while (WellnessChoice != 0);
    }
}
