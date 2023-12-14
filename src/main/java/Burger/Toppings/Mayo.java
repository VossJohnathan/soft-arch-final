package Burger.Toppings;

import Burger.Addons;
import Burger.Burg;

public class Mayo extends Addons {

    public Mayo(Burg burg) {
        super(burg);
    }

    @Override
    public String getDescription() {
        return burg.getDescription() + ", Mayo"; }

    @Override
    public double getCost() {
        return burg.getCost() + .50; }
}