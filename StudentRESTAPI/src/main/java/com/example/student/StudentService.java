package com.example.student;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private final StudentRepository StudentRepository;

    public StudentService(StudentRepository StudentRepository) {
		super();
		this.StudentRepository = StudentRepository;
	}

	public void addStudent(Student student) {
		StudentRepository.addStudent(student);
    }

	public Map<Integer,Student> getAllStudents(){
		return StudentRepository.getAllStudents();
	}
	

    public Student findById(int id) {
        return StudentRepository.findById(id);
    }

    public void updateStudent(int id, Student updatedStudent) {
       StudentRepository.updateStudent(id, updatedStudent);
    }

    public void deleteStudent(int id) {
        StudentRepository.deleteById(id);
    }
	
	

}
