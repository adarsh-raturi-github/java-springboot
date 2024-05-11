package com.adarsh.springjdbc.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.adarsh.springjdbc.models.Student;

@Repository
public class StudentRepository {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void save(Student student)
    {
     String query="insert into student(rollNo,marks,name) values(?,?,?)";
     int rows= jdbcTemplate.update(query,student.getRollNo(),student.getMarks(),student.getName());
     System.out.println(rows+"effected");
    }

    public List<Student> findAll()
    {
        String query="select * from student";

        RowMapper<Student> rowMapper=(ResultSet rs,int rowNum)-> {
        
            Student student = new Student();
       student.setRollNo(rs.getInt("rollno")); // name here is db column name
       student.setName(rs.getString("name"));
       student.setMarks(rs.getInt("marks"));
        
       return student;
        };
         
        return jdbcTemplate.query(query,rowMapper);
   }
}
