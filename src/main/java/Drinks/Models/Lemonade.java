package Drinks.Models;

public class Lemonade extends ThatGoodSlurp {

    private String DrinkName;
    private String DrinkDescription;
    private String DrinkFlavour;

    public Lemonade(String DrinkName, String DrinkDescription, String DrinkFlavour) {
        this.DrinkName = DrinkName;
        this.DrinkDescription = DrinkDescription;
        this.DrinkFlavour = DrinkFlavour;

    }

    @Override
    public String getDrinkName() {
        return this.DrinkName;
    }

    @Override
    public String getDrinkDescription() {
        return this.DrinkDescription;
    }

    @Override
    public String getDrinkFlavour() {
        return this.DrinkFlavour;
    }
}
