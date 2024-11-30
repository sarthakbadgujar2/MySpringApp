package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig") // this is used when we use @Component on the bean class then we need to use this annotation
public class JavaConfig {

    @Bean
    public Samosa getSamosa() {
        return new Samosa();
    }

    @Bean(name = {"student", "temp"})
    public Student getStudent() {
        // creating new student object
        return new Student(getSamosa());
    }


}
