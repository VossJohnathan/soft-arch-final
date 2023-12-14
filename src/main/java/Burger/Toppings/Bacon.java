package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Bacon extends Addons {

    public Bacon(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Bacon"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}