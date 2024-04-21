package model.Ford.Services;

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
        //TODO: Add logic to get prospective trucks
        return prospectiveTrucks;
    }
}
