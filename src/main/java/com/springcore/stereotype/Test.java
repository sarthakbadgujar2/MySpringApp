package com.springcore.stereotype;

import com.springcore.ci.Addition;
import com.springcore.ci.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("sterotypeConfig.xml");
        Student s = context.getBean("student", Student.class);
        System.out.println(s);
        System.out.println(s.getAddress());
        System.out.println(s.getAddress().getClass().getName());

        // Singleton object return by spring as same hash code is getting printed for both objects
        System.out.println(s.hashCode());
        Student s1 = context.getBean("student",Student.class);
        System.out.println(s1.hashCode());

        Teacher t = context.getBean("teacher",Teacher.class);
        System.out.println(t.hashCode());
        Teacher t1 = context.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());
    }
}
