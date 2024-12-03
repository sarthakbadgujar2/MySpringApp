package com.springorm;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("springorm.xml");
        StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

        Student s = new Student(111,"Sarthak Badgujar","NSK");

        int r = studentDao.insert(s);

        System.out.println("Inserted student"+r);
    }
}
