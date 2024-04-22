package model;

import model.Bank.Insurance.Insurance;
import model.Bank.Insurance.InsurancePredictor;
import model.Bank.Leasing.Lease;
import model.Bank.Leasing.Purchase;
import model.Energy.Location;
import model.Energy.RefuelingStation;
import model.Energy.ShellEnergy;
import model.Ford.Ford;
import model.Ford.Sales.TruckOrder;
import model.Ford.Services.ServiceRequest;
import model.Freight.*;
import model.Role.Person;
import model.Role.PersonDirectory;
import model.Role.RoleManager;

import java.util.ArrayList;
import java.util.Arrays;

public class Configuration {
    private static ShellEnergy refuelingNetwork;
    private static FedEx shippingNetwork;
    private static Ford manufacturer;
    private static Purchase purchase;
    private static PersonDirectory personDirectory;
    private static InsurancePredictor insurancePredictor;

    private static void init() {
        refuelingNetwork = new ShellEnergy("Shell");
        shippingNetwork = new FedEx("FedEx");
        manufacturer = new Ford();
        purchase = new Purchase();
        personDirectory = new PersonDirectory();
        initPersonDirectory();
        initFuelingNetwork();
        initShippingNetwork();
        initManufacturer();
        addLeaseToPurchase();
//        initInsurancePredictor();
    }

    private static void initPersonDirectory() {
        Person person1 = new Person(RoleManager.FLEET_MANAGER);
        person1.setUsername("Fleet Manager");
        Person person2 = new Person(RoleManager.RISK_ANALYST);
        person2.setUsername("Risk Analyst");
        Person person3 = new Person(RoleManager.SALES_MANAGER);
        person3.setUsername("Sales Manager");
        Person person4 = new Person(RoleManager.SERVICE_MANAGER);
        person4.setUsername("Service Manager");
        Person person5 = new Person(RoleManager.PURCHASE_MANAGER);
        person5.setUsername("Purchase Manager");
        Person person6 = new Person(RoleManager.BUSINESS_OPS_MANAGER);
        person6.setUsername("Operations Manager");
        personDirectory.addPerson(person1);
        personDirectory.addPerson(person2);
        personDirectory.addPerson(person3);
        personDirectory.addPerson(person4);
        personDirectory.addPerson(person5);
        personDirectory.addPerson(person6);
    }
    public static ShellEnergy getRefuelingNetwork() {
        if (refuelingNetwork == null) {
            init();
        }
        return refuelingNetwork;
    }

    public static FedEx getShippingNetwork() {
        if (shippingNetwork == null) {
            init();
        }
        return shippingNetwork;
    }

    public static Ford getManufacturer() {
        if (manufacturer == null) {
            init();
        }
        return manufacturer;
    }

    public static Purchase getPurchase() {
        if (purchase == null) {
            init();
        }
        return purchase;
    }

