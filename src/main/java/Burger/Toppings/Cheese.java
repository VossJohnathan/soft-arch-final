package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Cheese extends Addons {

    public Cheese(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Cheese"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}
