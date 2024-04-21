package model.Freight;

import model.Organization;

import java.util.ArrayList;

public class FedEx extends Organization {
    private final ArrayList<Truck> trucks;
    private final ArrayList<Driver> drivers;
    private final ArrayList<Order> orders;

    public FedEx(String name) {
        super(name);
        this.trucks = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return super.getName();
    }

    public Truck addTruck(Truck truck) {
        trucks.add(truck);
        return truck;
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(String driverId) {
        for (Driver driver : drivers) {
            if (driver.getDriverId().equals(driverId)) {
                drivers.remove(driver);
                break;
            }
        }
    }

    public void removeTruck(String truckId) {
        for (Truck truck : trucks) {
            if (truck.getTruckId().equals(truckId)) {
                trucks.remove(truck);
                break;
            }
        }
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                orders.remove(order);
                break;
            }
        }
    }
}
