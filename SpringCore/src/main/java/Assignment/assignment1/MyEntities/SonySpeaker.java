package Assignment.assignment1.MyEntities;

import Assignment.assignment1.Myservice.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speakers {
    @Override
    public void makeSound(){
        System.out.println("Making sound Using SonySpeakers.");
    }

    @Override
    public String toString() {
        return "SonySpeaker @ " + hashCode();
    }
}
