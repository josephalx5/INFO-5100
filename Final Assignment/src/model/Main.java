package model;

import model.Ford.Ford;

public class Main {
    public static void main(String[] args) {
        Ford ford = Configuration.getManufacturer();
        System.out.println(Configuration.getPurchase());
        System.out.println(Configuration.getShippingNetwork());
        System.out.println(Configuration.getPurchase());
        System.out.println(ford.getService().getProspectiveTrucks());
    }
}
