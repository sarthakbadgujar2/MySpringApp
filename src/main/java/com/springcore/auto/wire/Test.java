package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autoConfig.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);

        // Add any additional logic for using the context (e.g., retrieving beans)


    }
}
