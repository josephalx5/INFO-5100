package model.Bank.Insurance;

public class Insurance {
    private final String insuranceId;
    private final int valueOfVehicle;
    private final int averageDriverScore;
    private int insuranceQuote;


    public Insurance(int valueOfVehicle, int averageDriverScore, int insuranceQuote) {
        this.valueOfVehicle = valueOfVehicle;
        this.averageDriverScore = averageDriverScore;
        this.insuranceQuote = insuranceQuote;
        this.insuranceId = java.util.UUID.randomUUID().toString();
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public int getValueOfVehicle() {
        return valueOfVehicle;
    }

    public int getAverageDriverScore() {
        return averageDriverScore;
    }

    public int getInsuranceQuote() {
        return insuranceQuote;
    }

    public void setInsuranceQuote(int insuranceQuote) {
        this.insuranceQuote = insuranceQuote;
    }
}
