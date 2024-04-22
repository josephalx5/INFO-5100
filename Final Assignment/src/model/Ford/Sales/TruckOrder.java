package model.Ford.Sales;

public class TruckOrder {
    private final String salesId;
    private double valueOfVehicle;
    private String model;

    public TruckOrder(double valueOfVehicle) {
        this.salesId = java.util.UUID.randomUUID().toString();
        this.valueOfVehicle = valueOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
