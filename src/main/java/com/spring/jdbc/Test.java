package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world learning JDBC");
        // JdbcTemplate Object

        ApplicationContext con = new ClassPathXmlApplicationContext("springjdbcConfig.xml");
        StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

        Student s = new Student();
        s.setId(333);
        s.setName("Rio");
        s.setCity("Mumbai");

        int result = studentDao.insert(s);
        System.out.println("Studnet added " + result);


    }
}
