package Assignment.assignment1;

import Assignment.assignment1.MyEntities.Person;
import Assignment.assignment1.MyEntities.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
        Person person = context.getBean("person", Person.class);
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        person.setName("kabir Singh");
        System.out.println(person.getName() + " owns the vehicle: " + person.getVehicle());
        person.getVehicle().runVehicle();
        person.getVehicle().playMusic();
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("\n Beans in IOC container: ");
        for (String beanName : beanNames) {
            System.out.println("Bean name: " + beanName);
        }

    }
}
