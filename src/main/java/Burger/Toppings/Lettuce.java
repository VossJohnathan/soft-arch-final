package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Lettuce extends Addons {

    public Lettuce(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Lettuce"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}
