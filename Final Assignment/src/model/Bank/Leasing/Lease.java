package model.Bank.Leasing;

import model.Organization;

public class Lease {
    private String leaseId;
    private int leaseTerm;
    private int termLeft;
    private double leaseAmount;
    private double interestRate;
    private Organization organization;

    public Lease(int leaseTerm, double leaseAmount, double interestRate, Organization organization) {
        this.leaseId = java.util.UUID.randomUUID().toString();
        this.leaseTerm = leaseTerm;
        this.leaseAmount = leaseAmount;
        this.interestRate = interestRate;
        this.organization = organization;
        this.termLeft = leaseTerm;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public void setLeaseId(String leaseId) {
        this.leaseId = leaseId;
    }

    public int getLeaseTerm() {
        return leaseTerm;
    }

    public void setLeaseTerm(int leaseTerm) {
        this.leaseTerm = leaseTerm;
    }

    public double getLeaseAmount() {
        return leaseAmount;
    }

    public void setLeaseAmount(double leaseAmount) {
        this.leaseAmount = leaseAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public int getTermLeft() {
        return termLeft;
    }

    public void setTermLeft(int termLeft) {
        this.termLeft = termLeft;
    }
}
