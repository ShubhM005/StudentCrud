package com.example.StudentCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.StudentCRUD.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value="select * from Student_data where Roll_Num=?1",nativeQuery=true)
	 public Student getStudent(int rollNum);
}
