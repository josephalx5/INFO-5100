package model.Freight;

import model.Role.Person;
import model.Role.RoleManager;

import java.util.ArrayList;
import java.util.UUID;

public class Driver extends Person {
    private final String driverId;
    private String driverName;
    private int driverSafetyRating;
    private int hoursWorked;
    private final ArrayList<Order> previousRoutes;
    private Order currentOrder;
    private boolean isDriverAvailable;

    public Driver(String driverName, int driverSafetyRating) {
        super(RoleManager.DRIVER);
        super.setUsername(driverName);
        this.driverId = UUID.randomUUID().toString();
        this.driverName = driverName;
        this.driverSafetyRating = driverSafetyRating;
        this.hoursWorked = 0;
        this.previousRoutes = new ArrayList<>();
        this.isDriverAvailable = true;
    }

    public String getDriverId() {
        return driverId;
    }

    public ArrayList<Order> getPreviousRoutes() {
        return previousRoutes;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getDriverSafetyRating() {
        return driverSafetyRating;
    }

    public void setDriverSafetyRating(int driverSafetyRating) {
        this.driverSafetyRating = driverSafetyRating;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void addPreviousRoute(Order order) {
        previousRoutes.add(order);
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        isDriverAvailable = driverAvailable;
    }

    public boolean isDriverAvailable() {
        return isDriverAvailable;
    }
}
