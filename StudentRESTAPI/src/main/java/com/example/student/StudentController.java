package com.example.student;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	@Autowired
    private final StudentService StudentService;

    public StudentController(StudentService StudentService) {
        this.StudentService = StudentService;
    }

    // Yyeni ogrenci ekleme
    @PostMapping
    public String addStudent(@RequestBody Student student) {
        StudentService.addStudent(student);
        return "ogrenci eklendi";
    }

    // tüm ogrencileri getirme
    @GetMapping
    public Map<Integer,Student> getAllStudents() {
        return StudentService.getAllStudents();
    }

    // verilen idye göre ogrenciyi getirme
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return StudentService.findById(id);
    }

    // ogrenciyi güncelleme
    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        StudentService.updateStudent(id, updatedStudent);
        return "ogrenci guncellendi";
    }

    // ogrenciyi silme
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        StudentService.deleteStudent(id);
        return "ogrenci silindi";
    }


}
