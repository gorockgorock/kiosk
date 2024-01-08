package kiosk;

import java.awt.*;

public class Order extends menu{private final menu menu;

    public Order(menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return menu.getName();
    }

    public String getDescription() {
        return menu.getDescription();
    }

    public int getPrice() {
        return menu.getPrice();
    }

}
