package model.Freight;

public class Route {
    private String startLocation;
    private String endLocation;
    private int distance;
    private double duration;
    private final String routeId;

    public Route(String startLocation, String endLocation, int distance, double duration) {
        routeId = java.util.UUID.randomUUID().toString();
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.duration = duration;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
