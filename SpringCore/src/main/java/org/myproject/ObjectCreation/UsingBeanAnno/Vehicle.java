package org.myproject.ObjectCreation.UsingBeanAnno;

public class Vehicle {
    private int vehicleId;
    private String vehicleName;

    public Vehicle() {
        System.out.println("Vehicle Constructor");
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + "]";
    }
}
