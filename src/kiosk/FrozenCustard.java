package kiosk;

public class FrozenCustard extends Menu {
    private String name;
    private String description;
    private double price;

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public FrozenCustard(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;

    }


}