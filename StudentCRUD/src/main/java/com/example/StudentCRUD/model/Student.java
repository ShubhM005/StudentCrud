package com.example.StudentCRUD.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student_data")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
 private int studentId;
 
	@Column(name="FirstName")
 private String studentFirstName;
	@Column(name="LastName")
 private String studentLastName;
	@Column(name="Mobile_Number")
 private long studentMobile;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
 
	public String getStudentFirstName() {
		return studentFirstName;
	}
	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}
	public String getStudentLastName() {
		return studentLastName;
	}
	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ",  studentFirstName="
				+ studentFirstName + ", studentLastName=" + studentLastName + ", studentMobile=" + studentMobile + "]";
	}
 
 
}
