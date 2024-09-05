package org.myproject.Wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {
    @Bean
    public Owner owner(){
        Owner owner = new Owner();
        owner.setOwner_name("Arjun");
        owner.setVehi(vehicle());
        return owner;
    }
    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicle_name("Sedan 220");
        return vehicle;
    }
}
