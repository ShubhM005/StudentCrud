package com.example.StudentCRUD.services;

import com.example.StudentCRUD.model.Student;

public interface StudentServices {
public void saveStudent(Student student); 
public Student getStudent(int id);
public void deleteStudent(int id);

}
