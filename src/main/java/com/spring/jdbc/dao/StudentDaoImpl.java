package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
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

    public int delete(int studentId){
        String query = "delete from student where id=?";
        return this.jdbcTemplate.update(query,studentId);
    }

    public Student getStudent(int studentId){
        String query = "Select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        return this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
    }

    public List<Student> getAllStudent(){
        String query = "Select * from student";
        return this.jdbcTemplate.query(query,new RowMapperImpl());
    }
}
