package model.Ford.Sales;

import java.util.ArrayList;

public class Sales {
    ArrayList<Order> pastOrders;
    ArrayList<Order> currentOrders;
    private int inventory;

    public Sales() {
        pastOrders = new ArrayList<>();
        currentOrders = new ArrayList<>();
        inventory = 30;
    }

    public int getInventory() {
        return inventory;
    }

    public void addInventory(int inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Order> getPastOrders() {
        return pastOrders;
    }

    public ArrayList<Order> getCurrentOrders() {
        return currentOrders;
    }

    public void addToPastOrders(String orderId) {
        //TODO: Add trucks to FedEx
        for (Order order : currentOrders) {
            if (order.getSalesId().equals(orderId)) {
                pastOrders.add(order);
                currentOrders.remove(order);
                break;
            }
        }
    }

    public void addToCurrentOrders(Order order) {
        currentOrders.add(order);
    }

    public void removeFromCurrentOrders(String orderId) {
        for (Order order : currentOrders) {
            if (order.getSalesId().equals(orderId)) {
                currentOrders.remove(order);
                break;
            }
        }
    }
}
