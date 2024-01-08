package kiosk;

import java.util.List;

public class Cart {
    private List<Order> orderList;
    private int orderNumber = 1;

    public Cart() {}

    public Cart(List<Order> orderList) {
        this.orderList = orderList;
    }
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Order order : orderList) {
            totalPrice += order.getPrice();
        }
        return totalPrice;
    }
    public List<Order> getOrderList() {
        return orderList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOderNumber (int orderNumber) {
        this.orderNumber = orderNumber ;

    }


    public void addOrder(Order order) {
        orderList.add(order);
    }

    public void removeOrder(Order order) {
        orderList.remove(order);
    }

    public void clear() {
        orderList.clear();
    }



}
