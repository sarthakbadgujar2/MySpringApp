package com.spring.jdbc;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world learning JDBC");
        // JdbcTemplate Object

        ApplicationContext con = new ClassPathXmlApplicationContext("springjdbcConfig.xml");
        StudentDao studentDao = con.getBean("studentDao", StudentDao.class);

        // Insert student into database
//        Student s = new Student();
//        s.setId(333);
//        s.setName("Rio");
//        s.setCity("Mumbai");
//
//        int result = studentDao.insert(s);
//        System.out.println("Studnet added " + result);

        // Update record into database
//        Student s1 = new Student();
//        s1.setName("Sarthak Updated");
//        s1.setCity("Amalner");
//        s1.setId(333);
//        int result = studentDao.update(s1);
//        System.out.println("Data changed "+ result);

        // Delete record from database

//        Student s2= new Student();
//        s2.setId(333);
//        int res = studentDao.delete(s2.getId());
//        System.out.println("Student record delete from DB"+res);

        // Get the single student from database
        Student student = studentDao.getStudent(444);
        System.out.println(student);

        // Get All students
        List<Student> students = studentDao.getAllStudent();
        System.out.println(students);
    }
}
