package Drinks.Models;

public abstract class ThatGoodSlurp {

    public abstract String getDrinkName();
    public abstract String getDrinkDescription();
    public abstract String getDrinkFlavour();

    @Override
    public String toString() {
        return "Drink Name: " + this.getDrinkName() +
                " Drink Description: " + this.getDrinkDescription() +
                " Drink Flavour: " + this.getDrinkFlavour();
    }
}
