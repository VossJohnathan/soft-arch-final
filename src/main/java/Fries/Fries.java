package Fries;

public class Fries {

    //Here is the current number of fries in your meal
    //Could do double instead.... But let's have some fun and make a lot of fries.
    private long fryCount = 0;
    private Fryer fryer;

    //Again, could be double, but for the sake of the fries it'll be a long here.
    public Fries(long fryCount) {
        this.fryCount = fryCount;
    }

    public long getFryCount() {
        return fryCount;
    }

    public void addFries() {
        if (fryer != null) {
            fryCount = fryer.addFries(fryCount);
        }
    }

    public void setFryer(Fryer fryer) {
        this.fryer = fryer;
    }
}
