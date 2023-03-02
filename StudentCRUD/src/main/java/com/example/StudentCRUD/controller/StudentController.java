package com.example.StudentCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.servicesimplement.StudentImple;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
  StudentImple stServ;

//saving data of student
@PostMapping("/save")
public Student saveStudent(@RequestBody Student student) {
	stServ.saveStudent(student);
	return student; 
}


//update data 
@PutMapping("/update")
public Student updateStudent(@RequestBody Student student) {
	stServ.saveStudent(student);
	return student; 
	
}

//get data from DB
@GetMapping("/get/{id}")
public Student getStudent(@PathVariable("id")int id) {
	Student student=stServ.getStudent(id);
	return student; 
}

//delete data 
@DeleteMapping("/delete/{id}")
public String deleteSnt(@PathVariable("id")int id) {
	stServ.deleteStudent(id);
	return ("id: "+id +" deleted Successfully.");
}
}
