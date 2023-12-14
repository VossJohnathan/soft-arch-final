package Drinks;

import Drinks.Models.*;

public class DrinkFactory {

    public static ThatGoodSlurp getThatGoodSlurp(String type, String DrinkName, String DrinkDescription, String DrinkFlavour)
    {
        if ("Water".equalsIgnoreCase(type)) {
            return new Water(DrinkName, DrinkDescription, DrinkFlavour);
        }
        else if ("Soda".equalsIgnoreCase(type)) {
            return new Soda(DrinkName, DrinkDescription, DrinkFlavour);
        }
        else if ("Lemonade".equalsIgnoreCase(type)) {
            return new Lemonade(DrinkName, DrinkDescription, DrinkFlavour);
        }

        return null;
    }
}
