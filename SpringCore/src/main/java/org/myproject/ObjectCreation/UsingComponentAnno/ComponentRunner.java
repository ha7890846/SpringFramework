package org.myproject.ObjectCreation.UsingComponentAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ComponentRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentRunner.class);
        System.out.println("Constuctor Callled while container loaded.");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Teacher teacher = (Teacher) context.getBean("teacher");
        System.out.println(teacher);
    }
}
