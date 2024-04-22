package model.Freight;

public class Order {
    private final String orderId;
    private OrderStatus orderStatus;
    private String orderDate;
    private String deliveryDate;
    private int orderAmount;
    private Route route;
    private int orderCapacity;
    private Truck truck;

    public Order(String orderDate, String deliveryDate, int orderAmount, Route route, int orderCapacity) {
        this.orderId = java.util.UUID.randomUUID().toString();
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.orderAmount = orderAmount;
        this.route = route;
        this.orderCapacity = orderCapacity;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getOrderCapacity() {
        return orderCapacity;
    }

    public void setOrderCapacity(int orderCapacity) {
        this.orderCapacity = orderCapacity;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
        this.truck.setCurrentOrder(this);
    }
}
