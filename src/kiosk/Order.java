package kiosk;

public class Order {

    private Menu menu;

    public Order(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return menu.getName();
    }

    public String getDescription() {
        return menu.getDescription();
    }

    public double getPrice() {
        return menu.getPrice();
    }

}
