package Dessert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DessertWaiter {

    private static Scanner DessertKeyboard = new Scanner(System.in);
    public static void dessertOrder() {
        List<Dessert> dessertList = DessertList();

        //Spacer just in case.
        System.out.println(" ");
        System.out.println("Welcome to the last stop in the food court!");
        System.out.println("Please allow me to list off some of the dessert choices. ");

        for (Dessert dessert : dessertList) {
            System.out.printf("This dessert is %s It is %s and is %s\n",
                    dessert.getDessertName(),
                    dessert.getDessertDescription(),
                    dessert.getDessertSize()
                    );
        }
        //Spacer just in case.
        System.out.println(" ");

        int choice = 0;
        while (choice != 6) {
            choice = getDessertChoice();

            switch (choice) {
                case 1:
                    System.out.println("You took the M&Ms.");
                    break;
                case 2:
                    System.out.println("You took the Smoothie.");
                    break;
                case 3:
                    System.out.println("You took the Cake.");
                    break;
                case 4:
                    System.out.println("You took the Brownies.");
                    break;
                case 5:
                    System.out.println("You took the Ice Cream.");
                    break;
                case 6:
                    System.out.println("You decided not to take a dessert.");
                    break;

            }
        }
    }

    private static List<Dessert> DessertList() {
        List<Dessert> desserts = new ArrayList<>();

        desserts.add(new Dessert("M&Ms ",
                "A small bag of M&Ms! ",
                "A Small Size Dessert Option."));

        desserts.add(new Dessert("Smoothie ",
                "A cold, refreshing fruit smoothie!! ",
                "A Small Size Dessert Option."));

        desserts.add(new Dessert("Cake ",
                "This is a cake! ",
                "A Medium Size Dessert Option."));

        desserts.add(new Dessert("Brownies ",
                "One large brownie slice! ",
                "A Large Size Dessert Option."));

        desserts.add(new Dessert("Ice Cream ",
                "Chocolate Chip & Cookie Dough Ice Cream! ",
                "A Large Size Dessert Option."));

        return desserts;
    }

    private static int getDessertChoice() {
        //Ask for choice.
        System.out.println(" ");
        System.out.println("Which Dessert Number would you like to finish off you meal with? ");
        System.out.println("1. M&Ms ");
        System.out.println("2. Smoothie ");
        System.out.println("3. Cake ");
        System.out.println("4. Brownies ");
        System.out.println("5. Ice Cream ");
        System.out.println("6. Exit ");
        System.out.println(">>  ");

        return Integer.parseInt(DessertKeyboard.nextLine());
    }
}
