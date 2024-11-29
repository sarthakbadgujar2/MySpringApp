package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // main fiile
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            Student student1 = (Student) context.getBean("student1");
            Student student2 = (Student) context.getBean("student2");
            Student student3 = (Student) context.getBean("student3");
            System.out.println(student1); // use value tag from config.xml
            System.out.println(student2); // using value attribute from config.xml
            System.out.println(student3); // using p schema from config.xml

        // Add any additional logic for using the context (e.g., retrieving beans)


    }
}