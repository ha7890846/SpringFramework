package Assignment.assignment1.MyEntities;

import Assignment.assignment1.Myservice.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    @Autowired
    private VehicleService vcs;

    public VehicleService getVcs() {
        return vcs;
    }

    public void setVcs(VehicleService vcs) {
        this.vcs = vcs;
    }
    public void runVehicle(){
        vcs.run();
    }
    public void playMusic(){
        vcs.musicFn();
    }

    @Override
    public String toString() {
        return "Vehicle @ " + this.hashCode();
    }
}
