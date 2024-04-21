package model.Ford.Sales;

public class Order {
    private final String salesId;
    private int valueOfVehicle;

    public Order(int valueOfVehicle) {
        this.salesId = java.util.UUID.randomUUID().toString();
        this.valueOfVehicle = valueOfVehicle;
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
