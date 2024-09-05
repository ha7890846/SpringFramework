package Assignment.assignment1.MyEntities;

import Assignment.assignment1.Myservice.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyres {
    @Override
    public void rotate(){
        System.out.println("Micheline Tyres are Rotating");
    }

    @Override
    public String toString() {
        return "MichelinTyre @ " + this.hashCode();
    }
}
