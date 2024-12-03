package com.springorm.dao;

import com.springorm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    // save student
    @Transactional
    public int insert(Student student){
        int i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    // Update Student in Database
    @Transactional
    public void updateStudent(Student student){
        this.hibernateTemplate.update(student);
    }

    // Get single Data Object
    public Student getStudent(int studentId){
         return this.hibernateTemplate.get(Student.class,studentId);
    }

    // Get All records from database
    public List<Student> getStudent(){
        return this.hibernateTemplate.loadAll(Student.class);
    }

    // Delete student from db
    @Transactional
    public void deleteStudent(int studentId){
        Student student = this.hibernateTemplate.get(Student.class,studentId);
        this.hibernateTemplate.delete(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
