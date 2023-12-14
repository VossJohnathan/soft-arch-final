package Fries;

public class NoMoreFries implements Fryer{
    //You didn't want any more fries added.
    @Override
    public long addFries(long startingFryCount) {
        return startingFryCount;
    }
}
