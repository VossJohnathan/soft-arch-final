package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Ketchup extends Addons {

    public Ketchup(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Ketchup"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}
