package org.myproject.Wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        Owner owner_obj = context.getBean(Owner.class);
        Vehicle vehicle_obj = context.getBean(Vehicle.class);
        System.out.println(owner_obj);
        System.out.println("Owner owns the car of: " + owner_obj.getVehi());
        System.out.println(vehicle_obj);
    }
}
