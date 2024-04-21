package model.Freight;

import java.util.UUID;

public class Truck {
    private final String truckId;
    private int truckCapacity;
    private FuelType fuelType;
    private int mileage;
    private String truckModel;
    private Driver driver;
    private boolean isTruckAvailable;

    public Truck(int truckCapacity, FuelType fuelType, int mileage, String truckModel) {
        this.truckId = UUID.randomUUID().toString();
        this.truckCapacity = truckCapacity;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.truckModel = truckModel;
        this.isTruckAvailable = true;
    }

    public String getTruckId() {
        return truckId;
    }

    public int getTruckCapacity() {
        return truckCapacity;
    }

    public void setTruckCapacity(int truckCapacity) {
        this.truckCapacity = truckCapacity;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTruckModel() {
        return truckModel;
    }

    public void setTruckModel(String truckModel) {
        this.truckModel = truckModel;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        driver.setDriverAvailable(false);
        this.driver = driver;
    }

    public boolean isTruckAvailable() {
        return isTruckAvailable;
    }

    public void setTruckAvailable(boolean truckAvailable) {
        isTruckAvailable = truckAvailable;
    }
}
