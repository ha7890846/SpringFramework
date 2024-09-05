package org.myproject.Wiring;

public class Owner {
    private String owner_name;
    private Vehicle vehi;

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Vehicle getVehi() {
        return vehi;
    }

    public void setVehi(Vehicle vehi) {
        this.vehi = vehi;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "owner_name='" + owner_name + '\'' +
                ", vehi=" + vehi +
                '}';
    }
}
