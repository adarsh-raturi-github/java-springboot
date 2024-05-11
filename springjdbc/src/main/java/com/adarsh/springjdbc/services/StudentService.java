package com.adarsh.springjdbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsh.springjdbc.models.Student;
import com.adarsh.springjdbc.repositories.StudentRepository;

@Service
public class StudentService
{
    @Autowired
    private   StudentRepository studentRepository;
    public void addStudent(Student s)
    {
    this.studentRepository.save(s);
     
    }

    public List<Student> getAllStudents()
    {
  return this.studentRepository.findAll();
    }
}