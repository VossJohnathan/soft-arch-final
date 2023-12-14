package Drinks.Models;

public class Soda extends ThatGoodSlurp {

    private String DrinkName;
    private String DrinkDescription;
    private String DrinkFlavour;

    public Soda(String DrinkName, String DrinkDescription, String DrinkFlavour) {
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
