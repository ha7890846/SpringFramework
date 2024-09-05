package Assignment.assignment1.Myservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
   private Tyres tyre;
    @Autowired
   private Speakers speaker;
   public VehicleService(Tyres tyre, Speakers speaker) {
       this.tyre = tyre;
       this.speaker = speaker;
   }

    public Tyres getTyre() {
        return tyre;
    }

    public void setTyre(Tyres tyre) {
        this.tyre = tyre;
    }

    public Speakers getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speakers speaker) {
        this.speaker = speaker;
    }
    public void musicFn(){
        System.out.println("Music Service with: " + speaker);
    }
    public void run(){
        System.out.println("Vehicle is Running with : " + tyre);
    }
}