    private static void initFuelingNetwork() {
        ArrayList<String> foodOptions = new ArrayList<>(Arrays.asList("Dunkin Donuts", "Subway", "Starbucks"));
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station1",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("1234 Shell Street", "Suite 100", "Houston", "TX", "77001"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station2",
                        true,
                        foodOptions,
                        true,
                        true,
                        new Location("5678 Shell Street", "Suite 200", "Austin", "TX", "78701"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station3",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("9101 Shell Street", "Suite 300", "Boston", "MA", "75201"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station4",
                        true,
                        foodOptions,
                        true,
                        true,
                        new Location("1122 Shell Street", "Suite 400", "New York", "NY", "10001"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station5",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("3344 Shell Street", "Suite 500", "San Francisco", "CA", "94101"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station6",
                        true,
                        foodOptions,
                        true,
                        true,
                        new Location("5566 Shell Street", "Suite 600", "Seattle", "WA", "98101"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station7",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("7788 Shell Street", "Suite 700", "Chicago", "IL", "60601"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station8",
                        true,
                        foodOptions,
                        true,
                        true,
                        new Location("9900 Shell Street", "Suite 800", "Miami", "FL", "33101"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station9",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("1122 Shell Street", "Suite 900", "Denver", "CO", "80201"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station10",
                        true,
                        foodOptions,
                        true,
                        true,
                        new Location("3344 Shell Street", "Suite 1000", "Portland", "OR", "97201"),
                        true
                )
        );
        refuelingNetwork.addRefuelingStations(new RefuelingStation(
                        "Shell Station11",
                        true,
                        foodOptions,
                        true,
                        false,
                        new Location("5566 Shell Street", "Suite 1100", "Phoenix", "AZ", "85001"),
                        true
                )
        );
    }

    private static void initShippingNetwork() {
        // Adding trucks to the shipping network
        shippingNetwork.addTruck(new Truck(7, FuelType.GASOLINE, 10000, "Volvo"));
        shippingNetwork.addTruck(new Truck(7, FuelType.ELECTRIC, 20000, "Mercedes"));
        shippingNetwork.addTruck(new Truck(7, FuelType.GASOLINE, 30000, "Ford"));
        shippingNetwork.addTruck(new Truck(7, FuelType.ELECTRIC, 40000, "Ford"));
        shippingNetwork.addTruck(new Truck(7, FuelType.GASOLINE, 50000, "Ford"));
        shippingNetwork.addTruck(new Truck(7, FuelType.ELECTRIC, 60000, "Ford"));

        // Adding orders to the shipping network
        shippingNetwork.addOrder(new Order("09/04/2024", "10/04/2024", 10000,
                new Route("Boston", "New York", 310, 10)
                , 6));
        shippingNetwork.addOrder(new Order("09/04/2024", "11/04/2024", 20000,
                new Route("New York", "Boston", 310, 10)
                , 5));
        shippingNetwork.addOrder(new Order("09/04/2024", "12/04/2024", 30000, new Route("Waltham", "New York", 310, 10)
                , 7));
        shippingNetwork.addOrder(new Order("09/04/2024", "13/04/2024", 40000, new Route("philadelphia", "Boston", 310, 12),
                7));
        shippingNetwork.addOrder(new Order("09/04/2024", "14/04/2024", 50000, new Route("New York", "Boston", 200, 13),
                3));
        shippingNetwork.addOrder(new Order("09/04/2024", "15/04/2024", 60000, new Route("Baltimore", "Boston", 600, 10),
                7));
        // Adding drivers to the shipping
        shippingNetwork.addDriver(new Driver("John Doe", 8));
        shippingNetwork.addDriver(new Driver("Jones Doe", 9));
        shippingNetwork.addDriver(new Driver("Jeremy Clarkson", 10));
        shippingNetwork.addDriver(new Driver("James May", 8));
        shippingNetwork.addDriver(new Driver("Richard Hammond", 9));
    }

    private static void initManufacturer() {
        manufacturer.getService().addServiceRequest(
                new ServiceRequest(2000)
        );
        manufacturer.getService().addServiceRequest(
                new ServiceRequest(3000)
        );
        manufacturer.getService().addServiceRequest(
                new ServiceRequest(4000)
        );
    }

    private static Insurance initInsurancePredictor(TruckOrder truckOrder) {
        int averageDriverScore = shippingNetwork.getDrivers().stream().mapToInt(Driver::getDriverSafetyRating).sum() / shippingNetwork.getDrivers().size();
        return new InsurancePredictor(averageDriverScore, (int) truckOrder.getValueOfVehicle()).getInsuranceQuote();
    }

    private static void addLeaseToPurchase() {
        purchase.addLease(new Lease(4, 10000, 0.8, shippingNetwork));
        purchase.addLease(new Lease(5, 20000, 0.9, shippingNetwork));
        purchase.addLease(new Lease(6, 30000, 0.7, shippingNetwork));
        purchase.addLease(new Lease(7, 40000, 0.6, shippingNetwork));
        purchase.addLease(new Lease(8, 50000, 0.5, shippingNetwork));
    }
    public static void addLeaseRequestToBank() {
        purchase.addNewLeaseRequest(new Lease(4, 10000, 0.8, shippingNetwork));
    }

    public static void addTruckToShippingNetwork(TruckOrder truckOrder) {
        Truck truck = new Truck(7, FuelType.ELECTRIC, 70000, "Ford");
        truck.setInsurance(initInsurancePredictor(truckOrder));
        shippingNetwork.addTruck(truck);
    }

    public static void addPurchaseRequestToManufacturer(Lease lease) {
        manufacturer.getSales().addToCurrentOrders(new TruckOrder(lease.getLeaseAmount()));
    }
    public static PersonDirectory getPersonDirectory() {
        if (personDirectory == null) {
            init();
        }
        return personDirectory;
    }

}
