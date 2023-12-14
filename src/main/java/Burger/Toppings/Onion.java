package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Onion extends Addons {

    public Onion(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Onion"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}