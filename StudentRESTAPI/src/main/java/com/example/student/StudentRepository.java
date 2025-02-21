package com.example.student;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

	@Autowired
	private Map<Integer,Student> students = new HashMap<>();	
	
	public StudentRepository(Map<Integer, Student> students) {
        this.students = students;
    }
	public Map<Integer,Student> getAllStudents(){
		return students;
	}
	
	public Student addStudent(Student student) {
		return students.put(student.getId(), student);
	}
	
	public Student findById(int id) {
		return students.get(id);	
	}
	
	public Student deleteById(int id) {
		return students.remove(id);
	}
	
	public void updateStudent(int id, Student updatedStudent) {
		if (students.containsKey(id)) {
			students.put(id, updatedStudent);
		}
	}
	
	
	

}
