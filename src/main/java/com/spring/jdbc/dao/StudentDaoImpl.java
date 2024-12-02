package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Student student) {
        String query = "insert into student (id,name,city) values (?,?,?)";
        return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    public int update(Student student){
        String query = "update student set name=?,city=? where id=?";
        return this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }
}
