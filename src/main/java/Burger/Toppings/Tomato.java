package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Tomato extends Addons {

    public Tomato(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Tomato"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}
