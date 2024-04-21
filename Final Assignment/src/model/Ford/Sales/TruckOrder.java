package model.Ford.Sales;

public class TruckOrder {
    private final String salesId;
    private double valueOfVehicle;

    public TruckOrder(double valueOfVehicle) {
        this.salesId = java.util.UUID.randomUUID().toString();
        this.valueOfVehicle = valueOfVehicle;
    }

    public String getSalesId() {
        return salesId;
    }

    public double getValueOfVehicle() {
        return valueOfVehicle;
    }

    public void setValueOfVehicle(double valueOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
    }
}
