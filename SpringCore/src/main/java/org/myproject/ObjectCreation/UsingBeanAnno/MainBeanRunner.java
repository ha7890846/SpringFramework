package org.myproject.ObjectCreation.UsingBeanAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBeanRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigFile.class);
        System.out.println("Notice that we have not created any instance " +
                "still the constructor called in spring pool.");
        // ref created obj to a type obj.
        Person person_obj = context.getBean(Person.class);
        Vehicle vehicle_obj = context.getBean(Vehicle.class);
        System.out.println(person_obj);
        System.out.println(vehicle_obj);

           
    }
}
