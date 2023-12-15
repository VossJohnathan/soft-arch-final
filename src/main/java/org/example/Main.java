package org.example;

import Burger.Waiter;
import Fries.FriesWaiter;
import Drinks.DrinkWaiter;
import Dessert.DessertWaiter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Loading Program, Please wait...");
        //Spacer just in case.
        System.out.println(" ");

        new Waiter().takeOrder();

        //Spacer just in case.
        System.out.println(" ");

        FriesWaiter.runFryStrategy();

        //Spacer just in case.
        System.out.println(" ");

        DrinkWaiter.DrinkMachine();

        //Spacer just in case.
        System.out.println(" ");

        DessertWaiter.dessertOrder();

        System.out.println(" ");

        System.out.println("Thank you for playing! We hope you enjoy the meal! ");
        System.out.println("Make sure to leave a review of our food court! ");


        /*
        3- Burger Shop <---- This one seems good.
        Burger Shop has the Decorator Pattern

        Fries -- Strategy
        Drink -- Factory
        Dessert -- Singleton

        See if the above three could be implemented into the bottom three.

        The Strategy Pattern
        The Singleton Pattern
        The Factory Method
         */
    }
}