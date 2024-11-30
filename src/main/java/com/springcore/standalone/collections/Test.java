package com.springcore.standalone.collections;

import collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sandaloneCollectionConfig.xml");
        Person p1=(Person) applicationContext.getBean("person");
        System.out.println(p1);
        System.out.println(p1.getFriends().getClass().getName());
        System.out.println(p1.getFeesStructure().getClass().getName());
        System.out.println("++++++++++++");
        System.out.println(p1.getProp());
        System.out.println(p1.getProp().getClass().getName());
    }
}
