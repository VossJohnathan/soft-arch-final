package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Pickles extends Addons {

    public Pickles(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Pickles"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}