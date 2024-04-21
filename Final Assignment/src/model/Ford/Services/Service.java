package model.Ford.Services;

import model.Configuration;
import model.Freight.Truck;

import java.util.ArrayList;

public class Service {
    ArrayList<ServiceRequest> serviceRequests;
    ArrayList<ServiceRequest> completedServiceRequests;
    ArrayList<Truck> prospectiveTrucks;

    public Service() {
        serviceRequests = new ArrayList<>();
        completedServiceRequests = new ArrayList<>();
        prospectiveTrucks = new ArrayList<>();
        populateCompletedServiceRequests();
    }

    private void populateCompletedServiceRequests() {
        for(int i = 0; i < 5; i++) {
            completedServiceRequests.add(new ServiceRequest(1000+i));
        }
    }

    public ArrayList<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public ArrayList<ServiceRequest> getCompletedServiceRequests() {
        return completedServiceRequests;
    }

    public void markServiceRequestComplete(String serviceId) {
        for (ServiceRequest serviceRequest : serviceRequests) {
            if (serviceRequest.getServiceId().equals(serviceId)) {
                completedServiceRequests.add(serviceRequest);
                serviceRequests.remove(serviceRequest);
                break;
            }
        }
    }

    public void addServiceRequest(ServiceRequest serviceRequest) {
        serviceRequests.add(serviceRequest);
    }

    public void removeServiceRequest(String serviceId) {
        for (ServiceRequest serviceRequest : serviceRequests) {
            if (serviceRequest.getServiceId().equals(serviceId)) {
                serviceRequests.remove(serviceRequest);
                break;
            }
        }
    }

    public ArrayList<Truck> getProspectiveTrucks() {
        System.out.println("Getting prospective trucks");
        Configuration.getShippingNetwork().getTrucks().forEach(truck -> {
            int mileage = truck.getMileage();
            if (mileage%20000!=0) {
                prospectiveTrucks.add(truck);
            }
        });
        return prospectiveTrucks;
    }
}
