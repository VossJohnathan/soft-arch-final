package Fries;

public class DoubleFries implements Fryer{

    //This class makes it so that we double the amount of fries each time.
    private double multiplyRate;

    public DoubleFries(double multiplyRate) {
        this.multiplyRate = multiplyRate;
    }

    @Override
    public long addFries(long startingFryCount) {
        return Math.round(startingFryCount * (1 + multiplyRate));
    }
}
