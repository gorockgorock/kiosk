package kiosk;

import java.util.List;

public class Cart {
    private List<Order> orderList;

//    public Cart() {}
//
//    public Cart(List<Order> orderList) {
//        this.orderList = orderList;
//    }
    public int calculateTotalPrice() {
        int totalPrice = 0;
        for (Order order : orderList) {
            totalPrice += order.getPrice();
        }
        return totalPrice;
    }
    public List<Order> getOrderList() {
        return orderList;
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
