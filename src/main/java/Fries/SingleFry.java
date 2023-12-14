package Fries;

public class SingleFry implements Fryer {

    //This class makes it so that we add a single fry to the amount each time.
    private int individualFry;
    public SingleFry(int individualFry) {
        this.individualFry = individualFry;
    }
    @Override
    public long addFries(long startingFryCount) {
        return startingFryCount + individualFry;
    }
}
