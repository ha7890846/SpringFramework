package Assignment.assignment1.MyEntities;

import Assignment.assignment1.Myservice.Speakers;

public class BoatSpeaker implements Speakers {
    @Override
    public void makeSound(){
        System.out.println("I'm speaking boat");
    }
}
