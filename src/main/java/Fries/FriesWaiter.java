package Fries;

import java.util.Scanner;
public class FriesWaiter {

    private static Scanner FryKeyboard = new Scanner(System.in);

    public static void runFryStrategy() {
        System.out.println(" ");
        System.out.println("Welcome to the Fry section!");
        System.out.println("How many fries would you like?");
        System.out.println("Please enter fry count: ");
        long fryCount = Long.parseLong(FryKeyboard.nextLine());

        Fries fry = new Fries(fryCount);

        int choice = 0;
        while (choice != 4) {
            choice = getAdditionType();

            switch (choice) {
                case 1:
                    fry.setFryer(new SingleFry(1));
                    break;
                case 2:
                    fry.setFryer(new DoubleFries(1));
                    break;
                case 3:
                    fry.setFryer(new NoMoreFries());
                    break;
                case 4:
                    System.out.println("All done! Here are your fries!");
                    System.exit(0);
            }

            for (int t = 1; t <= 1; t++) {
                fry.addFries();
                System.out.println("Times you added fries: " + t + ", New Fry count: " + fry.getFryCount());
            }
        }

    }

    private static int getAdditionType() {
        System.out.println("Would you like more Fries?");
        System.out.println("How should we add additional fries");
        System.out.println("1. Just add a single fry. ");
        System.out.println("2. Double the amount!! ");
        System.out.println("3. No more fries please. ");
        System.out.println("4. Exit ");
        System.out.println("\n>> ");

        return Integer.parseInt(FryKeyboard.nextLine());
    }
}
