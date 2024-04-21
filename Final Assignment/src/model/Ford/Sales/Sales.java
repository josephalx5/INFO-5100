package model.Ford.Sales;

import model.Configuration;

import java.util.ArrayList;

public class Sales {
    ArrayList<TruckOrder> pastOrders;
    ArrayList<TruckOrder> currentOrders;
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

    public ArrayList<TruckOrder> getPastOrders() {
        return pastOrders;
    }

    public ArrayList<TruckOrder> getCurrentOrders() {
        return currentOrders;
    }

    public void addToPastOrders(String orderId) {
        for (TruckOrder order : currentOrders) {
            if (order.getSalesId().equals(orderId)) {
                pastOrders.add(order);
                currentOrders.remove(order);
                Configuration.addTruckToShippingNetwork(order);
                break;
            }
        }
    }

    public void addToCurrentOrders(TruckOrder order) {
        currentOrders.add(order);
    }

    public void removeFromCurrentOrders(String orderId) {
        for (TruckOrder order : currentOrders) {
            if (order.getSalesId().equals(orderId)) {
                currentOrders.remove(order);
                break;
            }
        }
    }
}
