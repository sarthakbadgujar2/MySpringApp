package com.springorm.dao;

import com.springorm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    // save student
    @Transactional
    public int insert(Student student){
        int i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
