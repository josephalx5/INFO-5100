package model.Ford;

import model.Ford.Sales.Sales;
import model.Ford.Services.Service;
import model.Organization;

public class Ford {
    private final Sales sales;
    private final Service service;

    public Ford() {
        this.sales = new Sales();
        this.service = new Service();
    }

    public Sales getSales() {
        return sales;
    }

    public Service getService() {
        return service;
    }
}
