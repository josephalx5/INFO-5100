package model.Energy;

import java.util.ArrayList;

public class RefuelingStation {
    private String name;
    private boolean isRestroomAvailable;
    private ArrayList<String> foodOptions;
    private boolean isCarWashAvailable;
    private boolean isEvChargingAvailable;
    private boolean isGasAvailable;
    private Location location;


    public RefuelingStation(String name, boolean isRestroomAvailable, ArrayList<String> foodOptions, boolean isCarWashAvailable, boolean isEvChargingAvailable, Location location, boolean isGasAvailable) {
        this.name = name;
        this.isRestroomAvailable = isRestroomAvailable;
        this.foodOptions = foodOptions;
        this.isCarWashAvailable = isCarWashAvailable;
        this.isEvChargingAvailable = isEvChargingAvailable;
        this.location = location;
        this.isGasAvailable = isGasAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isRestroomAvailable() {
        return isRestroomAvailable;
    }

    public void setRestroomAvailable(boolean restroomAvailable) {
        isRestroomAvailable = restroomAvailable;
    }

    public ArrayList<String> getFoodOptions() {
        return foodOptions;
    }

    public void setFoodOptions(ArrayList<String> foodOptions) {
        this.foodOptions = foodOptions;
    }

    public boolean isCarWashAvailable() {
        return isCarWashAvailable;
    }

    public void setCarWashAvailable(boolean carWashAvailable) {
        isCarWashAvailable = carWashAvailable;
    }

    public boolean isEvChargingAvailable() {
        return isEvChargingAvailable;
    }

    public void setEvChargingAvailable(boolean evChargingAvailable) {
        isEvChargingAvailable = evChargingAvailable;
    }

    public boolean isGasAvailable() {
        return isGasAvailable;
    }

    public void setGasAvailable(boolean gasAvailable) {
        isGasAvailable = gasAvailable;
    }
}
