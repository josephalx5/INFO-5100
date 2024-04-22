package model.Ford.Sales;

public class Order {
    private final String salesId;
    private int valueOfVehicle;
    private String model;

    public Order(int valueOfVehicle) {
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

    public int getValueOfVehicle() {
        return valueOfVehicle;       
    }

    public void setValueOfVehicle(int valueOfVehicle) {
        this.valueOfVehicle = valueOfVehicle;
    }
}
