package model.Bank.Insurance;

public class InsurancePredictor {
    private final int averageDriverScore;
    private final int valueOfVehicle;

    public InsurancePredictor(int averageDriverScore, int valueOfVehicle) {
        this.averageDriverScore = averageDriverScore;
        this.valueOfVehicle = valueOfVehicle;
    }

    public Insurance getInsuranceQuote() {
        // TODO: Add insurance to Truck
        int insuranceQuote = (500 * averageDriverScore * (valueOfVehicle / 10000)) / 10;
        System.out.println("Insurance Quote: " + insuranceQuote);
        return new Insurance(valueOfVehicle, averageDriverScore, insuranceQuote);
    }
}
