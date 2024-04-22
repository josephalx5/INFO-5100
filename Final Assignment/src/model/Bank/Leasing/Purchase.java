package model.Bank.Leasing;

import model.Configuration;

import java.util.ArrayList;
import java.util.HashMap;

public class Purchase {
    private final ArrayList<Lease> leases;
    private final HashMap<String, Integer> creditScore;
    private final ArrayList<Lease> newLeaseRequests;

    public Purchase() {
        this.leases = new ArrayList<>();
        this.creditScore = new HashMap<>();
        this.newLeaseRequests = new ArrayList<>();
    }

    public ArrayList<Lease> getLeases() {
        return leases;
    }

    public void addLease(Lease lease) {
        leases.add(lease);
    }

    public void removeLease(String leaseId) {
        for (Lease lease : leases) {
            if (lease.getLeaseId().equals(leaseId)) {
                leases.remove(lease);
                break;
            }
        }
    }

    public void addCreditScore(String customerId, int score) {
        creditScore.put(customerId, score);
    }

    public int getCreditScore(String customerId) {
        return creditScore.get(customerId);
    }

    public void removeCreditScore(String customerId) {
        creditScore.remove(customerId);
    }

    public HashMap<String, Integer> getCreditScore() {
        return creditScore;
    }

    public void addNewLeaseRequest(Lease lease) {
        newLeaseRequests.add(lease);
    }

    public void acceptLeaseRequest(String leaseId) {
        for (Lease lease : newLeaseRequests) {
            if (lease.getLeaseId().equals(leaseId)) {
                leases.add(lease);
                newLeaseRequests.remove(lease);
                Configuration.addPurchaseRequestToManufacturer(lease);
                break;
            }
        }
    }
}
