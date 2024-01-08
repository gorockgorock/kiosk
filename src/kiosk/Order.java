package kiosk;

import java.awt.*;

public class Order extends menu{

    private menu menu;

    public Order(menu menu) {
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
