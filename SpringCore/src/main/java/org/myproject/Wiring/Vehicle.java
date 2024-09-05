package org.myproject.Wiring;

public class Vehicle {
    private String vehicle_name;

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    @Override
    public String toString() {
        return "vehicle_name='" + vehicle_name + '\'' +'}';
    }
}
