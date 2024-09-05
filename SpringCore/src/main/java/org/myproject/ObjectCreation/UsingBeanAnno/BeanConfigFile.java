package org.myproject.ObjectCreation.UsingBeanAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigFile {
    @Bean
    public Person person(){
        return new Person();
    }
    @Bean
    public Vehicle vehicle(){
        return new Vehicle();
    }
}
