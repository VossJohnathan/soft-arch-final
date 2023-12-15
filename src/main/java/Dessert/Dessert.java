package Dessert;

public class Dessert {

    private String dessertName;
    private String dessertDescription;
    private String dessertSize;

    public Dessert(String dessertName, String dessertDescription, String dessertSize){
        this.dessertName = dessertName;
        this.dessertDescription = dessertDescription;
        this.dessertSize = dessertSize;
    }

    public String getDessertName() {
        return dessertName;
    }

    public String getDessertDescription() {
        return dessertDescription;
    }

    public String getDessertSize() {
        return dessertSize;
    }
}
