package com.example.StudentCRUD.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentCRUD.dao.StudentRepository;
import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.services.StudentServices;
@Service
public class StudentImple implements StudentServices {
  @Autowired
	StudentRepository stRepo;
	
	@Override
	public void saveStudent(Student student) {
		 stRepo.save(student);	 
	}

	@Override
	public Student getStudent(int rollNum) {
		Student student=stRepo.getStudent(rollNum);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		 stRepo.deleteById(id);
		 
	}

}
