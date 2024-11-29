package com.springcore.lifecycle;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import org.example.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("ciSamosaConfig.xml");
        Samosa samosa = (Samosa) context.getBean("s1");
        System.out.println(samosa);
        System.out.println("================================================");
        context.registerShutdownHook();
        Pavvada pavvada = (Pavvada) context.getBean("p1");
        System.out.println(pavvada);

        System.out.println("==============Example=======================");
        Example ex = (Example) context.getBean("example");
        System.out.println(ex);


    }
}
