package com.springcore.ci;

import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Addition addd = (Addition) context.getBean("add");
        addd.doSum();
        // Add any additional logic for using the context (e.g., retrieving beans)


    }
}
