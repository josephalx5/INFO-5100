package model.Ford.Services;

public class ServiceRequest {
    private final String serviceId;
    private final int serviceCost;

    public ServiceRequest(int serviceCost) {
        this.serviceId = java.util.UUID.randomUUID().toString();
        this.serviceCost = serviceCost;
    }

    public String getServiceId() {
        return serviceId;
    }

    public int getServiceCost() {
        return serviceCost;
    }
}
