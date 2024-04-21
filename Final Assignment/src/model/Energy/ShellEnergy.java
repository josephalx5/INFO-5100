package model.Energy;

import model.Organization;

import java.util.ArrayList;

public class ShellEnergy extends Organization {
    private final ArrayList<RefuelingStation> refuelingStations;


    public ShellEnergy(String name) {
        super(name);
        this.refuelingStations = new ArrayList<>();
    }

    public String getName() {
        return super.getName();
    }

    public ArrayList<RefuelingStation> getRefuelingStations() {
        return refuelingStations;
    }

    public void addRefuelingStations(RefuelingStation refuelingStations) {
        this.refuelingStations.add(refuelingStations);
    }

    public void removeRefuelingStation(int refuelingStationIndex) {
        this.refuelingStations.remove(refuelingStationIndex);
    }

    public ArrayList<RefuelingStation> getRefuelingStationsWithinLocation(String state) {
        ArrayList<RefuelingStation> refuelingStationsWithinLocation = new ArrayList<>();
        for (RefuelingStation refuelingStation : refuelingStations) {
            if (refuelingStation.getLocation().getState().equals(state)) {
                refuelingStationsWithinLocation.add(refuelingStation);
            }
        }
        return refuelingStationsWithinLocation;
    }
}
